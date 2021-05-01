package com.jeromedusanter.mystudiofactorytest.data

import com.jeromedusanter.base_android.data.base.IMapper
import com.jeromedusanter.mystudiofactorytest.domain.models.CollaboraterStatus
import javax.inject.Inject

class CollaboraterStatusMapper @Inject constructor() :
    IMapper<CollaboraterStatus, CollaboraterStatusApi, Nothing> {

    override fun mapModelToApiModel(model: CollaboraterStatus): CollaboraterStatusApi =
        throw Exception("No use case yet for this method, it should never been called")

    override fun mapModelToLocalModel(model: CollaboraterStatus): Nothing =
        throw Exception("No use case yet for this method, it should never been called")

    override fun mapApiModelToModel(model: CollaboraterStatusApi): CollaboraterStatus {
        return when (model) {
            CollaboraterStatusApi.HIRED -> CollaboraterStatus.HIRED
            CollaboraterStatusApi.NOT_HIRED -> CollaboraterStatus.NOT_HIRED
            CollaboraterStatusApi.UNKNOWN -> CollaboraterStatus.UNKNOWN
        }
    }

    override fun mapLocalModelToModel(model: Nothing): CollaboraterStatus =
        throw Exception("No use case yet for this method, it should never been called")
}