package com.mo_insta.instagramclone.presentation.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mo_insta.instagramclone.data.models.MyTab
import com.mo_insta.instagramclone.presentation.exploreFragment.ExploreFragment
import com.mo_insta.instagramclone.presentation.homeFragment.HomeFragment
import com.mo_insta.instagramclone.presentation.newPostFragment.NewPostFragment
import com.mo_insta.instagramclone.presentation.profileFragment.ProfileFragment
import com.mo_insta.instagramclone.presentation.reelsFragment.ReelsFragment

class MyViewPagerAdapter(fragmentActivity: FragmentActivity, private val tabs: ArrayList<MyTab>) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return tabs.size
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                tabs[0].fragment as HomeFragment
            }
            1 -> {
                tabs[1].fragment as ExploreFragment
            }
            2 -> {
                tabs[2].fragment as NewPostFragment
            }
            3 -> {
                tabs[3].fragment as ReelsFragment
            }
            else -> {
                tabs[4].fragment as ProfileFragment
            }
        }
    }

}