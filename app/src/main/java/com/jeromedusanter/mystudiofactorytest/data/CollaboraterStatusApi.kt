package com.jeromedusanter.mystudiofactorytest.data

import com.jeromedusanter.base_android.data.base.IApiModel

enum class CollaboraterStatusApi constructor(val serverValue: String) : IApiModel {
    HIRED("Y"),
    NOT_HIRED("N"),
    UNKNOWN("");

    companion object {
        fun fromServerValue(serverValue: String): CollaboraterStatusApi {
            return values().find { it.serverValue == serverValue } ?: UNKNOWN
        }
    }
}