package com.ubaya.bernadya

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ubaya.bernadya.Bank.Play.GameAdapter
import com.ubaya.bernadya.Bank.Schedule.ScheduleAdapter
import com.ubaya.bernadya.databinding.ActivitySceduleBinding
import com.ubaya.bernadya.databinding.FragmentOurScheduleBinding
import com.ubaya.bernadya.databinding.FragmentWhatWePlayBinding

class OurScheduleFragment : Fragment() {
    private lateinit var binding: FragmentOurScheduleBinding
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
        binding = FragmentOurScheduleBinding.inflate(layoutInflater)

        binding.recSchedule.layoutManager = LinearLayoutManager(context)
        binding.recSchedule.setHasFixedSize(true)
        binding.recSchedule.adapter = ScheduleAdapter()
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            OurScheduleFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}