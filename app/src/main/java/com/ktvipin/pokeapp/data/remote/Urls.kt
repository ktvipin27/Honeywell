package com.ktvipin.pokeapp.data.remote

import com.ktvipin.pokeapp.BuildConfig

/**
 * Created by Vipin KT on 20/01/21
 */
object Urls {
    const val BASE_URL = BuildConfig.API_DOMAIN

    object Pokemon {
        const val LIST = "pokemon?limit=10"
    }
}