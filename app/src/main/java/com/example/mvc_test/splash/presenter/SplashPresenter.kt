package com.example.mvc_test.splash.presenter

import com.example.mvc_test.splash.SplashContract

class SplashPresenter(
    private val view: SplashContract.View,
    private val interactor: SplashContract.Interactor
) : SplashContract.Presenter{

    override fun onViewStarted() {
    }

    override fun onViewStopped() {
    }

    override fun onButtonClicked() {
        view.showLoader()
        interactor.getConfig {
            view.hideLoader()
        }
    }

}
