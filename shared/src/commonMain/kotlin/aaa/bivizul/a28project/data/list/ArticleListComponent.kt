package com.arkivanov.sample.shared.multipane.list

import aaa.bivizul.a28project.data.draftutil.disposableScope
import aaa.bivizul.a28project.data.entity.ArticleEntity
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.arkivanov.decompose.value.reduce
import com.arkivanov.sample.shared.multipane.list.ArticleList.Article
import com.arkivanov.sample.shared.multipane.list.ArticleList.Model
import com.badoo.reaktive.disposable.scope.DisposableScope
import com.badoo.reaktive.observable.Observable

internal class ArticleListComponent(
    componentContext: ComponentContext,
//    database: ArticleDatabase,
    selectedArticleId: Observable<Long?>,
    private val onArticleSelected: (id: Long) -> Unit
) : ArticleList, ComponentContext by componentContext, DisposableScope by componentContext.disposableScope() {

    private val _models =
        MutableValue(
            Model(
//                articles = database.getAll().map { it.toArticle() },
                articles = listOf(),
                selectedArticleId = null
            )
        )

    override val models: Value<Model> = _models

    init {
        selectedArticleId.subscribeScoped { id ->
            _models.reduce { it.copy(selectedArticleId = id) }
        }
    }

    private fun ArticleEntity.toArticle(): Article =
        Article(
            id = id,
            title = title
        )

    override fun onArticleClicked(id: Long) {
        onArticleSelected(id)
    }
}
