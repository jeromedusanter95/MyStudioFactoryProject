package com.jeromedusanter.mystudiofactorytest.di

import com.jeromedusanter.mystudiofactorytest.ui.trombinoscope.details.DeveloperDetailsFragment
import com.jeromedusanter.mystudiofactorytest.ui.trombinoscope.TrombinoscopeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    abstract fun contributeDevListFragment(): TrombinoscopeFragment

    @ContributesAndroidInjector
    abstract fun contributeDevDetailsFragment(): DeveloperDetailsFragment
}