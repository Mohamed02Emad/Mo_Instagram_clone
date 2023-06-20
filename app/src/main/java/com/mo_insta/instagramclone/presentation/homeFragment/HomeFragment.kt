package com.mo_insta.instagramclone.presentation.homeFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.mo_insta.instagramclone.MainActivity
import com.mo_insta.instagramclone.R
import com.mo_insta.instagramclone.databinding.FragmentHomeBinding
import com.mo_insta.instagramclone.utils.showToast

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        (requireActivity() as MainActivity).setSupportActionBar(binding.myToolbar)
        (requireActivity() as MainActivity).getSupportActionBar()?.setDisplayShowTitleEnabled(false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOnClicks()
    }

    private fun setOnClicks() {
        val messages = binding.toolbar.findViewById<ImageView>(R.id.iv_messages)
        messages.setOnClickListener {
            showToast(requireContext(), "messages")

        }
        val notifications = binding.toolbar.findViewById<ImageView>(R.id.iv_notifications)
            notifications.setOnClickListener {
            showToast(requireContext(), "notifications")
        }
    }


}