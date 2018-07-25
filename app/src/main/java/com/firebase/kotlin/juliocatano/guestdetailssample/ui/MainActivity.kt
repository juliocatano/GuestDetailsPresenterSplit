package com.firebase.kotlin.juliocatano.guestdetailssample.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.firebase.kotlin.juliocatano.guestdetailssample.R
import com.firebase.kotlin.juliocatano.guestdetailssample.presenter.GuestDetailCoordinatorPresenter
import com.firebase.kotlin.juliocatano.guestdetailssample.view.GuestDetailCoordinatorView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        GuestDetailCoordinatorPresenter(GuestDetailCoordinatorView(this))
    }
}
