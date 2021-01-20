package com.ktvipin.pokeapp.ui.main

import android.os.Bundle
import androidx.lifecycle.Observer
import com.ktvipin.pokeapp.R
import com.ktvipin.pokeapp.databinding.ActivityMainBinding
import com.ktvipin.pokeapp.ui.base.BaseActivity
import com.ktvipin.pokeapp.ui.base.adapter.ItemClickListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(), ItemClickListener {

    override val layoutId: Int
        get() = R.layout.activity_main

    override val viewModelClass: Class<MainViewModel>
        get() = MainViewModel::class.java

    private val pokemanAdapter by lazy {
        PokemanAdapter(
            this
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(toolbar)
       rv_articles.adapter = pokemanAdapter
        viewModel.pokemons.observe(this, Observer {
            pokemanAdapter.submitList(it)
        })
    }

    override fun onItemClick(`object`: Any) {

    }
}