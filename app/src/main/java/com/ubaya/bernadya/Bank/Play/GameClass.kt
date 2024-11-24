package com.ubaya.bernadya.Bank.Play

data class GameClass(val id: Int,
                     val nama: String,
                     val desc: String,
                     val gambar: Int,
                     val achievement: List<AchievementClass>,
                     val team: List<TeamClass>)
