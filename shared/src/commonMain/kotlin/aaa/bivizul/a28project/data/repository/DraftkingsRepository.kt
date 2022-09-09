package aaa.bivizul.a28project.data.repository

import aaa.bivizul.a28project.data.entity.Draftkings
import aaa.bivizul.a28project.data.network.DraftApi
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow

class DraftkingsRepository {

    private val draftApi = DraftApi()

    private val _draftkings = MutableSharedFlow<Draftkings>()
    val draftkings: SharedFlow<Draftkings> = _draftkings.asSharedFlow()

    suspend fun getDraftkings() {
        val response = draftApi.getDraftkings()
        _draftkings.emit(response)
    }

}