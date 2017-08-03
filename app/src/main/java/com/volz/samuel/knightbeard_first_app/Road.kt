package com.volz.samuel.knightbeard_first_app

import com.volz.samuel.knightbeard_first_app.Enemys.Dwarf
import com.volz.samuel.knightbeard_first_app.Enemys.Elf
import com.volz.samuel.knightbeard_first_app.Enemys.Knight
import java.security.SecureRandom
import java.util.*

/**
 * Created by samue on 03.08.2017.
 */
class Road(private val random: Random = SecureRandom()) {
    var distence: Int = 0
    fun spawn(): Enemy{
        distence++
        when(random.nextInt(3)){
            1 -> return Dwarf
            2 -> return Knight
            3 -> return Elf
        }
        throw Exception("Random int wasn't random")
    }
}