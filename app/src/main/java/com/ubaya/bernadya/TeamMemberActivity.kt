package com.ubaya.bernadya

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.squareup.picasso.Picasso
import com.ubaya.bernadya.Bank.Play.MemberAdapter
import com.ubaya.bernadya.Bank.Play.MemberClass
import com.ubaya.bernadya.Bank.Play.TeamAdapter
import com.ubaya.bernadya.Bank.Play.TeamClass
import com.ubaya.bernadya.databinding.ActivityTeamBinding
import com.ubaya.bernadya.databinding.ActivityTeamMemberBinding
import java.util.ArrayList

class TeamMemberActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityTeamMemberBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTeamMemberBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnhome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        //ambil data
        val members = intent.getParcelableArrayListExtra<MemberClass>("member")?: ArrayList()
        binding.recMember.adapter = MemberAdapter(members)
        val teamName = intent.getStringExtra("team")?: ""
        val gambarGame = intent.getStringExtra("gambarTeam")?:""
        val builder = Picasso.Builder(this)
        builder.listener { picasso, uri, exception ->
            exception.printStackTrace()
        }
        builder.build().load(gambarGame).into(binding.imgGame3)

        var gamesmember = "$teamName's team"
        binding.txtNameTeam.setText(gamesmember)

        //munculin rec
        binding.recMember.layoutManager = LinearLayoutManager(this)
        binding.recMember.setHasFixedSize(true)
    }
}