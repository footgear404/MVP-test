package com.example.mvc_test.splash.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mvc_test.splash.SplashContract
import com.example.mvc_test.splash.interactor.SplashInteractor
import com.example.mvc_test.splash.presenter.SplashPresenter
import com.example.mvc_test.splash.repository.SplashRepository

class SplashFragment : Fragment(), SplashContract.View {

    private val repository:SplashContract.Repository = SplashRepository()
    private val interactor: SplashContract.Interactor = SplashInteractor(repository)
    private val presenter: SplashContract.Presenter = SplashPresenter(this, interactor)

    private fun onButtonClicked(){
        presenter.onButtonClicked()
    }

    override fun showLoader() {

    }

    override fun hideLoader() {

    }

    override fun showSplashImage() {

    }

}
