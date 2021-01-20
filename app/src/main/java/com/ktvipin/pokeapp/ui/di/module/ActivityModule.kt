package com.ktvipin.pokeapp.ui.di.module

import com.ktvipin.pokeapp.ui.di.scope.ActivityScope
import com.ktvipin.pokeapp.ui.main.MainActivity
import com.ktvipin.pokeapp.ui.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Vipin KT on 20/01/21
 */
@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [MainModule::class])
    @ActivityScope
    abstract fun contributeMainActivity(): MainActivity

    /*@ContributesAndroidInjector(modules = [DetailsModule::class])
    @ActivityScope
    abstract fun contributeDetailsActivity(): DetailsActivity*/
}