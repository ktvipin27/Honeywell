package com.ktvipin.pokeapp

import com.ktvipin.pokeapp.ui.di.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by Vipin KT on 20/01/21
 */
class PokeApp : DaggerApplication() {

    /*@Inject
    lateinit var timberTree: Timber.Tree*/

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder().application(this).build()
    }

    override fun onCreate() {
        super.onCreate()
        //Timber.plant(timberTree)
    }

}