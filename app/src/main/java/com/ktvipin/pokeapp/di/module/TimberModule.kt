package com.ktvipin.pokeapp.di.module

import android.util.Log
import com.ktvipin.pokeapp.BuildConfig
import dagger.Module
import dagger.Provides
import timber.log.Timber
import javax.inject.Singleton

/**
 * Created by Vipin KT on 20/01/21
 */
@Module
class TimberModule {

    @Provides
    @Singleton
    fun provideTimberTree(): Timber.Tree = object : Timber.DebugTree() {
        override fun isLoggable(tag: String?, priority: Int) =
            BuildConfig.DEBUG || priority >= Log.INFO
    }
}