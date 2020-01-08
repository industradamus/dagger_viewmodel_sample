package com.wispcoolwisp.dagger_viewmodel_sample

import android.app.Application
import com.wispcoolwisp.dagger_viewmodel_sample.di.DaggerAppComponent

class CocaColaApp : Application() {

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent
            .builder()
            .application(this)
            .build()
            .inject(this)
    }
}