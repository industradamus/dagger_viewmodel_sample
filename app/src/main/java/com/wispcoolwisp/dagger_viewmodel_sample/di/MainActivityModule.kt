package com.wispcoolwisp.dagger_viewmodel_sample.di

import androidx.lifecycle.ViewModel
import com.wispcoolwisp.dagger_viewmodel_sample.MainActivity
import com.wispcoolwisp.dagger_viewmodel_sample.viewmodel.CocaColaViewModel
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
    @ViewModelKey(CocaColaViewModel::class)
    abstract fun bindUserViewModel(cocaColaViewModel: CocaColaViewModel): ViewModel
}