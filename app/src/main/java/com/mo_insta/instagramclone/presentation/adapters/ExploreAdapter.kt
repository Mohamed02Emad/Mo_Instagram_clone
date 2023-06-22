package com.mo_insta.instagramclone.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.mo_insta.instagramclone.databinding.JustImageBinding
import com.mo_insta.instagramclone.utils.showToast

class ExploreAdapter : RecyclerView.Adapter<ExploreAdapter.ExploreViewHolder>() {

    private val differCallBack = object : DiffUtil.ItemCallback<Int>() {
        override fun areItemsTheSame(oldItem: Int, newItem: Int): Boolean {
            return true
        }

        override fun areContentsTheSame(oldItem: Int, newItem: Int): Boolean {
            return true
        }
    }

    val differ = AsyncListDiffer(this, differCallBack)

    inner class ExploreViewHolder(val binding: JustImageBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ExploreAdapter.ExploreViewHolder {
        return ExploreViewHolder(
            JustImageBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ExploreAdapter.ExploreViewHolder, position: Int) {
        val img = differ.currentList[position]
        holder.binding.imgPost.setImageResource(img)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

}