package com.firebase.kotlin.juliocatano.guestdetailssample.presenter

import com.firebase.kotlin.juliocatano.guestdetailssample.model.TravelDocumentChange
import com.firebase.kotlin.juliocatano.guestdetailssample.view.GuestDetailCoordinatorView
import com.firebase.kotlin.juliocatano.guestdetailssample.view.TravelSectionView
import io.reactivex.Observer
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

class GuestDetailCoordinatorPresenter(val view: GuestDetailCoordinatorView) {
    private var compositeDisposable: CompositeDisposable = CompositeDisposable()
    private var sections: List<GuestDetailSection<out Any, out Any>>

    init {
        view.start()
        val presenterObserver = PresenterObserver()
        sections = listOf(
                TravelSectionPresenter(TravelSectionView(view.getTravelSection())).apply {
            subscribeToEvents().subscribe(presenterObserver)
        })
    }

    inner class PresenterObserver: Observer<Any> {
        override fun onComplete() {}

        override fun onSubscribe(d: Disposable) {}

        override fun onNext(t: Any) {
            when(t) {
                t as TravelDocumentChange -> executeSomething()
            }
        }

        override fun onError(e: Throwable) {}
    }

    private fun executeSomething() {

    }
}