package com.ubaya.bernadya

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ubaya.bernadya.Bank.Play.GameAdapter
import com.ubaya.bernadya.databinding.ActivityWhatWePlayBinding
import com.ubaya.bernadya.databinding.FragmentWhatWePlayBinding


/**
 * A simple [Fragment] subclass.
 * Use the [WhatWePlayFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WhatWePlayFragment : Fragment() {
    private lateinit var binding: FragmentWhatWePlayBinding

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
        binding = FragmentWhatWePlayBinding.inflate(inflater,container,false )

        binding.recGame.layoutManager = LinearLayoutManager(context)
        binding.recGame.setHasFixedSize(true)
        binding.recGame.adapter = GameAdapter()
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            WhatWePlayFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}