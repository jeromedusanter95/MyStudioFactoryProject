package com.jeromedusanter.mystudiofactorytest.domain.models

import io.reactivex.Single

interface TrombinoscopeRepository {
    fun getDeveloperList(): Single<List<Developer>>
}