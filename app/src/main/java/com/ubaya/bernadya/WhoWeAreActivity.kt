package com.ubaya.bernadya

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ubaya.bernadya.databinding.ActivityWhoWeAreBinding

class WhoWeAreActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWhoWeAreBinding
    var liked = 0
    var isButtonClicked = false
    fun TambahLike() {
        liked = liked+1
        binding.btnLike.text = liked.toString()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityWhoWeAreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnhome.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        binding.txtWhoAreWe.text = "Ber-Nadya E-Sport adalah tim e-sport yang berfokus pada pengembangan talenta muda dalam dunia kompetisi game. Kami berdedikasi untuk menciptakan lingkungan yang mendukung, profesional, dan bersemangat, di mana para pemain dapat mengasah keterampilan mereka dan mencapai potensi terbaik. Dengan komitmen pada etika, sportivitas, dan kerja sama tim, Ber-Nadya E-Sport bertujuan untuk menjadi kekuatan yang disegani di kancah e-sport Indonesia dan internasional, sambil terus mendorong inovasi dan pertumbuhan di industri ini."
        binding.btnLike.setOnClickListener {
            if (!isButtonClicked) {
                TambahLike()
                isButtonClicked = true
            } else {
                Toast.makeText(this, "Tombol sudah diklik", Toast.LENGTH_SHORT).show()
            }
        }
    }
}