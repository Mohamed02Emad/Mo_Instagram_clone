package com.mo_insta.instagramclone.presentation.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mo_insta.instagramclone.data.models.MyTab

class MyViewPagerAdapter(fragmentActivity: FragmentActivity, private val tabs: ArrayList<MyTab>) :
    FragmentStateAdapter(fragmentActivity) {


    override fun getItemCount(): Int {
        return tabs.size
    }


    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                tabs[0].fragment
            }
            1 -> {
                tabs[1].fragment
            }
            2 -> {
                tabs[2].fragment
            }
            3 -> {
                tabs[3].fragment
            }
            else -> {
                tabs[4].fragment
            }
        }
    }

}