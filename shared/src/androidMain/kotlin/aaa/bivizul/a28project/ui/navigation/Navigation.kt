package aaa.bivizul.a28project.ui.navigation

import aaa.bivizul.a28project.data.repository.DraftresRepository
import aaa.bivizul.a28project.ui.draft.DraftScreen
import aaa.bivizul.a28project.ui.main.MainScreen
import android.app.Activity
import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
actual fun Navigation() {

    val navHostController: NavHostController = rememberNavController()
    val startDestination: String = Routes.Draft.route

    val context = LocalContext.current
    val activity = LocalContext.current as Activity

    val draftresRepository = DraftresRepository()

    NavHost(navController = navHostController, startDestination = startDestination) {

        composable(route = startDestination) {
            DraftScreen(
                navController = navHostController,
                context = context,
                activity = activity,
                draftresRepository = draftresRepository
            )
        }

        composable(route = Routes.Main.route) {
            MainScreen(
                context = context,
                activity = activity,
            )
            BackHandler() {
                activity.finish()
                System.exit(0)
            }
        }
    }
}
