package com.ktvipin.pokeapp.ui.details

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ktvipin.pokeapp.data.model.Ability
import com.ktvipin.pokeapp.data.model.Details
import com.ktvipin.pokeapp.data.model.PokeMon
import com.ktvipin.pokeapp.data.repository.PokemonRepository
import com.ktvipin.pokeapp.ui.base.viewmodel.BaseViewModel
import com.ktvipin.pokeapp.ui.details.DetailsActivity.Companion.EXTRA_DATA
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject

class DetailsViewModel @Inject constructor(private val pokemonRepository: PokemonRepository) :
    BaseViewModel() {

     val pokemonDetails = MutableLiveData<Details>()
     val abilities = MutableLiveData<List<Ability>>()
     val abilitiesString = MutableLiveData<String>()

    val pokeMon = MutableLiveData<PokeMon>()

    override fun handleArguments(extras: Bundle?) {
        super.handleArguments(extras)
        extras?.let {
           val pokeMonData = it.get(EXTRA_DATA) as PokeMon
            this.pokeMon.value = pokeMonData

            fetData(pokeMonData)
        }
    }

    private fun fetData(pokeMonData: PokeMon): Job {
        return viewModelScope.launch {
            val details = pokemonRepository.getDetails(pokeMonData.url)
            pokemonDetails.value = details

            val abilityList = mutableListOf<Ability>()
            details.abilities.forEach {
                abilityList.add(it.ability)
            }
            abilitiesString.value = abilityList.map { it.name }.joinToString("\n")
            abilities.value = abilityList
        }
    }
}