package com.jeromedusanter.mystudiofactorytest.ui.trombinoscope

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.databinding.DataBindingUtil
import com.jeromedusanter.mystudiofactorytest.R
import com.jeromedusanter.mystudiofactorytest.databinding.SflTrombinoscopeErrorBinding
import cz.kinst.jakub.view.StatefulLayout

class TrombinoscopeStatefulLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : StatefulLayout(context, attrs, defStyleAttr) {

    init {
        setStateView(
            State.LOADING.value,
            LayoutInflater.from(getContext()).inflate(
                R.layout.sfl_trombinoscope_loading,
                null
            )
        )

        setStateView(
            State.EMPTY.value,
            LayoutInflater.from(getContext()).inflate(
                R.layout.sfl_trombinoscope_empty,
                null
            )
        )
    }

    fun setErrorView(setup: SflTrombinoscopeErrorBinding.() -> Unit) {
        val binding = DataBindingUtil.inflate<SflTrombinoscopeErrorBinding>(
            LayoutInflater.from(context),
            R.layout.sfl_trombinoscope_error,
            this,
            false
        )
        setStateView(State.ERROR.value, binding.root)
        setup.invoke(binding)
    }

    enum class State constructor(val value: String) {
        CONTENT(StatefulLayout.State.CONTENT),
        ERROR("error"),
        LOADING("loading"),
        EMPTY("empty")
    }
}