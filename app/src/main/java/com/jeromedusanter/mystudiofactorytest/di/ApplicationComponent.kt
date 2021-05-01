package com.jeromedusanter.mystudiofactorytest.di

import com.jeromedusanter.mystudiofactorytest.Application
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApplicationModule::class,
        ActivityModule::class,
        FragmentModule::class,
        ViewModelModule::class,
        AndroidSupportInjectionModule::class,
        RetrofitModule::class,
        RepositoryModule::class
    ]
)
interface ApplicationComponent {
    fun inject(application: Application)
}