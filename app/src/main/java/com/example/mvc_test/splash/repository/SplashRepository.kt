package com.example.mvc_test.splash.repository

import com.example.mvc_test.splash.SplashContract

class SplashRepository : SplashContract.Repository {

    override fun downloadConfig(callback: (param: List<Int>) -> Unit) {
       val list = listOf<Int>(5,4,3)

        callback.invoke(list)
    }

}
