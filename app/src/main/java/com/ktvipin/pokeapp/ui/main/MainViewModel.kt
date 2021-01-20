package com.ktvipin.pokeapp.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ktvipin.pokeapp.data.model.PokeMon
import com.ktvipin.pokeapp.data.repository.PokemonRepository
import com.ktvipin.pokeapp.ui.base.viewmodel.BaseViewModel
import com.ktvipin.pokeapp.ui.di.scope.ActivityScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(private val pokemonRepository: PokemonRepository) :
    BaseViewModel() {

    val pokemons = MutableLiveData<List<PokeMon>>()

    init {
        viewModelScope.launch {
            val result = pokemonRepository.fetchPokemonList(10,0)
            pokemons.value = result.results
        }
    }
}