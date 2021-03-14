package com.example.mvc_test.splash

interface SplashContract {

    interface View{

        fun showLoader()

        fun hideLoader()

        fun showSplashImage()

    }

    interface Presenter{

        fun onViewStarted()

        fun onViewStopped()

        fun onButtonClicked()

    }

    interface Interactor{

        fun getConfig(callback: (param: List<Int>) -> Unit)

    }

    interface Repository{

        fun downloadConfig(callback: (param: List<Int>) -> Unit)

    }

}
