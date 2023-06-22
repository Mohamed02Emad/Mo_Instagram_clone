package com.mo_insta.instagramclone.data.repository

import com.mo_insta.instagramclone.R
import com.mo_insta.instagramclone.data.models.Post
import com.mo_insta.instagramclone.data.models.Story

class StoriesRepository() {


    fun getFakeSavedStories(): ArrayList<Story> {
        val list = ArrayList<Story>()
        val story1 = Story("Special Day", R.drawable.me1, "محمد عماد")
        val story2 = Story("طرش", R.drawable.me2, "محمد عماد")
        val story3 = Story("good day", R.drawable.me3, "محمد عماد")
        val story4 = Story("day", R.drawable.me4, "محمد عماد")
        val story5 = Story(" ", R.drawable.ic_add_story, "محمد عماد")
        list.add(story1)
        list.add(story2)
        list.add(story3)
        list.add(story4)
        list.add(story5)
        return list
    }

    fun getFakeHomeStories(): ArrayList<Story> {
        val list = ArrayList<Story>()
        val story0 = Story("Your story", R.drawable.me1, "محمد عماد")
        val story1 = Story("Special Day", R.drawable.user6, "محمد عماد")
        val story2 = Story("طرش", R.drawable.user3, "محمد عماد")
        val story3 = Story("day", R.drawable.user4, "محمد عماد")
        val story4 = Story("good day", R.drawable.user8, "محمد عماد")
        val story5 = Story("yoo", R.drawable.user4, "محمد عماد")
        val story6 = Story("yooooo", R.drawable.user2, "محمد عماد")
        list.add(story0)
        list.add(story1)
        list.add(story2)
        list.add(story3)
        list.add(story4)
        list.add(story5)
        list.add(story6)
        return list
    }



}