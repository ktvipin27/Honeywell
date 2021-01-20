package com.ktvipin.pokeapp.ui.details

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import com.ktvipin.pokeapp.di.key.ViewModelKey
import com.ktvipin.pokeapp.di.module.ViewModelFactoryModule
import com.ktvipin.pokeapp.di.scope.ActivityScope
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [ViewModelFactoryModule::class])
abstract class DetailsModule {
    @Binds
    @ActivityScope
    abstract fun bindActivity(activity: DetailsActivity): AppCompatActivity

    @Binds
    @IntoMap
    @ViewModelKey(DetailsViewModel::class)
    @ActivityScope
    abstract fun bindViewModel(viewModel: DetailsViewModel): ViewModel
}