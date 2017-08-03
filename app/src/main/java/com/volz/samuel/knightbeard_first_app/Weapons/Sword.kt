package com.volz.samuel.knightbeard_first_app.Weapons

import com.volz.samuel.knightbeard_first_app.Weapon

/**
 * Created by samue on 03.08.2017.
 */
object Sword : Weapon {
    override infix fun beats(enemyWeapon: Weapon): Boolean {
        if (enemyWeapon is Shild)
            return true
        return false
    }

}