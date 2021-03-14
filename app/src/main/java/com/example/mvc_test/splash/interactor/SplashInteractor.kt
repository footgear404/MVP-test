package com.example.mvc_test.splash.interactor

import com.example.mvc_test.splash.SplashContract

class SplashInteractor(
    val repository: SplashContract.Repository
): SplashContract.Interactor{

    override fun getConfig(callback: (param: List<Int>) -> Unit) {
        repository.downloadConfig(callback)
    }

}
