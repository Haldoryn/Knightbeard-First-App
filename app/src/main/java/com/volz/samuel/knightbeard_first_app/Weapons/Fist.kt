package com.volz.samuel.knightbeard_first_app.Weapons

import com.volz.samuel.knightbeard_first_app.Weapon

/**
 * Created by samue on 03.08.2017.
 */
object Fist: Weapon{
    override fun beats(enemyWeapon: Weapon): Boolean {
        return false
    }
}