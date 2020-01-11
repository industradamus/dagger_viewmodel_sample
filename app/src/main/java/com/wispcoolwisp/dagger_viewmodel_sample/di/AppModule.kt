package com.wispcoolwisp.dagger_viewmodel_sample.di

import com.wispcoolwisp.dagger_viewmodel_sample.DataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class])
class AppModule {

    @AppScope
    @Provides
    fun provideDataSource(): DataSource = DataSource()
}