package com.ktvipin.pokeapp.ui.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.ktvipin.pokeapp.ui.di.qualifier.ActivityContext
import com.ktvipin.pokeapp.ui.base.viewmodel.BaseViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject


/**
 * Created by Vipin KT on 20/01/21
 */


abstract class BaseActivity<DB : ViewDataBinding, VM : BaseViewModel> : DaggerAppCompatActivity() {

    @get:LayoutRes
    protected abstract val layoutId: Int

    @Inject
    @field:ActivityContext
    protected lateinit var viewModelProvider: ViewModelProvider

    protected abstract val viewModelClass: Class<VM>

    lateinit var viewModel: VM
        private set

    protected val binding: DB by lazy { DataBindingUtil.setContentView(this, layoutId) as DB }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = viewModelProvider.get(viewModelClass)
        //binding.setVariable(BR.viewModel, viewModel)
        binding.lifecycleOwner = this
        viewModel.handleArguments(intent.extras)
    }
}
