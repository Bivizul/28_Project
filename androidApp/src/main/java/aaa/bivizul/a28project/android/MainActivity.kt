package aaa.bivizul.a28project.android

import aaa.bivizul.a28project.root.RootComponent
import aaa.bivizul.a28project.ui.root.RootUi
import aaa.bivizul.a28project.ui.theme.A28ProjectTheme
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.arkivanov.decompose.defaultComponentContext

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val root = RootComponent(defaultComponentContext())

        setContent {
            A28ProjectTheme {
//                    Surface(color = MaterialTheme.colors.background) {
                RootUi(root)
//                    }
            }
        }

    }
}
