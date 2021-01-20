package com.ktvipin.pokeapp.data.remote.api

import com.ktvipin.pokeapp.data.model.Details
import com.ktvipin.pokeapp.data.remote.Urls
import com.ktvipin.pokeapp.data.remote.response.PokeListResponse
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

/**
 * Created by Vipin KT on 20/01/21
 */
interface PokeApi {

    @GET(Urls.Pokemon.LIST)
    suspend fun getList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): PokeListResponse

    @GET
    suspend fun getDetails(@Url url: String): Details
}