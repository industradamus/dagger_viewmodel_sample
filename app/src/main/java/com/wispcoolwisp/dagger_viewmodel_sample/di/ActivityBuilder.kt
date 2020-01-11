package com.wispcoolwisp.dagger_viewmodel_sample.di

import com.wispcoolwisp.dagger_viewmodel_sample.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun contributeMainActivityInjector(): MainActivity
}