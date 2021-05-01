package com.jeromedusanter.mystudiofactorytest.data

import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {

    @GET("trombi/")
    fun getTrombinoscope(): Single<TrombinoscopeApi>
}