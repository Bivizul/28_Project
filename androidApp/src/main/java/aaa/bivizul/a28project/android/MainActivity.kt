package aaa.bivizul.a28project.android

import aaa.bivizul.a28project.ui.counter.CountersContent
import aaa.bivizul.a28project.ui.theme.A28ProjectTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.defaultComponentContext
import com.arkivanov.sample.shared.counters.Counters
import com.arkivanov.sample.shared.counters.CountersComponent

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val root = RootComponent(componentContext = defaultComponentContext())
//        val root2 = rootComponent2(componentContext = defaultComponentContext())
        val rootCount = rootCounters(componentContext = defaultComponentContext())

        setContent {
            A28ProjectTheme {
//                Surface(color = MaterialTheme.colors.background) {
//                RootContent(root = root)
                CountersContent(component = rootCount)
//                }
            }
        }
    }

    private fun rootCounters(componentContext: ComponentContext): Counters =
        CountersComponent(
            componentContext = componentContext,
        )
}
