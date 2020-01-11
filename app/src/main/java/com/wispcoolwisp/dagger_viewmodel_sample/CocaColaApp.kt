package com.wispcoolwisp.dagger_viewmodel_sample

import android.app.Application
import com.wispcoolwisp.dagger_viewmodel_sample.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class CocaColaApp : Application(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent
            .builder()
            .application(this)
            .build()
            .inject(this)
    }


    override fun androidInjector(): AndroidInjector<Any> = androidInjector
}