package com.ktvipin.pokeapp.ui.di.module
import com.ktvipin.pokeapp.data.remote.api.PokeApi
import com.ktvipin.pokeapp.data.repository.PokemonRepository
import com.ktvipin.pokeapp.data.repository.PokemonRepositoryImpl
import dagger.Module
import dagger.Provides

/**
 * Created by Vipin KT on 20/01/21
 */
@Module
class RepositoryModule {

    @Provides
    fun providePokemonRepository(
        pokeApi: PokeApi
    ): PokemonRepository = PokemonRepositoryImpl(pokeApi)
}