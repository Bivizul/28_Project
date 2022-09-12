package aaa.bivizul.a28project.ui.navigation

import aaa.bivizul.a28project.data.draftutil.getDraftdlg
import aaa.bivizul.a28project.data.entity.DraftkingsItem
import aaa.bivizul.a28project.data.repository.DraftkingsRepository
import aaa.bivizul.a28project.ui.draftkings.DraftkingsScreen
import aaa.bivizul.a28project.ui.draftwidget.Draftprogress
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

fun Tab.id(): Int {
    return when (this) {
        Tab.Tab1 -> 0
        Tab.Tab2 -> 1
        Tab.Tab3 -> 2
    }
}

@Composable
actual fun DraftBottomNavigation(draftcon: Any, draftact: Any) {

    val draftkingsRepository = DraftkingsRepository()

    LaunchedEffect(Unit) {
        try {
            draftkingsRepository.getDraftkings()
        } catch (e: Exception) {
            getDraftdlg(draftcon, draftact)
        }
    }

    val draftkings by draftkingsRepository.draftkings.collectAsState(null)

    if (draftkings != null) {
        draftkings?.draftkings?.let {
            DraftBottomNavigationData(it)
        }
    } else {
        Draftprogress()
    }
}

@Composable
fun DraftBottomNavigationData(
    list: List<DraftkingsItem>,
) {

    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNavigation {
                val currentRoute = navController.currentBackStackEntry?.destination?.route
                Tab.values().forEach { screen ->
                    BottomNavigationItem(
                        icon = {
                            Text(
                                text = list[screen.id()].title,
                                modifier = Modifier.padding(4.dp),
                                style = TextStyle(color = Color.White),
                                textAlign = TextAlign.Center
                            )
                               },
                        selected = currentRoute == screen.toString(),
                        onClick = {
                            navController.navigate(screen.toString()) {
                                launchSingleTop = true
                            }
                        }
                    )
                }
            }
        }
    ) { paddingValues ->
        Surface(modifier = Modifier.padding(paddingValues)) {
            NavHost(navController, startDestination = Tab.values().first().toString()) {
                Tab.values().forEach { screen ->
                    composable(screen.toString(), content = {
                        when (screen) {
                            Tab.Tab1 -> DraftkingsScreen(
                                draftkingsItem = list[screen.id()]
                            )
                            Tab.Tab2 -> DraftkingsScreen(
                                draftkingsItem = list[screen.id()]
                            )
                            Tab.Tab3 -> DraftkingsScreen(
                                draftkingsItem = list[screen.id()]
                            )
                        }
                        BackHandler {
                            System.exit(0)
                        }
                    })
                }
            }
        }
    }
}
