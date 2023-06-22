package com.mo_insta.instagramclone.presentation.exploreFragment

import androidx.lifecycle.ViewModel
import com.mo_insta.instagramclone.data.repository.PostsRepository

class ExploreViewModel : ViewModel() {
    private val repository = PostsRepository()

    fun getPosts(): ArrayList<Int> = repository.getExplorePosts()

}