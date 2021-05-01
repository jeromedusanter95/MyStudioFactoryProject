package com.jeromedusanter.mystudiofactorytest.data

import com.jeromedusanter.base_android.data.base.IMapper
import com.jeromedusanter.mystudiofactorytest.domain.models.Developer
import javax.inject.Inject

class TrombinoscopeMapper @Inject constructor(
    private val mapper: CollaboraterStatusMapper
) : IMapper<Developer, DeveloperApi, Nothing> {

    override fun mapModelToApiModel(model: Developer): DeveloperApi =
        throw Exception("No use case yet for this method, it should never been called")

    override fun mapModelToLocalModel(model: Developer): Nothing =
        throw Exception("No use case yet for this method, it should never been called")

    override fun mapApiModelToModel(model: DeveloperApi): Developer {
        return Developer(
            id = model.id.toInt(),
            name = model.name,
            description = model.description,
            picture = model.picture,
            status = mapper.mapApiModelToModel(CollaboraterStatusApi.fromServerValue(model.hired))
        )
    }

    override fun mapLocalModelToModel(model: Nothing): Developer =
        throw Exception("No use case yet for this method, it should never been called")
}