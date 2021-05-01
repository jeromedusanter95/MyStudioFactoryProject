package com.jeromedusanter.mystudiofactorytest.ui.trombinoscope

import androidx.databinding.ObservableField
import com.jeromedusanter.base_android.ui.base.BaseItemViewModel

class DeveloperItemViewModel(
    private val listener: TrombinoscopeAdapter.Listener?
) : BaseItemViewModel<DeveloperUiModel>() {

    val name = ObservableField<String>()
    val description = ObservableField<String>()

    override fun onItemChanged(item: DeveloperUiModel) {
        name.set(item.name)
        description.set(item.description)
    }

    override val onItemClick: (DeveloperUiModel, Int) -> Unit
        get() = { item: DeveloperUiModel, _: Int -> listener?.onClickItem(item.id) }
}