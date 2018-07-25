package com.firebase.kotlin.juliocatano.guestdetailssample.view

import android.app.Activity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.ref.WeakReference

class GuestDetailCoordinatorView(activity: Activity) {
    val weakActivity: WeakReference<Activity> = WeakReference(activity)

    fun start() {
        //TODO Init butterknife.
    }

    fun getTravelSection(): View? {
        return weakActivity.get()?.let {
            it.recycler
        }
    }
}