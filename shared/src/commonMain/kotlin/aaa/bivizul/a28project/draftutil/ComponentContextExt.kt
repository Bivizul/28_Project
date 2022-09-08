package aaa.bivizul.a28project.draftutil

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.essenty.lifecycle.doOnDestroy
import com.badoo.reaktive.disposable.scope.DisposableScope

internal fun ComponentContext.disposableScope(): DisposableScope {
    val scope = DisposableScope()
    lifecycle.doOnDestroy(scope::dispose)

    return scope
}
