package com.ktvipin.pokeapp.data.model

import com.google.gson.annotations.SerializedName

data class PokeMon (

	@SerializedName("name") val name : String,
	@SerializedName("url") val url : String
)