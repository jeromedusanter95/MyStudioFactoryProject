package com.jeromedusanter.mystudiofactorytest.ui.trombinoscope

import androidx.navigation.navGraphViewModels
import com.jeromedusanter.mystudiofactorytest.R
import com.jeromedusanter.mystudiofactorytest.databinding.FragmentTrombinoscopeBinding
import com.jeromedusanter.mystudiofactorytest.ui.base.MSFFragment

class TrombinoscopeFragment :
    MSFFragment<FragmentTrombinoscopeBinding, TrombinoscopeAction, TrombinoscopeViewModel>() {

    override val resId: Int = R.layout.fragment_trombinoscope

    override val viewModel: TrombinoscopeViewModel by navGraphViewModels(R.id.navigation_dev) { factory }

    private val adapter by lazy { TrombinoscopeAdapter(buildTrombinoscopeAdapterListener()) }

    override fun initView() {
        super.initView()
        binding.recyclerDeveloper.adapter = adapter
        binding.statefulLayoutTrombinoscope.setErrorView {
            buttonRetry.setOnClickListener { viewModel.getTrombinoscope() }
        }
    }

    override fun onAction(action: TrombinoscopeAction) {
        super.onAction(action)
        when (action) {
            TrombinoscopeAction.NavToDeveloperDetails -> navigate(TrombinoscopeFragmentDirections.actionNavigateToDevDetails())
        }
    }

    private fun buildTrombinoscopeAdapterListener() = object : TrombinoscopeAdapter.Listener {
        override fun onClickItem(itemId: Int) {
            viewModel.selectDeveloper(itemId)
        }
    }
}