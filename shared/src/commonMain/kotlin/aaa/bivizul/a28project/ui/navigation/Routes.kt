package aaa.bivizul.a28project.ui.navigation

sealed class Routes(val route: String) {

    object Draft : Routes("draft")
    object Main : Routes("main")
    object Draftcc: Routes("draftcc")
    object LeveragesDetail : Routes("leverages_detail")
    object LeveragesItemId : Routes("leverages_item_id")

}