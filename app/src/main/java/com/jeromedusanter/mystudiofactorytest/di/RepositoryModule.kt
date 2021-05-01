package com.jeromedusanter.mystudiofactorytest.di

import com.jeromedusanter.mystudiofactorytest.data.TrombinoscopeRepositoryImpl
import com.jeromedusanter.mystudiofactorytest.domain.models.TrombinoscopeRepository
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {
    @Binds
    internal abstract fun bindsRepository(instance: TrombinoscopeRepositoryImpl): TrombinoscopeRepository
}