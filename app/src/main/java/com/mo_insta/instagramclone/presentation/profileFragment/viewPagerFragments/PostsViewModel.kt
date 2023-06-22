package com.mo_insta.instagramclone.presentation.profileFragment.viewPagerFragments

import androidx.lifecycle.ViewModel
import com.mo_insta.instagramclone.data.repository.PostsRepository

class PostsViewModel : ViewModel() {

    private val repository = PostsRepository()

    fun getPosts(): ArrayList<Int> {
        val list = repository.getMyPosts()
        list.shuffle()
        return list
    }
}