package com.ktvipin.pokeapp.ui.di.module

import android.app.Application
import android.content.Context
import com.ktvipin.pokeapp.PokeApp
import com.ktvipin.pokeapp.ui.di.qualifier.ApplicationContext
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

/**
 * Created by Vipin KT on 20/01/21
 */
@Module
abstract class ApplicationModule {
    @Binds
    @Singleton
    abstract fun bindApplication(application: PokeApp): Application

    @Binds
    @Singleton
    @ApplicationContext
    abstract fun bindApplicationContext(application: Application): Context
}