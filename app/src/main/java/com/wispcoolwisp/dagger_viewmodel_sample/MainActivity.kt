package com.wispcoolwisp.dagger_viewmodel_sample

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.wispcoolwisp.dagger_viewmodel_sample.di.Injectable
import com.wispcoolwisp.dagger_viewmodel_sample.viewmodel.CocaColaViewModel
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.HasAndroidInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val cocaColaViewModel: CocaColaViewModel by viewModels { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cocaColaViewModel.textLivaData.observe(this, Observer {
            text_view.text = it
        })

        button.setOnClickListener { cocaColaViewModel.getCola() }
    }
}
