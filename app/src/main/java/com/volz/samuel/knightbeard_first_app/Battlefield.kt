package com.volz.samuel.knightbeard_first_app

import com.volz.samuel.knightbeard_first_app.Weapons.Fist

/**
 * Created by samue on 03.08.2017.
 */
class Battlefield(val road: Road, val player: Player, var enemy: Enemy, var watcher: Watcher) {
    fun startFight(){
        player.weapon = Fist
        enemy = road.spawn()
    }
    fun midFight(){
        if (player.weapon beats enemy.weapon)
            enemy.lifes --
        else
            player.lifes--
    }
    fun endFight(){
        if(player.life == Life.dead)
            gameOver()
        else if(enemy.life == Life.dead){
            player.score ++
            startFight()
        }
        resumeFight()
    }
    fun resumeFight(){
        var notifyingThread = NotifyingThread()
        notifyingThread.addListener(this)
        player.weapon = Fist
        object : Thread() {
            override fun run() {
                Thread.sleep(1000)
            }
        }.start()
    }

    fun gameOver(){

    }
}