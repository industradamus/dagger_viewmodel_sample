package com.wispcoolwisp.dagger_viewmodel_sample.di

import com.wispcoolwisp.dagger_viewmodel_sample.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class MainActivityModule {

    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    abstract fun bindAndroidInjectorFactory(factory: MainActivitySubComponent.Factory): AndroidInjector.Factory<*>
}