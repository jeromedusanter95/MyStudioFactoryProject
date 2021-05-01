package com.jeromedusanter.mystudiofactorytest.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jeromedusanter.mystudiofactorytest.ui.trombinoscope.TrombinoscopeViewModel
import com.jeromedusanter.mystudiofactorytest.ui.main.MainViewModel
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import kotlin.reflect.KClass

@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)

@Module
internal abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    protected abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TrombinoscopeViewModel::class)
    protected abstract fun bindDevViewModel(viewModel: TrombinoscopeViewModel): ViewModel
}