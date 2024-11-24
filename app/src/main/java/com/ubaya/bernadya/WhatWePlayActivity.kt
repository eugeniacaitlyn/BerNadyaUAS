package com.ubaya.bernadya

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.ubaya.bernadya.Bank.Play.GameAdapter
import com.ubaya.bernadya.databinding.ActivityWhatWePlayBinding

class WhatWePlayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWhatWePlayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityWhatWePlayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnhome.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        binding.recGame.layoutManager = LinearLayoutManager(this)
        binding.recGame.setHasFixedSize(true)
        binding.recGame.adapter = GameAdapter()

//        binding.btnAchievement.setOnClickListener{
//            val intent = Intent(this,AchievementActivity::class.java)
//            startActivity(intent)
//        }
    }


}