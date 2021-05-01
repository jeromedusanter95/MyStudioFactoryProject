package com.jeromedusanter.mystudiofactorytest.di

import com.jeromedusanter.mystudiofactorytest.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}