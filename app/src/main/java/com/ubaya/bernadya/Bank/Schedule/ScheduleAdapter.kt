package com.ubaya.bernadya.Bank.Schedule

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ubaya.bernadya.Bank.Play.GameObject
import com.ubaya.bernadya.OurScheduleDetailActivity
import com.ubaya.bernadya.databinding.SchedulesListBinding
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class ScheduleAdapter() : RecyclerView.Adapter<ScheduleAdapter.ScheduleViewHolder>() {
    class ScheduleViewHolder(val binding: SchedulesListBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleViewHolder {
        val binding = SchedulesListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,false)
        return ScheduleViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return ScheduleObject.schedule.size
    }

    override fun onBindViewHolder(holder: ScheduleViewHolder, position: Int) {
        holder.binding.imgGameSchedule.setImageResource(ScheduleObject.schedule[position].gameClass.gambar)
        holder.binding.txtDate.text = formatDate(ScheduleObject.schedule[position].date)
        holder.binding.txtTeam.text = ScheduleObject.schedule[position].teamGame.namaTeam
        holder.binding.txtEvent.text = ScheduleObject.schedule[position].event
        holder.binding.btnScheduleDetail.setOnClickListener{
            val context = holder.itemView.context
            val intent = Intent(context, OurScheduleDetailActivity::class.java)

            // mindah data ke schedule detail activity
            intent.putExtra("event", ScheduleObject.schedule[position].event)
            intent.putExtra("team", ScheduleObject.schedule[position].teamGame.namaTeam)
            intent.putExtra("lokasi", ScheduleObject.schedule[position].location)
            intent.putExtra("desc", ScheduleObject.schedule[position].desc)
            intent.putExtra("gambar", ScheduleObject.schedule[position].gambarArena)
            context.startActivity(intent)
        }
    }
    fun formatDate(date: Date): String {
        val formatter = SimpleDateFormat("dd MMMM yyyy", Locale("id", "ID"))
        val date = Date(date.year - 1900, date.month, date.day-25)  // Menggunakan Date(year - 1900, month - 1, day)
        return formatter.format(date)
    }

}