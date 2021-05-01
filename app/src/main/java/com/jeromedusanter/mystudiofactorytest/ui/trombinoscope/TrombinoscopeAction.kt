package com.jeromedusanter.mystudiofactorytest.ui.trombinoscope

import com.jeromedusanter.base_android.ui.base.IAction

sealed class TrombinoscopeAction : IAction {
    object NavToDeveloperDetails : TrombinoscopeAction()
}