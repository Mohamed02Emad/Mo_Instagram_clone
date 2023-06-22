package com.mo_insta.instagramclone.presentation.profileFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.mo_insta.instagramclone.R
import com.mo_insta.instagramclone.data.models.MyTab
import com.mo_insta.instagramclone.databinding.FragmentProfileBinding
import com.mo_insta.instagramclone.presentation.adapters.MyViewPagerAdapter
import com.mo_insta.instagramclone.presentation.adapters.StoriesAdapter
import com.mo_insta.instagramclone.presentation.profileFragment.viewPagerFragments.PostsFragment
import com.mo_insta.instagramclone.presentation.profileFragment.viewPagerFragments.SavedPostsFragment
import com.mo_insta.instagramclone.presentation.profileFragment.viewPagerFragments.SavedReelsFragment
import com.mo_insta.instagramclone.utils.showToast

class ProfileFragment : Fragment() {

     val viewModel: ProfileViewModel by viewModels()
    private lateinit var binding: FragmentProfileBinding
    private lateinit var myAdapter: StoriesAdapter
    private lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOnClicks()
        setObservers()
        setRecyclerViews()
        setViewPager()
    }

    private fun setObservers() {
        //  TODO("Not yet implemented")
    }

    private fun setOnClicks() {
        binding.apply {
            btnNewPost.setOnClickListener { showToast(requireContext(), "New post") }
            btnBurgerMenu.setOnClickListener { showToast(requireContext(), "Settings") }
            ivProfileImage.setOnClickListener { showToast(requireContext(), "Profile image") }
            tvFollowers.setOnClickListener { showToast(requireContext(), "Followers") }
            tvFollowersCounter.setOnClickListener { showToast(requireContext(), "Followers") }
            tvFollowing.setOnClickListener { showToast(requireContext(), "Following") }
            tvFollowingCounter.setOnClickListener { showToast(requireContext(), "Following") }
            btnEditProfile.setOnClickListener { showToast(requireContext(), "Edit profile") }
            btnShareProfile.setOnClickListener { showToast(requireContext(), "Share profile") }
            btnSuggestFriends.setOnClickListener { showToast(requireContext(), "Suggest friends") }
        }
    }


    private fun setRecyclerViews() {
        myAdapter = StoriesAdapter()
        binding.rvSavedStories.adapter = myAdapter
        myAdapter.differ.submitList(viewModel.getFakeSavedStories())
    }

    private fun setViewPager() {
        viewPager = binding.viewpager
        val tabs: ArrayList<MyTab> = ArrayList()
        val postsFragment = PostsFragment.getInstance()
        val savedReelsFragment = SavedReelsFragment.getInstance()
        val savedPostsFragment = SavedPostsFragment.getInstance()
        tabs.add(MyTab("postsFragment", postsFragment))
        tabs.add(MyTab("savedReelsFragment", savedReelsFragment))
        tabs.add(MyTab("savedPostsFragment", savedPostsFragment))
        val adapter = MyViewPagerAdapter(requireActivity(), tabs)
        viewPager.adapter = adapter

        TabLayoutMediator(
            binding.tebLayout,
            binding.viewpager,
            object : TabLayoutMediator.TabConfigurationStrategy {
                override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {
                    if (position == 0)
                        tab.setIcon(R.drawable.ic_grid)
                    else if (position == 1)
                        tab.setIcon(R.drawable.ic_reels)
                    else
                        tab.setIcon(R.drawable.ic_square_profile)
                }
            }).attach()

    }

    companion object {
        fun getInstance(): ProfileFragment {
            return ProfileFragment()
        }
    }
}