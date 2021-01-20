package com.ktvipin.pokeapp.di.module

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.ktvipin.pokeapp.ui.base.viewmodel.factory.ViewModelFactory
import com.ktvipin.pokeapp.di.qualifier.ActivityContext
import com.ktvipin.pokeapp.di.scope.ActivityScope
import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * Created by Vipin KT on 20/01/21
 */
@Module
abstract class ViewModelFactoryModule {

    @Binds
    @ActivityScope
    abstract fun bindViewModelFactory(
        viewModelFactory: ViewModelFactory
    ): ViewModelProvider.Factory

    companion object {
        @Provides
        @ActivityScope
        @ActivityContext
        fun provideViewModelProvider(
            activity: AppCompatActivity,
            viewModelFactory: ViewModelProvider.Factory
        ): ViewModelProvider = ViewModelProvider(activity, viewModelFactory)
    }
}