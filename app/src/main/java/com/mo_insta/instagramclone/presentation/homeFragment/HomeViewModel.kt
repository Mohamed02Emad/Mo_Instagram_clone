package com.mo_insta.instagramclone.presentation.homeFragment

import androidx.lifecycle.ViewModel
import com.mo_insta.instagramclone.data.models.Post
import com.mo_insta.instagramclone.data.models.Story
import com.mo_insta.instagramclone.data.repository.PostsRepository
import com.mo_insta.instagramclone.data.repository.StoriesRepository

class HomeViewModel : ViewModel() {

    //will not inject it cuz i only want the design

    private val storiesRepo = StoriesRepository()
    private val postsRepo = PostsRepository()

    fun getStories(): ArrayList<Story> {
        return storiesRepo.getFakeHomeStories()
    }

    fun getTimeLinePosts(): ArrayList<Post> {
        return postsRepo.getTimeLinePosts()
    }

}