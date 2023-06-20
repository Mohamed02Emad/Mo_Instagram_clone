package com.mo_insta.instagramclone.presentation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.mo_insta.instagramclone.data.models.Story
import com.mo_insta.instagramclone.databinding.HomeStoryBinding
import com.mo_insta.instagramclone.databinding.SavedStoryBinding

class HomeStoriesAdapter : RecyclerView.Adapter<HomeStoriesAdapter.StoriesViewHolder>() {

    private val differCallBack = object : DiffUtil.ItemCallback<Story>() {
        override fun areItemsTheSame(oldItem: Story, newItem: Story): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: Story, newItem: Story): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallBack)

    inner class StoriesViewHolder(val binding: HomeStoryBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HomeStoriesAdapter.StoriesViewHolder {
        return StoriesViewHolder(
            HomeStoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: HomeStoriesAdapter.StoriesViewHolder, position: Int) {
        val story = differ.currentList[position]
        holder.binding.apply {
            tvUserName.text = story.title
            Glide.with(ivProfileImage)
                .load(story.image)
                .transition(DrawableTransitionOptions.withCrossFade())
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(ivProfileImage)
        }
        if (position == 0){
            holder.binding.gradientBackground.visibility= View.INVISIBLE
        }else{
            holder.binding.gradientBackground.visibility= View.VISIBLE
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

}