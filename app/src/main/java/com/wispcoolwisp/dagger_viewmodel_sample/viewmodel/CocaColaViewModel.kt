package com.wispcoolwisp.dagger_viewmodel_sample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

abstract class CocaColaViewModel : ViewModel() {

    abstract val textLivaData: LiveData<String>

    abstract fun getCola()
}