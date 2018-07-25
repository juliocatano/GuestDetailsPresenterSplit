package com.firebase.kotlin.juliocatano.guestdetailssample.presenter

import io.reactivex.Observable

interface GuestDetailSection<E, M> {
    fun isValid(): Boolean?
    fun subscribeToEvents(): Observable<E>
    fun getModel(): M
}