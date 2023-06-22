package com.mo_insta.instagramclone.presentation.profileFragment.viewPagerFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.mo_insta.instagramclone.R
import com.mo_insta.instagramclone.databinding.FragmentSavedPostsBinding
import com.mo_insta.instagramclone.presentation.adapters.ExploreAdapter

class SavedPostsFragment : Fragment() {

    private val viewModel: SavedPostsViewModel by viewModels()
    private lateinit var binding: FragmentSavedPostsBinding
    private lateinit var myAdapter: ExploreAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSavedPostsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRcyclerView()
    }

    private fun setupRcyclerView() {
        myAdapter = ExploreAdapter()
        myAdapter.differ.submitList(viewModel.getSavedPosts())
        binding.rvPosts.apply {
            adapter = myAdapter
            layoutManager = GridLayoutManager(requireContext(),3,GridLayoutManager.VERTICAL,false)
        }
    }


    companion object {
        fun getInstance(): SavedPostsFragment {
            return SavedPostsFragment()
        }
    }
}