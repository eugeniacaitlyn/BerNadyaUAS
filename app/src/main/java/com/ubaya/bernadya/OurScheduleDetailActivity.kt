package com.ubaya.bernadya

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.ubaya.bernadya.databinding.ActivityScheduleDetailBinding

class OurScheduleDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityScheduleDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityScheduleDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnhome.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        //ambil data
        val eventName = intent.getStringExtra("event")?: ""
        val gameTeam = intent.getStringExtra("team")?: ""
        val location = intent.getStringExtra("lokasi")?: ""
        val desckripsi = intent.getStringExtra("desc")?: ""
        val gambarArena = intent.getIntExtra("gambar", 0)


        //menampilkan
        binding.txtNameSchedule.setText(eventName)
        binding.txtPlace.setText(location)
        binding.txtTeam.setText(gameTeam)
        binding.txtDescSchedule.setText(desckripsi)
        binding.imgArena.setImageResource(gambarArena)

        binding.btnNotif.setOnClickListener {
            Toast.makeText(this, "Notification created", Toast.LENGTH_SHORT).show()
        }
    }
}