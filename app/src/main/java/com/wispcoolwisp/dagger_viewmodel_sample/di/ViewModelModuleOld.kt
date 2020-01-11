package com.wispcoolwisp.dagger_viewmodel_sample.di

import androidx.lifecycle.ViewModelProvider
import com.wispcoolwisp.dagger_viewmodel_sample.viewmodel.CocaColaViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface ViewModelModuleOld {

    @Binds
    fun bindViewModelFactory(factory: CocaColaViewModelFactory): ViewModelProvider.Factory
}