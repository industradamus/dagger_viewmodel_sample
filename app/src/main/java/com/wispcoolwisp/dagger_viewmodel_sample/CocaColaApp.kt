package com.wispcoolwisp.dagger_viewmodel_sample

import android.app.Application
import com.wispcoolwisp.dagger_viewmodel_sample.di.AppInjector
import dagger.android.AndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class CocaColaApp : Application(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: AndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
        AppInjector.init(this)
    }


    override fun androidInjector(): AndroidInjector<Any> = androidInjector
}