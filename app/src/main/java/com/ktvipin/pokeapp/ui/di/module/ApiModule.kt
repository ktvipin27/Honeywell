package com.ktvipin.pokeapp.ui.di.module

import com.ktvipin.pokeapp.data.remote.api.PokeApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Created by Vipin KT on 20/01/21
 */
@Module
class ApiModule {

    @Provides
    @Singleton
    fun provideArticlesApi(retrofit: Retrofit): PokeApi =
        retrofit.create(PokeApi::class.java)
}