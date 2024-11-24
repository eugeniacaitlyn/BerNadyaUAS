package com.ubaya.bernadya

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.ubaya.bernadya.Bank.Play.GameAdapter
import com.ubaya.bernadya.databinding.ActivityWhoWeAreBinding
import com.ubaya.bernadya.databinding.FragmentWhatWePlayBinding
import com.ubaya.bernadya.databinding.FragmentWhoWeAreBinding

class WhoWeAreFragment : Fragment() {

    private lateinit var binding: FragmentWhoWeAreBinding
    var liked = 0
    var isButtonClicked = false
    fun TambahLike() {
        liked = liked+1
        binding.btnLike.text = liked.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentWhoWeAreBinding.inflate(layoutInflater)

        binding.txtWhoAreWe.text = "Ber-Nadya E-Sport adalah tim e-sport yang berfokus pada pengembangan talenta muda dalam dunia kompetisi game. Kami berdedikasi untuk menciptakan lingkungan yang mendukung, profesional, dan bersemangat, di mana para pemain dapat mengasah keterampilan mereka dan mencapai potensi terbaik. Dengan komitmen pada etika, sportivitas, dan kerja sama tim, Ber-Nadya E-Sport bertujuan untuk menjadi kekuatan yang disegani di kancah e-sport Indonesia dan internasional, sambil terus mendorong inovasi dan pertumbuhan di industri ini."
        binding.btnLike.setOnClickListener {
            if (!isButtonClicked) {
                TambahLike()
                isButtonClicked = true
            } else {
                Toast.makeText(context, "Tombol sudah diklik", Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            WhoWeAreFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}