package com.jeromedusanter.mystudiofactorytest.ui.trombinoscope

import androidx.databinding.ObservableField
import com.jeromedusanter.base_android.ui.base.BaseViewModel
import com.jeromedusanter.base_android.ui.utils.addOnPropertyChanged
import com.jeromedusanter.mystudiofactorytest.domain.models.Developer
import com.jeromedusanter.mystudiofactorytest.domain.models.GetTrombinoscopeUseCase
import com.jeromedusanter.mystudiofactorytest.ui.trombinoscope.details.DeveloperDetailsUiModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.addTo
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class TrombinoscopeViewModel @Inject constructor(
    private val getTrombinoscopeUseCase: GetTrombinoscopeUseCase,
    private val mapper: DeveloperMapper
) : BaseViewModel<TrombinoscopeAction>() {

    val detailsUiModel = ObservableField<DeveloperDetailsUiModel>()
    private val _selectedDeveloper = ObservableField<Developer>()

    val trombinoscopeUiState = ObservableField<TrombinoscopeStatefulLayout.State>()
    val trombinoscopeUiModel = ObservableField<TrombinoscopeUiModel>()
    private val _trombinoscope = ObservableField<List<Developer>>()

    init {
        getTrombinoscope()

        _selectedDeveloper.addOnPropertyChanged {
            it.get()?.let {
                detailsUiModel.set(DeveloperDetailsUiModel(mapper.mapModelToUiModel(it)))
            }
        }

        _trombinoscope.addOnPropertyChanged {
            it.get()?.let {
                trombinoscopeUiModel.set(
                    TrombinoscopeUiModel(it.map { mapper.mapModelToUiModel(it) })
                )
            }
        }
    }

    fun selectDeveloper(id: Int) {
        _selectedDeveloper.set(_trombinoscope.get()?.find { it.id == id })
        dispatch(TrombinoscopeAction.NavToDeveloperDetails)
    }

    fun getTrombinoscope() {
        getTrombinoscopeUseCase.execute(null)
            .doOnSubscribe { trombinoscopeUiState.set(TrombinoscopeStatefulLayout.State.LOADING) }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ list ->
                _trombinoscope.set(list)
                trombinoscopeUiState.set(
                    if (list.isEmpty()) TrombinoscopeStatefulLayout.State.EMPTY
                    else TrombinoscopeStatefulLayout.State.CONTENT
                )
            }, {
                it.printStackTrace()
                trombinoscopeUiState.set(TrombinoscopeStatefulLayout.State.ERROR)
            })
            .addTo(disposable)
    }
}