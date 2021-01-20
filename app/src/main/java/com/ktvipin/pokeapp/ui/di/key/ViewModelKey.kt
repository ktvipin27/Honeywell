package com.ktvipin.pokeapp.ui.di.key

import androidx.lifecycle.ViewModel
import com.ktvipin.pokeapp.ui.main.MainViewModel
import dagger.MapKey
import kotlin.reflect.KClass

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
@MustBeDocumented
annotation class ViewModelKey(val value: KClass<out ViewModel>)