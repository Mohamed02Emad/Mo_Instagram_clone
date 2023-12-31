package com.mo_insta.instagramclone.presentation.profileFragment.viewPagerFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mo_insta.instagramclone.R
import com.mo_insta.instagramclone.presentation.profileFragment.ProfileFragment

class SavedReelsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_saved_reels, container, false)
    }

    companion object {
        fun getInstance(): SavedReelsFragment {
        return SavedReelsFragment()
    }
    }
}