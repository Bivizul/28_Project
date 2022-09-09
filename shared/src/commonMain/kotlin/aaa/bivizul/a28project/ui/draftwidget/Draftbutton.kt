package aaa.bivizul.a28project.ui.draftwidget

import aaa.bivizul.a28project.ui.theme.Typography
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Draftbutton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String,
) {
    Button(
        onClick = onClick,
        shape = AbsoluteCutCornerShape(20)
    ) {
        Text(
            modifier = modifier.padding(8.dp),
            text = text,
            style = Typography.h3
        )
    }
}