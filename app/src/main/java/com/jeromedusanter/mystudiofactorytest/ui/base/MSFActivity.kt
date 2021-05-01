package com.jeromedusanter.mystudiofactorytest.ui.base

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.jeromedusanter.base_android.ui.base.BaseActivity
import com.jeromedusanter.base_android.ui.base.BaseViewModel
import com.jeromedusanter.base_android.ui.base.IAction
import com.jeromedusanter.mystudiofactorytest.BR
import dagger.android.AndroidInjection
import javax.inject.Inject

abstract class MSFActivity<B : ViewDataBinding, A : IAction, VM : BaseViewModel<A>> :
    BaseActivity<B, A, VM>() {

    override val viewModelVariableId: Int = BR.viewModel

    @Inject
    lateinit var factory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

}