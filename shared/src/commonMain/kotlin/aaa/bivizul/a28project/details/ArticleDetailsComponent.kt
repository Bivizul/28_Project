package aaa.bivizul.a28project.details

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.arkivanov.decompose.value.reduce
import aaa.bivizul.a28project.database.ArticleDatabase
import aaa.bivizul.a28project.database.ArticleEntity
import aaa.bivizul.a28project.details.ArticleDetails.Article
import aaa.bivizul.a28project.details.ArticleDetails.Model
import aaa.bivizul.a28project.draftutil.disposableScope
import com.badoo.reaktive.disposable.scope.DisposableScope
import com.badoo.reaktive.observable.Observable

internal class ArticleDetailsComponent(
    componentContext: ComponentContext,
    database: ArticleDatabase,
    articleId: Long,
    isToolbarVisible: Observable<Boolean>,
    private val onFinished: () -> Unit
) : ArticleDetails, ComponentContext by componentContext, DisposableScope by componentContext.disposableScope() {

    private val _models =
        MutableValue(
            Model(
                isToolbarVisible = false,
                article = database.getById(id = articleId).toArticle()
            )
        )

    override val models: Value<Model> = _models

    init {
        isToolbarVisible.subscribeScoped { isVisible ->
            _models.reduce { it.copy(isToolbarVisible = isVisible) }
        }
    }

    private fun ArticleEntity.toArticle(): Article =
        Article(
            title = title,
            text = text
        )

    override fun onCloseClicked() {
        onFinished()
    }
}
