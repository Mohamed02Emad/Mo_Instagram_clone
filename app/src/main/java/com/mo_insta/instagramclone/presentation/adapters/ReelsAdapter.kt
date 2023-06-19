package com.mo_insta.instagramclone.presentation.adapters

import android.graphics.Color
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.VideoView
import androidx.viewpager.widget.PagerAdapter
import com.mo_insta.instagramclone.R
import com.mo_insta.instagramclone.data.models.Post
import com.mo_insta.instagramclone.presentation.verticalViewPager.VerticalViewPager

class ReelsAdapter(private val videos: List<Post>) : PagerAdapter() {

    private val videoViews = mutableListOf<VideoView>()

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val itemView = LayoutInflater.from(container.context).inflate(
            R.layout.reel, container, false
        )
        val video = videos[position]
        val videoView = itemView.findViewById<VideoView>(R.id.video_view)
        val videoPath = "android.resource://" + "com.mo_insta.instagramclone" + "/${video.video}"
        videoView.setVideoPath(videoPath)
        videoView.setBackgroundColor(Color.TRANSPARENT)


        setViews(itemView, video)
        videoViews.add(videoView)
        container.addView(itemView)
        return itemView
    }

    private fun setViews(itemView: View, video: Post) {
        val ivUserImg1 = itemView.findViewById<ImageView>(R.id.user_image1)
        ivUserImg1.setImageResource(video.userImage)

        val reacts = itemView.findViewById<TextView>(R.id.tv_reacts)
        val comments = itemView.findViewById<TextView>(R.id.tv_comments)
        val shares = itemView.findViewById<TextView>(R.id.tv_shares)

        reacts.text = video.likes.toString()
        comments.text = video.comments.toString()
        shares.text = video.shares.toString()

        val musicName = itemView.findViewById<TextView>(R.id.tv_music_name)
        musicName.text = video.audio

        val title = itemView.findViewById<TextView>(R.id.tv_title)
        title.text = video.caption

        val ivUserImg2 = itemView.findViewById<ImageView>(R.id.iv_user_image)
        ivUserImg2.setImageResource(video.userImage)

        val userName = itemView.findViewById<TextView>(R.id.tv_user_name)
        userName.text = video.username


        val progressBar = itemView.findViewById<ProgressBar>(R.id.progress)
        val videoView = itemView.findViewById<VideoView>(R.id.video_view)

        videoView.setOnPreparedListener { mediaPlayer ->
            val duration = mediaPlayer.duration
            progressBar.max = duration

            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed(object : Runnable {
                override fun run() {
                        val currentPosition = videoView.currentPosition
                        progressBar.progress = currentPosition
                        if (currentPosition < duration) {
                            handler.postDelayed(this, 100)
                        }
                }
            }, 50)

        }

    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return videos.size
    }

    override fun finishUpdate(container: ViewGroup) {
        super.finishUpdate(container)
        val currentItem = (container as VerticalViewPager).currentItem
        for (i in videoViews.indices) {
            val videoView = videoViews[i]
            if (i == currentItem) {
                if (!videoView.isPlaying) {
                    videoView.seekTo(0)
                    videoView.start()
                }
            } else {
                videoView.pause()
            }
        }
    }


}
