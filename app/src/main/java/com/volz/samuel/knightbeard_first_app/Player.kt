package com.volz.samuel.knightbeard_first_app

import com.volz.samuel.knightbeard_first_app.Enemys.Dwarf
import com.volz.samuel.knightbeard_first_app.Weapons.Fist

/**
 * Created by samue on 03.08.2017.
 */
object Player : Entitie {
    override val life: Life
        get()
        {
            if (Dwarf.lifes > 0)
                return Life.alive
            return Life.dead
        }
    override var lifes: Int = 3
        get
        set
    override var weapon: Weapon = Fist
        get() = TODO("not implemented")
        set
    var score: Int = 0
        get
        set
}