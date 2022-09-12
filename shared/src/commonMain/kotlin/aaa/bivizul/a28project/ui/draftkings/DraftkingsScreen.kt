package aaa.bivizul.a28project.ui.draftkings

import aaa.bivizul.a28project.data.entity.DraftkingsItem
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DraftkingsScreen(
    modifier: Modifier = Modifier,
    draftkingsItem: DraftkingsItem
) {

    Column(modifier = modifier.padding(6.dp)) {
        Text(text = draftkingsItem.description)
        LazyColumn(verticalArrangement = Arrangement.spacedBy(6.dp)) {
            items(items = draftkingsItem.inwards){inward->
                Text("${inward.id}) ${inward.subtitle} ${inward.text}")
            }
        }
    }
}
