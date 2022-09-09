package aaa.bivizul.a28project.ui.counter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.slide
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.arkivanov.sample.shared.counters.Counters

@OptIn(ExperimentalDecomposeApi::class)
@Composable
fun CountersContent(component: Counters, modifier: Modifier = Modifier) {
    ColumnOrRow(modifier = modifier) {
        Children(
            stack = component.firstChildStack,
            modifier = Modifier.clipToBounds(),
            animation = stackAnimation(slide()),
        ) {
            CounterContent(component = it.instance)
        }

        Children(
            stack = component.secondChildStack,
            modifier = Modifier.clipToBounds(),
            animation = stackAnimation(slide()),
        ) {
            CounterContent(component = it.instance)
        }
    }
}

@Composable
private fun ColumnOrRow(modifier: Modifier, content: @Composable () -> Unit) {
//    when (orientation) {
//        Orientation.PORTRAIT ->
            Column(
                modifier = modifier,
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) { content() }

//        Orientation.LANDSCAPE ->
//            Row(
//                modifier = modifier,
//                horizontalArrangement = Arrangement.SpaceEvenly,
//                verticalAlignment = Alignment.CenterVertically,
//            ) { content() }
//    }
}

//@Preview
//@Composable
//internal fun TabContentPreview() {
//    CountersContent(component = CountersPreview())
//}
//
//internal class CountersPreview : Counters {
//    override val firstChildStack: Value<ChildStack<*, Counter>> =
//        MutableValue(
//            ChildStack(
//                configuration = Unit,
//                instance = CounterPreview(),
//            )
//        )
//
//    override val secondChildStack: Value<ChildStack<*, Counter>> =
//        MutableValue(
//            ChildStack(
//                configuration = Unit,
//                instance = CounterPreview(),
//            )
//        )
//}
