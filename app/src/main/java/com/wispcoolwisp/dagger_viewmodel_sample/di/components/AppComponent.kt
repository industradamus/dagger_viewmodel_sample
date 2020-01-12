package com.wispcoolwisp.dagger_viewmodel_sample.di.components

import android.app.Application
import com.wispcoolwisp.dagger_viewmodel_sample.CocaColaApp
import com.wispcoolwisp.dagger_viewmodel_sample.di.modules.ActivityInjectionModule
import com.wispcoolwisp.dagger_viewmodel_sample.di.modules.AppModule
import com.wispcoolwisp.dagger_viewmodel_sample.di.modules.ViewModelModule
import com.wispcoolwisp.dagger_viewmodel_sample.di.scope.AppScope
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

@AppScope
@Component(
    modules = [
        AppModule::class,
        AndroidInjectionModule::class,
        ActivityInjectionModule::class,
        ViewModelModule::class]
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
