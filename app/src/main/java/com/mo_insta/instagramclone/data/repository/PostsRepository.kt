package com.mo_insta.instagramclone.data.repository

import com.mo_insta.instagramclone.R
import com.mo_insta.instagramclone.data.models.Post

class PostsRepository {

    fun getMyPosts(): ArrayList<Int> {

        val post1 = Post(
            id = 1,
            username = "Mohamed Emad",
            userImage = R.drawable.user1,
            caption = "First post",
            audio = "audio1.mp3",
            likes = 10,
            comments = 5,
            shares = 2,
            isVideo = false,
            image = R.drawable.me1
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
            isVideo = false,
            image = R.drawable.me2
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
            isVideo = false,
            image = R.drawable.me3
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
            isVideo = false,
            image = R.drawable.me4
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
            isVideo = false,
            image = R.drawable.user1
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
            isVideo = false,
            image = R.drawable.user2
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
            isVideo = false,
            image = R.drawable.user7
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
            isVideo = false,
            image = R.drawable.user5
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
            isVideo = false,
            image = R.drawable.user8
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
            isVideo = false,
            image = R.drawable.user6
        )
        val postsList = ArrayList<Int>()
        postsList.add(R.drawable.me1)
        postsList.add(R.drawable.me2)
        postsList.add(R.drawable.me3)
        postsList.add(R.drawable.me4)
        postsList.add(R.drawable.user1)
        postsList.add(R.drawable.user2)
        postsList.add(R.drawable.user3)
        postsList.add(R.drawable.user4)
        postsList.add(R.drawable.user5)
        postsList.add(R.drawable.user6)

        return postsList
    }

    fun getSavedPosts(): ArrayList<Int> {

        val postsList = ArrayList<Int>()
        postsList.add(R.drawable.me1)
        postsList.add(R.drawable.me2)
        postsList.add(R.drawable.me3)
        postsList.add(R.drawable.me4)

        return postsList
    }

