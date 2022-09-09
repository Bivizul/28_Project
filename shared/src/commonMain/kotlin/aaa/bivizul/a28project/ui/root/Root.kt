package aaa.bivizul.a28project.ui.root

import aaa.bivizul.a28project.ui.draftwidget.Draftbackimg
import aaa.bivizul.a28project.ui.navigation.Navigation
import aaa.bivizul.a28project.ui.theme.A28ProjectTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Root() {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {
        A28ProjectTheme {
            Draftbackimg()
            Navigation()
        }
    }


}