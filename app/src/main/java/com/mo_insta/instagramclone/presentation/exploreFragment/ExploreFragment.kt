package com.mo_insta.instagramclone.presentation.exploreFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.mo_insta.instagramclone.MainActivity
import com.mo_insta.instagramclone.R
import com.mo_insta.instagramclone.databinding.FragmentExploreBinding
import com.mo_insta.instagramclone.presentation.adapters.ExploreAdapter
import com.mo_insta.instagramclone.utils.showToast

class ExploreFragment : Fragment() {

    private lateinit var binding: FragmentExploreBinding
    private val viewModel : ExploreViewModel by viewModels()
    private lateinit var myAdapter : ExploreAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentExploreBinding.inflate(layoutInflater)
        (requireActivity() as MainActivity).setSupportActionBar(binding.myToolbar)
        (requireActivity() as MainActivity).getSupportActionBar()?.setDisplayShowTitleEnabled(false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        setOnClicks()
    }

    private fun setupRecyclerView() {
        myAdapter = ExploreAdapter()
        myAdapter.differ.submitList(viewModel.getPosts())
        val gridLayoutManager =
            StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        binding.rvExplore.layoutManager = gridLayoutManager
        binding.rvExplore.adapter = myAdapter

    }

    private fun setOnClicks() {
        val searchField = binding.toolbar.findViewById<EditText>(R.id.et_search)
        searchField.doAfterTextChanged {
            showToast(requireContext(), it.toString())
        }
    }

}