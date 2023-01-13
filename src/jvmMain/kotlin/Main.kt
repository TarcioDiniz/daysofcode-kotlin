
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.daysofcodeKotlin.UI.MoviesListScreen


@Composable
@Preview()
fun App() {

    MaterialTheme(colors = darkColors()) {
        Surface {
            MoviesListScreen()
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "IMDB") {
        App()
    }
}