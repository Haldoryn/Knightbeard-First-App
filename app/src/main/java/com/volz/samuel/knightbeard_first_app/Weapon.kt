package com.volz.samuel.knightbeard_first_app

/**
 * Created by samue on 03.08.2017.
 */
interface Weapon {
    infix fun beats(enemyWeapon: Weapon) : Boolean
}