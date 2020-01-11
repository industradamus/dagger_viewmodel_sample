package com.wispcoolwisp.dagger_viewmodel_sample.di

import androidx.lifecycle.ViewModel
import com.wispcoolwisp.dagger_viewmodel_sample.viewmodel.CocaColaViewModelImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class MainActivityModule {

    @Binds
    @IntoMap
    @ActivityScope
    @ViewModelKey(CocaColaViewModelImpl::class)
    abstract fun bindUserViewModel(cocaColaViewModel: CocaColaViewModelImpl): ViewModel
}