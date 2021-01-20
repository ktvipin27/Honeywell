package com.ktvipin.pokeapp.ui.main

import androidx.recyclerview.widget.DiffUtil
import com.ktvipin.pokeapp.R
import com.ktvipin.pokeapp.data.model.PokeMon
import com.ktvipin.pokeapp.ui.base.adapter.BaseListAdapter
import com.ktvipin.pokeapp.ui.base.adapter.ItemClickListener

/**
 * Created by Vipin KT on 20/1/21
 */
class PokemanAdapter(private val callback: ItemClickListener) : BaseListAdapter<PokeMon>(COUNTRY_COMPARATOR) {

    override fun getLayoutIdForPosition(position: Int): Int = R.layout.item_pokemon

    override fun getCallbackForPosition(position: Int): Any = callback

    companion object {
        val COUNTRY_COMPARATOR = object : DiffUtil.ItemCallback<PokeMon>() {
            override fun areItemsTheSame(oldItem: PokeMon, newItem: PokeMon): Boolean {
                return oldItem.name == newItem.name
            }

            override fun areContentsTheSame(oldItem: PokeMon, newItem: PokeMon): Boolean {
                return oldItem == newItem
            }
        }
    }
}