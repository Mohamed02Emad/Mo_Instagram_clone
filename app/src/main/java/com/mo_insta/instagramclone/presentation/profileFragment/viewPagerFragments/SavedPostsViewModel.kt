package com.mo_insta.instagramclone.presentation.profileFragment.viewPagerFragments

import androidx.lifecycle.ViewModel
import com.mo_insta.instagramclone.data.repository.PostsRepository

class SavedPostsViewModel : ViewModel() {

    private val repository = PostsRepository()

    fun getSavedPosts(): ArrayList<Int> {
        val list = repository.getSavedPosts()
        list.shuffle()
        return list
    }
}