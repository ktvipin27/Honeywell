package com.ktvipin.pokeapp.ui.details

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ktvipin.pokeapp.R
import com.ktvipin.pokeapp.data.model.PokeMon
import com.ktvipin.pokeapp.databinding.ActivityMainBinding
import com.ktvipin.pokeapp.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class DetailsActivity : BaseActivity<ActivityMainBinding, DetailsViewModel>() {

    override val layoutId: Int
        get() = R.layout.activity_details

    override val viewModelClass: Class<DetailsViewModel>
        get() = DetailsViewModel::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener { onBackPressed() }

        viewModel.pokeMon.observe(this,{
            supportActionBar?.title = it.name
        })
    }

    companion object{
        const val EXTRA_DATA = "pokemon"

        fun open(fromActivity: Activity, pokemon: PokeMon) {
            fromActivity.startActivity(
                Intent(fromActivity, DetailsActivity::class.java).apply {
                    putExtra(EXTRA_DATA, pokemon)
                }
            )
        }
    }

}