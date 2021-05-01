package com.jeromedusanter.mystudiofactorytest.data

import com.google.gson.annotations.SerializedName
import com.jeromedusanter.base_android.data.base.IApiModel

data class TrombinoscopeApi(
    @SerializedName("list") val list: List<DeveloperApi>
) : IApiModel