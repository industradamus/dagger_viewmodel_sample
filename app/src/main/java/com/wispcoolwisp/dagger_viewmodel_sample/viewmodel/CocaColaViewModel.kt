package com.wispcoolwisp.dagger_viewmodel_sample.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wispcoolwisp.dagger_viewmodel_sample.DataSource
import javax.inject.Inject

class CocaColaViewModel @Inject constructor(private val dataSource: DataSource) : ViewModel() {

    val textLivaData = MutableLiveData<String>()

    fun getCola() {
        textLivaData.postValue(dataSource.getCocaCola())
    }
}