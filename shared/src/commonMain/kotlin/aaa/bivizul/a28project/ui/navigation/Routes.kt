package aaa.bivizul.a28project.ui.navigation

sealed class Routes(val route: String) {

    object Draft : Routes("draft")
    object Main : Routes("main")

}