package com.jeromedusanter.mystudiofactorytest.ui.trombinoscope

import com.jeromedusanter.mystudiofactorytest.R
import com.jeromedusanter.mystudiofactorytest.databinding.ItemDeveloperBinding
import com.jeromedusanter.mystudiofactorytest.ui.base.MSFAdapter

class TrombinoscopeAdapter(
    private val listener: Listener? = null
) : MSFAdapter<ItemDeveloperBinding, DeveloperUiModel, DeveloperItemViewModel>() {

    override val resId: Int = R.layout.item_developer

    override fun createViewModel() = DeveloperItemViewModel(listener)

    interface Listener {
        fun onClickItem(itemId: Int)
    }
}