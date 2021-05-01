package com.jeromedusanter.mystudiofactorytest.domain.models

import com.jeromedusanter.base_android.domain.base.IUseCase
import io.reactivex.Single
import javax.inject.Inject

class GetTrombinoscopeUseCase @Inject constructor(
    private val repository: TrombinoscopeRepository
) : IUseCase<Nothing, Single<List<Developer>>> {


    override fun execute(param: Nothing?): Single<List<Developer>> {
        return repository.getDeveloperList()
    }
}