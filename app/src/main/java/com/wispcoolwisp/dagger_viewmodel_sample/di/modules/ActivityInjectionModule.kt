package com.wispcoolwisp.dagger_viewmodel_sample.di.modules

import com.wispcoolwisp.dagger_viewmodel_sample.FragmentOne
import com.wispcoolwisp.dagger_viewmodel_sample.FragmentTwo
import com.wispcoolwisp.dagger_viewmodel_sample.MainActivity
import com.wispcoolwisp.dagger_viewmodel_sample.di.modules.ViewModelModule
import com.wispcoolwisp.dagger_viewmodel_sample.di.scope.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityInjectionModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [ViewModelModule.InjectViewModel::class])
    abstract fun contributeMainActivityInjector(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ViewModelModule.InjectViewModel::class])
    abstract fun contributeFragmentOneInjector(): FragmentOne

    @ActivityScope
    @ContributesAndroidInjector(modules = [ViewModelModule.InjectViewModel::class])
    abstract fun contributeFragmentTwoInjector(): FragmentTwo
}