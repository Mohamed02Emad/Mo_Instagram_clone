package com.mo_insta.instagramclone.presentation.reelsFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mo_insta.instagramclone.R
import com.mo_insta.instagramclone.presentation.homeFragment.HomeFragment

class ReelsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reels, container, false)
    }

    companion object {
        fun getInstance(): ReelsFragment {
            return ReelsFragment()
        }
    }
}