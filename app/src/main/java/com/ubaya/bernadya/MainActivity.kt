package com.ubaya.bernadya

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.ubaya.bernadya.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnWhat.setOnClickListener{
            val intent = Intent(this,WhatWePlayActivity::class.java)
            startActivity(intent)
        }
        binding.btnwho.setOnClickListener{
            val intent = Intent(this,WhoWeAreActivity::class.java)
            startActivity(intent)
        }
        binding.btnSchedule.setOnClickListener{
            val intent = Intent(this,OurScheduleActivity::class.java)
            startActivity(intent)
        }


        binding.btnhome.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}