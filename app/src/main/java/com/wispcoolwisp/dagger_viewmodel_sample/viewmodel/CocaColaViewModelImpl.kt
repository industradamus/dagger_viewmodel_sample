package com.wispcoolwisp.dagger_viewmodel_sample.viewmodel

import androidx.lifecycle.MutableLiveData
import com.wispcoolwisp.dagger_viewmodel_sample.DataSource

class CocaColaViewModelImpl(private val dataSource: DataSource) :
    CocaColaViewModel() {

    override val textLivaData = MutableLiveData<String>()

    var counter = 0

    override fun getCola() {
        textLivaData.postValue("${dataSource.getCocaCola()} \ncounter = ${counter++}")
    }
}