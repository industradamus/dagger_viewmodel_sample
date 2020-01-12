package com.wispcoolwisp.dagger_viewmodel_sample


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.wispcoolwisp.dagger_viewmodel_sample.di.Injectable
import com.wispcoolwisp.dagger_viewmodel_sample.extensions.ViewModelClassMap
import com.wispcoolwisp.dagger_viewmodel_sample.extensions.sharedViewModel
import com.wispcoolwisp.dagger_viewmodel_sample.viewmodel.CocaColaViewModel
import kotlinx.android.synthetic.main.fragment_fragment_one.*
import javax.inject.Inject

/**
 * A simple [Fragment] subclass.
 */
class FragmentOne : Fragment(), Injectable {

    @Inject
    lateinit var classMap: ViewModelClassMap
    @Inject
    lateinit var factory: ViewModelProvider.Factory

    private val cocaColaViewModel: CocaColaViewModel by lazy {
        sharedViewModel<CocaColaViewModel>(factory, classMap)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cocaColaViewModel.textLivaData.observe(this, Observer {
            text_view.text = it
        })
        button.setOnClickListener { cocaColaViewModel.getCola() }
    }
}
