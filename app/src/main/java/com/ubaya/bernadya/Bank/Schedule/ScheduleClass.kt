package com.ubaya.bernadya.Bank.Schedule

import com.ubaya.bernadya.Bank.Play.GameClass
import com.ubaya.bernadya.Bank.Play.TeamClass
import java.util.Date

class ScheduleClass (val id: Int,
                     val event: String,
                     val date: Date,
                     val location : String,
                     val gambarArena: Int,
                     val desc: String,
                     var gameClass: GameClass,
                     var teamGame: TeamClass,
)