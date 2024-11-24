package com.ubaya.bernadya

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.ubaya.bernadya.databinding.ActivityMain2Binding
import com.ubaya.bernadya.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    val fragments: ArrayList<Fragment> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val sharedPreferences: SharedPreferences = getSharedPreferences("BERNADYAESPORT", Context.MODE_PRIVATE)
        val userJson = sharedPreferences.getString("USER", "")

        if (userJson == "") {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)

            finish()
        }

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        fragments.add(WhatWePlayFragment())
        fragments.add(WhoWeAreFragment())
        fragments.add(OurScheduleFragment())

        binding.viewPager.adapter = MyAdapter(this, fragments)

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                val menuItem = binding.bottomNav.menu.getItem(position)
                binding.bottomNav.selectedItemId = menuItem.itemId
            }
        })


        binding.bottomNav.setOnItemSelectedListener {
            binding.viewPager.currentItem = when(it.itemId) {
                R.id.itemWhat -> 0
                R.id.itemWho-> 1
                R.id.itemSchedule -> 2
                else -> 0 // default to home
            }
            true
        }

        binding.btnLogOut.setOnClickListener{
            val sharedPreferences: SharedPreferences = getSharedPreferences("BERNADYAESPORT", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()

            //hapus data di sharedPreferences
            editor.clear()
            editor.apply()

            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)

            finish()
        }
    }
}