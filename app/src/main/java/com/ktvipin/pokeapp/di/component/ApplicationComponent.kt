package com.ktvipin.pokeapp.di.component

import com.ktvipin.pokeapp.di.module.ApplicationModule
import com.ktvipin.pokeapp.PokeApp
import com.ktvipin.pokeapp.di.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidSupportInjectionModule::class, ApplicationModule::class, ActivityModule::class,
        NetworkModule::class, ApiModule::class, RepositoryModule::class, TimberModule::class]
)

interface ApplicationComponent : AndroidInjector<PokeApp> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: PokeApp): Builder

        fun build(): ApplicationComponent
    }
}