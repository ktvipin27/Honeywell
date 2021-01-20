package com.ktvipin.pokeapp.data.remote.response

import com.ktvipin.pokeapp.data.model.PokeMon
import com.google.gson.annotations.SerializedName

data class PokeListResponse (

	@SerializedName("count") val count : Int,
	@SerializedName("next") val next : String,
	@SerializedName("previous") val previous : String,
	@SerializedName("results") val results : List<PokeMon>
)