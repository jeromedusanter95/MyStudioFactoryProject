package com.jeromedusanter.mystudiofactorytest.ui.trombinoscope

import androidx.annotation.StringRes
import com.jeromedusanter.base_android.ui.base.IUiModel

data class DeveloperUiModel(
    val id: Int,
    val name: String,
    val description: String,
    val picture: String,
    @StringRes val status: Int
) : IUiModel