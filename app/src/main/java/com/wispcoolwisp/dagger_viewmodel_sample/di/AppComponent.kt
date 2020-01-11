package com.wispcoolwisp.dagger_viewmodel_sample.di

import android.app.Application
import com.wispcoolwisp.dagger_viewmodel_sample.CocaColaApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

@AppScope
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        ActivityBuilder::class]
)
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(cocaColaApp: CocaColaApp)
}
