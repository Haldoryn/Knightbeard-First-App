package com.volz.samuel.knightbeard_first_app

import java.util.concurrent.CopyOnWriteArraySet

/**
 * Created by samue on 03.08.2017.
 */
interface ThreadCompleteListener {
    fun notifyOfThreadComplete(thread: Thread)
}

abstract class NotifyingThread : Thread() {
    private val listeners = CopyOnWriteArraySet<ThreadCompleteListener>()
    fun addListener(listener: ThreadCompleteListener) {
        listeners.add(listener)
    }

    fun removeListener(listener: ThreadCompleteListener) {
        listeners.remove(listener)
    }

    private fun notifyListeners() {
        for (listener in listeners) {
            listener.notifyOfThreadComplete(this)
        }
    }

    override fun run() {
        try {
            doRun()
        } finally {
            notifyListeners()
        }
    }

    abstract fun doRun()
}