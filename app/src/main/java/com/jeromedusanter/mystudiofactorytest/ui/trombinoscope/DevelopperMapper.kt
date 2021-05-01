package com.jeromedusanter.mystudiofactorytest.ui.trombinoscope

import com.jeromedusanter.base_android.ui.base.IMapper
import com.jeromedusanter.mystudiofactorytest.R
import com.jeromedusanter.mystudiofactorytest.domain.models.CollaboraterStatus
import com.jeromedusanter.mystudiofactorytest.domain.models.Developer
import javax.inject.Inject

class DeveloperMapper @Inject constructor() : IMapper<Developer, DeveloperUiModel> {

    override fun mapModelToUiModel(model: Developer): DeveloperUiModel {
        return DeveloperUiModel(
            id = model.id,
            name = model.name,
            description = model.description,
            picture = model.picture,
            status = when (model.status) {
                CollaboraterStatus.HIRED -> R.string.developer_detail_hired
                CollaboraterStatus.NOT_HIRED -> R.string.developer_detail_not_hired
                CollaboraterStatus.UNKNOWN -> R.string.developer_detail_unknown
            }
        )
    }

    override fun mapUiModelToModel(model: DeveloperUiModel): Developer =
        throw Exception("No use case yet for this method, it should never been called")
}