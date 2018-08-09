package com.firebase.kotlin.juliocatano.guestdetailssample.presenter

import io.reactivex.Observable

interface GuestDetailSection<M> {
    fun isValid(): Boolean?
    fun subscribeToEvents(): Observable<String>
    fun getModel(): M
}