package com.ktvipin.pokeapp.data.repository

import com.ktvipin.pokeapp.data.model.Details
import com.ktvipin.pokeapp.data.remote.response.PokeListResponse

/**
 * Created by Vipin KT on 20/01/21
 */
interface PokemonRepository {

    suspend fun fetchPokemonList(
        limit: Int,
        offset: Int
    ): PokeListResponse

    suspend fun getDetails(
        url:String
    ): Details
}