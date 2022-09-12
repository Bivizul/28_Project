package aaa.bivizul.a28project.data.repository

import aaa.bivizul.a28project.data.entity.Draft
import aaa.bivizul.a28project.data.entity.Draftres
import aaa.bivizul.a28project.data.network.DraftApi
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow

class DraftresRepository {

    private val draftApi = DraftApi()

    private val _draftres = MutableSharedFlow<Draftres>()
    val draftres: SharedFlow<Draftres> = _draftres.asSharedFlow()

    suspend fun getDraft(draft: Draft) {
        val response = draftApi.getDraftres(draft)
        println("DraftresRepository response : $response")
        _draftres.emit(response)
    }

}