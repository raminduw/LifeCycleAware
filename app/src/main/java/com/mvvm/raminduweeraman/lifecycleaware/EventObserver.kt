package com.mvvm.raminduweeraman.lifecycleaware

import android.app.AlertDialog
import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent

class EventObserver(val dialog: AlertDialog) : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun showDialog() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun hideDialog() {
        dialog.dismiss()
    }
}