package com.wispcoolwisp.dagger_viewmodel_sample.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.wispcoolwisp.dagger_viewmodel_sample.viewmodel.CocaColaViewModel
import com.wispcoolwisp.dagger_viewmodel_sample.viewmodel.CocaColaViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(CocaColaViewModel::class)
    fun bindUserViewModel(cocaColaViewModel: CocaColaViewModel): ViewModel

    @Binds
    fun bindViewModelFactory(factory: CocaColaViewModelFactory): ViewModelProvider.Factory
}