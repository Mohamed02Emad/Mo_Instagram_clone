package com.mo_insta.instagramclone.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.mo_insta.instagramclone.R
import com.mo_insta.instagramclone.data.models.Story
import com.mo_insta.instagramclone.databinding.SavedStoryBinding

class StoriesAdapter : RecyclerView.Adapter<StoriesAdapter.StoriesViewHolder>() {

    private val differCallBack = object : DiffUtil.ItemCallback<Story>() {
        override fun areItemsTheSame(oldItem: Story, newItem: Story): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: Story, newItem: Story): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallBack)

    inner class StoriesViewHolder(val binding: SavedStoryBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StoriesAdapter.StoriesViewHolder {
        return StoriesViewHolder(
            SavedStoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: StoriesAdapter.StoriesViewHolder, position: Int) {
        val story = differ.currentList[position]
        holder.binding.apply {
            tvUserName.text = story.title
            Glide.with(ivProfileImage)
                .load(story.image)
                .transition(DrawableTransitionOptions.withCrossFade())
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(ivProfileImage)
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

}