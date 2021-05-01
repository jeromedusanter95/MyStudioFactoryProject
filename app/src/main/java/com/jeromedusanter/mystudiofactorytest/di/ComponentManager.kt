package com.jeromedusanter.mystudiofactorytest.di

import com.jeromedusanter.mystudiofactorytest.Application
import retrofit2.Retrofit

object ComponentManager {

    internal lateinit var applicationComponent: ApplicationComponent

    fun init(application: Application, retrofit: Retrofit) {
        val applicationModule = ApplicationModule(application)
        val retrofitModule = RetrofitModule(retrofit)
        initApplicationComponent(applicationModule, retrofitModule)
    }


    private fun initApplicationComponent(
        applicationModule: ApplicationModule,
        retrofitModule: RetrofitModule
    ) {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(applicationModule)
            .retrofitModule(retrofitModule)
            .build()
    }
}