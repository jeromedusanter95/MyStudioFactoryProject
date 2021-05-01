package com.jeromedusanter.mystudiofactorytest.ui.trombinoscope.details

import androidx.navigation.navGraphViewModels
import com.jeromedusanter.mystudiofactorytest.R
import com.jeromedusanter.mystudiofactorytest.databinding.FragmentDeveloperDetailsBinding
import com.jeromedusanter.mystudiofactorytest.ui.base.MSFFragment
import com.jeromedusanter.mystudiofactorytest.ui.trombinoscope.TrombinoscopeAction
import com.jeromedusanter.mystudiofactorytest.ui.trombinoscope.TrombinoscopeViewModel

class DeveloperDetailsFragment :
    MSFFragment<FragmentDeveloperDetailsBinding, TrombinoscopeAction, TrombinoscopeViewModel>() {

    override val resId: Int = R.layout.fragment_developer_details

    override val viewModel: TrombinoscopeViewModel by navGraphViewModels(R.id.navigation_dev) { factory }
}