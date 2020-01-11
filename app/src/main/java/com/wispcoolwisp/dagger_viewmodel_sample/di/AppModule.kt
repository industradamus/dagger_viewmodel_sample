package com.wispcoolwisp.dagger_viewmodel_sample.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.wispcoolwisp.dagger_viewmodel_sample.DataSource
import dagger.Module
import dagger.Provides
import javax.inject.Provider
import javax.inject.Singleton

@Module
class AppModule {

    @AppScope
    @Provides
    fun provideDataSource(): DataSource = DataSource()

    @Provides
    @AppScope
    fun viewModelFactory(
        providers: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
    ) = object : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            val t = providers[modelClass] ?: providers
                .asIterable()
                .firstOrNull { it.key.isAssignableFrom(modelClass) }
                ?.value

            return requireNotNull(t).get() as T
        }
    }
}