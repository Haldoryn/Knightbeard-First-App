package com.volz.samuel.knightbeard_first_app.Enemys

import com.volz.samuel.knightbeard_first_app.Enemy
import com.volz.samuel.knightbeard_first_app.Life
import com.volz.samuel.knightbeard_first_app.Weapons.Shild
import com.volz.samuel.knightbeard_first_app.Weapon

/**
 * Created by samue on 03.08.2017.
 */
object Dwarf : Enemy {
    override val life: Life
        get()
        {
            if (lifes > 0)
                return Life.alive
            return Life.dead
        }
    override val weapon: Weapon
        get() = Shild
    override var lifes: Int = 1
        get
        set
}