package com.example.androidarchitecturecomponents.di

import android.app.Application
import com.example.androidarchitecturecomponents.MyApplication
import com.example.core.di.ViewModelFactoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        ActivityBindingModule::class,
        ViewModelFactoryModule::class,
        AndroidSupportInjectionModule::class
    ]
)
interface AppComponent {

    fun inject (application: MyApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}