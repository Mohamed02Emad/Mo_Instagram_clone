package com.mo_insta.instagramclone.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.mo_insta.instagramclone.data.models.Post
import com.mo_insta.instagramclone.databinding.PostBinding

class TimeLineAdapter : RecyclerView.Adapter<TimeLineAdapter.TimeLineViewHolder>() {

    private val differCallBack = object : DiffUtil.ItemCallback<Post>() {
        override fun areItemsTheSame(oldItem: Post, newItem: Post): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Post, newItem: Post): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallBack)

    inner class TimeLineViewHolder(val binding: PostBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TimeLineAdapter.TimeLineViewHolder {
        return TimeLineViewHolder(
            PostBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: TimeLineAdapter.TimeLineViewHolder, position: Int) {
        val post = differ.currentList[position]
        holder.binding.apply {
            tvUserId.text = post.username
            tvComments.text = "view ${post.comments} comments"
            tvCaption.text = post.caption
            tvLikes.text = "${post.likes} likes"

            Glide.with(ivUserImage)
                .load(post.userImage)
                .transition(DrawableTransitionOptions.withCrossFade())
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(ivUserImage)

            Glide.with(ivImagePost)
                .load(post.image)
                .transition(DrawableTransitionOptions.withCrossFade())
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(ivImagePost)

        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

}