    fun getTimeLinePosts(): ArrayList<Post> {

        val post1 = Post(
            id = 1,
            username = "Mohamed Emad",
            userImage = R.drawable.user1,
            caption = "First post",
            audio = "audio1.mp3",
            likes = 10,
            comments = 5,
            shares = 2,
            isVideo = false,
            image = R.drawable.user5
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
            isVideo = false,
            image = R.drawable.user8
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
            isVideo = false,
            image = R.drawable.user3
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
            isVideo = false,
            image = R.drawable.user5
        )


        val post5 = Post(
            id = 4,
            username = "Hamada",
            userImage = R.drawable.user6,
            caption = "Fourth post",
            audio = "audio4.mp3",
            likes = 8,
            comments = 2,
            shares = 0,
            isVideo = false,
            image = R.drawable.user1
        )


        val post6 = Post(
            id = 4,
            username = "n3na3",
            userImage = R.drawable.user7,
            caption = "Fourth post",
            audio = "audio4.mp3",
            likes = 8,
            comments = 2,
            shares = 0,
            isVideo = false,
            image = R.drawable.user6
        )


        val post7 = Post(
            id = 4,
            username = "buz light year",
            userImage = R.drawable.user5,
            caption = "Fourth post",
            audio = "audio4.mp3",
            likes = 8,
            comments = 2,
            shares = 0,
            isVideo = false,
            image = R.drawable.user7
        )


        val post8 = Post(
            id = 4,
            username = "ismail",
            userImage = R.drawable.user3,
            caption = "Fourth post",
            audio = "audio4.mp3",
            likes = 8,
            comments = 2,
            shares = 0,
            isVideo = false,
            image = R.drawable.me4
        )


        val post9 = Post(
            id = 4,
            username = "luffy",
            userImage = R.drawable.user4,
            caption = "Fourth post",
            audio = "audio4.mp3",
            likes = 8,
            comments = 2,
            shares = 0,
            isVideo = false,
            image = R.drawable.user3
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
        postsList.add(post1)
        postsList.add(post2)
        postsList.add(post3)
        postsList.add(post4)
        postsList.add(post5)
        postsList.add(post6)
        postsList.add(post7)
        postsList.add(post8)
        postsList.add(post9)
        postsList.add(post1)
        postsList.add(post2)
        postsList.add(post3)
        postsList.add(post4)
        postsList.add(post5)
        postsList.add(post6)
        postsList.add(post7)
        postsList.add(post8)
        postsList.add(post9)
        postsList.add(post1)
        postsList.add(post2)
        postsList.add(post3)
        postsList.add(post4)
        postsList.add(post5)
        postsList.add(post6)
        postsList.add(post7)
        postsList.add(post8)
        postsList.add(post9)
        postsList.shuffle()
        return postsList
    }

    fun getExplorePosts(): ArrayList<Int> {
        val posts = ArrayList<Int>()
        posts.add(R.drawable.user1)
        posts.add(R.drawable.user2)
        posts.add(R.drawable.user3)
        posts.add(R.drawable.user4)
        posts.add(R.drawable.user5)
        posts.add(R.drawable.user6)
        posts.add(R.drawable.user7)
        posts.add(R.drawable.user8)
        posts.add(R.drawable.me1)
        posts.add(R.drawable.me2)
        posts.add(R.drawable.me3)
        posts.add(R.drawable.me4)
        posts.add(R.drawable.user1)
        posts.add(R.drawable.user2)
        posts.add(R.drawable.user3)
        posts.add(R.drawable.user4)
        posts.add(R.drawable.user5)
        posts.add(R.drawable.user6)
        posts.add(R.drawable.user7)
        posts.add(R.drawable.user8)
        posts.add(R.drawable.me1)
        posts.add(R.drawable.me2)
        posts.add(R.drawable.me3)
        posts.add(R.drawable.me4)
        posts.add(R.drawable.user1)
        posts.add(R.drawable.user2)
        posts.add(R.drawable.user3)
        posts.add(R.drawable.user4)
        posts.add(R.drawable.user5)
        posts.add(R.drawable.user6)
        posts.add(R.drawable.user7)
        posts.add(R.drawable.user8)
        posts.add(R.drawable.me1)
        posts.add(R.drawable.me2)
        posts.add(R.drawable.me3)
        posts.add(R.drawable.me4)
        posts.add(R.drawable.user1)
        posts.add(R.drawable.user2)
        posts.add(R.drawable.user3)
        posts.add(R.drawable.user4)
        posts.add(R.drawable.user5)
        posts.add(R.drawable.user6)
        posts.add(R.drawable.user7)
        posts.add(R.drawable.user8)
        posts.add(R.drawable.me1)
        posts.add(R.drawable.me2)
        posts.add(R.drawable.me3)
        posts.add(R.drawable.me4)
        posts.add(R.drawable.user1)
        posts.add(R.drawable.user2)
        posts.add(R.drawable.user3)
        posts.add(R.drawable.user4)
        posts.add(R.drawable.user5)
        posts.add(R.drawable.user6)
        posts.add(R.drawable.user7)
        posts.add(R.drawable.user8)
        posts.add(R.drawable.me1)
        posts.add(R.drawable.me2)
        posts.add(R.drawable.me3)
        posts.add(R.drawable.me4)
        posts.add(R.drawable.user1)
        posts.add(R.drawable.user2)
        posts.add(R.drawable.user3)
        posts.add(R.drawable.user4)
        posts.add(R.drawable.user5)
        posts.add(R.drawable.user6)
        posts.add(R.drawable.user7)
        posts.add(R.drawable.user8)
        posts.add(R.drawable.me1)
        posts.add(R.drawable.me2)
        posts.add(R.drawable.me3)
        posts.add(R.drawable.me4)
        posts.shuffle()
        return posts
    }
}