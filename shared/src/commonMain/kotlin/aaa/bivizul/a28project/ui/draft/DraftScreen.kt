package aaa.bivizul.a28project.ui.draft

import aaa.bivizul.a28project.data.draftutil.*
import aaa.bivizul.a28project.data.entity.Draft
import aaa.bivizul.a28project.data.entity.Draftvar
import aaa.bivizul.a28project.data.repository.DraftresRepository
import aaa.bivizul.a28project.ui.draftwidget.Draftprogress
import aaa.bivizul.a28project.ui.navigation.NavController
import aaa.bivizul.a28project.ui.navigation.Routes
import aaa.bivizul.a28project.ui.navigation.navigate
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import kotlinx.coroutines.delay

@Composable
fun DraftScreen(
    navController: NavController,
    context: Any,
    activity: Any,
    draftresRepository: DraftresRepository,
) {

    LaunchedEffect(Unit) {
        try {
            draftresRepository.getDraft(
                Draft(
                    getDraftmm(),
                    getDraftsim(context),
                    getDraftid(context),
                    getDraftl(),
                    getDraftt()
                )
            )
        } catch (e: Exception) {
            getDraftdlg(context, activity)
        }
    }

    val draftres by draftresRepository.draftres.collectAsState(null)

    if (draftres != null) {
        draftres?.draftres?.let {
            if (it == Draftvar.DVNO.dv) {
                LaunchedEffect(Unit) {
                    delay(1000)
                    navController.navigate(Routes.Main.route)
                }
            } else if (it == Draftvar.DVNP.dv) {
                LaunchedEffect(Unit) {
                    delay(1000)
                    sigDraftOff()
                    navController.navigate(Routes.Main.route)
                }
            } else {
                LaunchedEffect(Unit) {
                    delay(1000)
                    draftcc(context, it)
                    screenDraftExit(activity)
                }
            }
        }
    } else {
        Draftprogress()
    }
}


