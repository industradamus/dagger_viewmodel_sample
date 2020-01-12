package com.wispcoolwisp.dagger_viewmodel_sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.wispcoolwisp.dagger_viewmodel_sample.di.Injectable
import com.wispcoolwisp.dagger_viewmodel_sample.viewmodel.CocaColaViewModel
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), Injectable {

    @Inject
    lateinit var cocaColaViewModel: CocaColaViewModel

    private var count = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cocaColaViewModel.textLivaData.observe(this, Observer {
            text_view.text = it
        })

        button.setOnClickListener { cocaColaViewModel.getCola() }
        fragment_button.setOnClickListener { openFragment(getFragment()) }
    }

    private fun getFragment(): Fragment {
        return if (count) {
            count = !count
            FragmentOne()
        } else {
            count = !count
            FragmentTwo()
        }
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .addToBackStack(null)
            .commit()
    }
}
