package com.ktvipin.pokeapp.ui.main

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import com.ktvipin.pokeapp.di.key.ViewModelKey
import com.ktvipin.pokeapp.di.module.ViewModelFactoryModule
import com.ktvipin.pokeapp.di.scope.ActivityScope
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [ViewModelFactoryModule::class])
abstract class MainModule {
    @Binds
    @ActivityScope
    abstract fun bindActivity(activity: MainActivity): AppCompatActivity

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    @ActivityScope
    abstract fun bindViewModel(viewModel: MainViewModel): ViewModel
}