package org.qstuff.containerlove


/*
 * Created by claus on 25.10.17.
 */

interface MvpPresenter<in V : MvpView> {

    fun onAttach(view: V)

    fun onDetach()
}