package com.ktvipin.pokeapp.ui.base.viewmodel

import android.os.Bundle
import androidx.lifecycle.ViewModel

/**
 * Created by Vipin KT on 20/01/21
 */
abstract class BaseViewModel : ViewModel() {
    open fun handleArguments(extras: Bundle?) {}
}