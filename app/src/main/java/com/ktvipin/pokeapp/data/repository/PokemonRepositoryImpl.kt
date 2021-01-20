package com.ktvipin.pokeapp.data.repository

import com.ktvipin.pokeapp.data.model.Details
import com.ktvipin.pokeapp.data.remote.api.PokeApi
import com.ktvipin.pokeapp.data.remote.response.PokeListResponse
import javax.inject.Inject

/**
 * Created by Vipin KT on 20/01/21
 */
class PokemonRepositoryImpl @Inject constructor(
    private val pokeApi: PokeApi
) : PokemonRepository {

    override suspend fun fetchPokemonList(limit: Int, offset: Int): PokeListResponse {
        return pokeApi.getList(limit,offset)
    }

    override suspend fun getDetails(url: String): Details {
        return pokeApi.getDetails(url)
    }
}