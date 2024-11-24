package com.ubaya.bernadya.Bank.Play

import android.content.ContentValues.TAG
import android.content.Intent
import android.nfc.Tag
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.ubaya.bernadya.AchievementActivity
import com.ubaya.bernadya.Bank.Team.SelectedGameMember
import com.ubaya.bernadya.Bank.Team.SelectedTeam
import com.ubaya.bernadya.TeamActivity
import com.ubaya.bernadya.TeamMemberActivity
import com.ubaya.bernadya.databinding.GameListBinding
import com.ubaya.bernadya.databinding.TeamListBinding

class TeamAdapter(private val teams: ArrayList<TeamClass>) : RecyclerView.Adapter<TeamAdapter.QuestionViewHolder>(){
    class QuestionViewHolder(val binding: TeamListBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {
        val binding = TeamListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,false)
        return QuestionViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return teams.size
    }

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {
        val builder = Picasso.Builder(holder.itemView.context)
        builder.listener { picasso, uri, exception ->
            exception.printStackTrace()
        }
        builder.build().load(teams[position].imgTeam).into(holder.binding.imgTeam)
        //Log.d(TAG, "imgTeam")
        holder.binding.txtNamaTeam.text = teams[position].namaTeam

        holder.binding.rlTeam.setOnClickListener{
            val context = holder.itemView.context
            val intent = Intent(context, TeamMemberActivity::class.java)

            //mindah data ke member activity
            val memberArrayList = ArrayList(teams[position].memberList)
            intent.putParcelableArrayListExtra("member", memberArrayList)
            intent.putExtra("team", teams[position].namaTeam)
            intent.putExtra("gambarTeam", teams[position].imgTeam)
            context.startActivity(intent)
        }
    }


}