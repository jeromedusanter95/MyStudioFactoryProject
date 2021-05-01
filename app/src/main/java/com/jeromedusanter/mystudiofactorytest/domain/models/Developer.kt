package com.jeromedusanter.mystudiofactorytest.domain.models

import com.jeromedusanter.base_android.domain.base.IModel

data class Developer(
    val id: Int,
    val name: String,
    val description: String,
    val picture: String,
    val status: CollaboraterStatus
) : IModel