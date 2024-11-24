package com.ubaya.bernadya.Bank.Play

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.ubaya.bernadya.databinding.MemberListBinding
import com.ubaya.bernadya.databinding.TeamListBinding

class MemberAdapter(private val members: ArrayList<MemberClass>) : RecyclerView.Adapter<MemberAdapter.QuestionViewHolder>(){
    class QuestionViewHolder(val binding: MemberListBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {
        val binding = MemberListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,false)
        return QuestionViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return members.size
    }

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {
        val builder = Picasso.Builder(holder.itemView.context)
        builder.listener { picasso, uri, exception ->
            exception.printStackTrace()
        }
        builder.build().load(members[position].gambar).into(holder.binding.imgMember)
        holder.binding.txtNamaMember.text = members[position].namaMember
        holder.binding.txtRole.text = "Role : " + members[position].role
    }


}