package com.jeromedusanter.mystudiofactorytest.ui.base

import androidx.databinding.ViewDataBinding
import com.jeromedusanter.base_android.ui.base.BaseAdapter
import com.jeromedusanter.base_android.ui.base.BaseItemViewModel
import com.jeromedusanter.base_android.ui.base.IUiModel
import com.jeromedusanter.mystudiofactorytest.BR

abstract class MSFAdapter<B : ViewDataBinding, O : IUiModel, VM : BaseItemViewModel<O>> :
    BaseAdapter<B, O, VM>() {

    override val viewModelVariableId = BR.viewModel
}