package com.mo_insta.instagramclone.presentation.reelsFragment

import androidx.lifecycle.ViewModel
import com.mo_insta.instagramclone.R
import com.mo_insta.instagramclone.data.models.Post

class ReelsViewModel : ViewModel() {
    fun getReels(): ArrayList<Post> {

        val post1 = Post(
            id = 1,
            username = "Mohamed Emad",
            userImage = R.drawable.user1,
            caption = "First post",
            audio = "audio1.mp3",
            likes = 10,
            comments = 5,
            shares = 2,
            isVideo = true,
            video = R.raw.vid1
        )

        val post2 = Post(
            id = 2,
            username = "Ahmed Emad",
            userImage = R.drawable.user2,
            caption = "Second post",
            audio = "audio2.mp3",
            likes = 15,
            comments = 7,
            shares = 3,
            video = R.raw.vid2
        )

        val post3 = Post(
            id = 3,
            username = "Ibrahim",
            userImage = R.drawable.user3,
            caption = "Third post",
            audio = "audio3.mp3",
            likes = 20,
            comments = 3,
            shares = 1,
            video = R.raw.vid6
        )

        val post4 = Post(
            id = 4,
            username = "Mohammed",
            userImage = R.drawable.user4,
            caption = "Fourth post",
            audio = "audio4.mp3",
            likes = 8,
            comments = 2,
            shares = 0,
            video = R.raw.vid4
        )

        val post5 = Post(
            id = 5,
            username = "Yaya",
            userImage = R.drawable.user5,
            caption = "Fifth post",
            audio = "audio5.mp3",
            likes = 12,
            comments = 4,
            shares = 1,
            video = R.raw.vid5
        )

        val post6 = Post(
            id = 6,
            username = "momo02",
            userImage = R.drawable.user6,
            caption = "Sixth post",
            audio = "audio6.mp3",
            likes = 5,
            comments = 1,
            shares = 0,
            video = R.raw.vid1
        )

        val post7 = Post(
            id = 7,
            username = "kaka",
            userImage = R.drawable.user7,
            caption = "Seventh post",
            audio = "audio7.mp3",
            likes = 6,
            comments = 3,
            shares = 1,
            video = R.raw.vid2
        )

        val post8 = Post(
            id = 8,
            username = "Hulk",
            userImage = R.drawable.user8,
            caption = "Eighth post",
            audio = "audio8.mp3",
            likes = 9,
            comments = 2,
            shares = 0,
            video = R.raw.vid3
        )

        val post9 = Post(
            id = 9,
            username = "FatBoy00",
            userImage = R.drawable.user1,
            caption = "Ninth post",
            audio = "audio9.mp3",
            likes = 11,
            comments = 5,
            shares = 2,
            video = R.raw.vid4
        )

        val post10 = Post(
            id = 10,
            username = "L_O_L",
            userImage = R.drawable.user2,
            caption = "Tenth post",
            audio = "audio10.mp3",
            likes = 14,
            comments = 7,
            shares = 3,
            video = R.raw.vid5
        )
        val postsList = ArrayList<Post>()
        postsList.add(post1)
        postsList.add(post2)
        postsList.add(post3)
        postsList.add(post4)
        postsList.add(post5)
        postsList.add(post6)
        postsList.add(post7)
        postsList.add(post8)
        postsList.add(post9)
        postsList.add(post10)

        postsList.shuffle()

        return postsList
    }

}