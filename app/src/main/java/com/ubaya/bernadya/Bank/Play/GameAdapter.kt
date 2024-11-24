package com.ubaya.bernadya.Bank.Play

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ubaya.bernadya.AchievementActivity
import com.ubaya.bernadya.Bank.Team.SelectedGameMember
import com.ubaya.bernadya.TeamActivity
import com.ubaya.bernadya.databinding.GameListBinding

class GameAdapter : RecyclerView.Adapter<GameAdapter.QuestionViewHolder>(){
    class QuestionViewHolder(val binding: GameListBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {
        val binding = GameListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,false)
        return QuestionViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return GameObject.games.size
    }

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {
        holder.binding.imgGame.setImageResource(GameObject.games[position].gambar)
        holder.binding.txtNameGame.text = GameObject.games[position].nama
        holder.binding.txtDescGame.text = GameObject.games[position].desc
        Log.d("aaa", "halo")

        holder.binding.btnAchievement.setOnClickListener{
            val context = holder.itemView.context
            val intent = Intent(context, AchievementActivity::class.java)

            // mindah data ke achievement activity
            val achievementArrayList = ArrayList(GameObject.games[position].achievement)
            intent.putParcelableArrayListExtra("achi", achievementArrayList)
            intent.putExtra("nama", GameObject.games[position].nama)
            intent.putExtra("gambar", GameObject.games[position].gambar)
            context.startActivity(intent)
        }

        holder.binding.btnTeam.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, TeamActivity::class.java)

            //mindah data ke team activity
            val teamArrayList = ArrayList(GameObject.games[position].team)
            intent.putParcelableArrayListExtra("team", teamArrayList)
            intent.putExtra("nama", GameObject.games[position].nama)
            intent.putExtra("gambar", GameObject.games[position].gambar)
            context.startActivity(intent)
        }
    }


}