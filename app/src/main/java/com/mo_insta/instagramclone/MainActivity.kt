package com.mo_insta.instagramclone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.mo_insta.instagramclone.data.models.MyTab
import com.mo_insta.instagramclone.databinding.ActivityMainBinding
import com.mo_insta.instagramclone.presentation.adapters.MyViewPagerAdapter
import com.mo_insta.instagramclone.presentation.exploreFragment.ExploreFragment
import com.mo_insta.instagramclone.presentation.homeFragment.HomeFragment
import com.mo_insta.instagramclone.presentation.newPostFragment.NewPostFragment
import com.mo_insta.instagramclone.presentation.profileFragment.ProfileFragment
import com.mo_insta.instagramclone.presentation.reelsFragment.ReelsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupNavigation()

    }

    private fun setupNavigation() {
        viewPager = binding.viewpager
        bottomNavigationView = binding.bottomNavigation

        val tabs: ArrayList<MyTab> = ArrayList()
        val homeFragment = HomeFragment.getInstance()
        val exploreFragment = ExploreFragment.getInstance()
        val newPostFragment = NewPostFragment.getInstance()
        val reelsFragment = ReelsFragment.getInstance()
        val profileFragment = ProfileFragment.getInstance()
        tabs.add(MyTab("homeFragment", homeFragment))
        tabs.add(MyTab("exploreFragment", exploreFragment))
        tabs.add(MyTab("newPostFragment", newPostFragment))
        tabs.add(MyTab("reelsFragment", reelsFragment))
        tabs.add(MyTab("profileFragment", profileFragment))
        val adapter = MyViewPagerAdapter(this, tabs)

        viewPager.adapter = adapter

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                when (position) {
                    0 -> {
                        bottomNavigationView.selectedItemId = R.id.homeFragment
                    }
                    1 -> {
                        bottomNavigationView.selectedItemId = R.id.exploreFragment
                    }
                    2 -> {
                        bottomNavigationView.selectedItemId = R.id.newPostFragment
                    }
                    3 -> {
                        bottomNavigationView.selectedItemId = R.id.reelsFragment
                    }
                    else -> {
                        bottomNavigationView.selectedItemId = R.id.profileFragment
                    }
                }
            }
        })

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.homeFragment -> {
                    viewPager.setCurrentItem(0, false)
                }
                R.id.exploreFragment -> {
                    viewPager.setCurrentItem(1, false)
                }
                R.id.newPostFragment -> {
                    viewPager.setCurrentItem(2, false)
                }
                R.id.reelsFragment -> {
                    viewPager.setCurrentItem(3, false)
                }
                R.id.profileFragment -> {
                    viewPager.setCurrentItem(4, false)
                }
            }
            true
        }

    }


}