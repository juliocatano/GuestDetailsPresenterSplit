package com.firebase.kotlin.juliocatano.guestdetailssample.presenter

import com.firebase.kotlin.juliocatano.guestdetailssample.model.TravelDocumentChange
import com.firebase.kotlin.juliocatano.guestdetailssample.view.TravelSectionView
import io.reactivex.Observable

class TravelSectionPresenter(val view: TravelSectionView) : GuestDetailSection<TravelDocumentChange, TravelDocumentChange> {
    override fun getModel(): TravelDocumentChange {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isValid(): Boolean? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun subscribeToEvents(): Observable<TravelDocumentChange> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}