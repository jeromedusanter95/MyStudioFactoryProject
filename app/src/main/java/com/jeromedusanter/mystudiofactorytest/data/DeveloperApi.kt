package com.jeromedusanter.mystudiofactorytest.data

import com.google.gson.annotations.SerializedName
import com.jeromedusanter.base_android.data.base.IApiModel

data class DeveloperApi(
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String,
    @SerializedName("description") val description: String,
    @SerializedName("picture") val picture: String,
    @SerializedName("hired") val hired: String
) : IApiModel