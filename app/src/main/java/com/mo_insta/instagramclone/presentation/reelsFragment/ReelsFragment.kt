package com.mo_insta.instagramclone.presentation.reelsFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.mo_insta.instagramclone.databinding.FragmentReelsBinding
import com.mo_insta.instagramclone.presentation.adapters.ReelsAdapter

class ReelsFragment : Fragment() {

    private val viewModel: ReelsViewModel by viewModels()
    private lateinit var binding: FragmentReelsBinding
    private lateinit var myAdapter: ReelsAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentReelsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupReels()
    }

    private fun setupReels() {
        myAdapter = ReelsAdapter(viewModel.getReels())
        binding.viewPager.adapter = myAdapter
    }

    companion object {
        fun getInstance(): ReelsFragment {
            return ReelsFragment()
        }
    }
}