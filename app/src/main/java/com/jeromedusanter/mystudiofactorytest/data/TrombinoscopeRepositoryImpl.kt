package com.jeromedusanter.mystudiofactorytest.data

import com.jeromedusanter.mystudiofactorytest.domain.models.Developer
import com.jeromedusanter.mystudiofactorytest.domain.models.TrombinoscopeRepository
import io.reactivex.Single
import javax.inject.Inject

class TrombinoscopeRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val mapper: TrombinoscopeMapper
) : TrombinoscopeRepository {

    override fun getDeveloperList(): Single<List<Developer>> {
        return apiService.getTrombinoscope().map {
            it.list.map { mapper.mapApiModelToModel(it) }
        }
    }
}