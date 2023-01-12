import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.daysofcodeKotlin.API.ImdbService
import com.daysofcodeKotlin.API.toMovie
import com.daysofcodeKotlin.UI.labelMovie


@Composable
@Preview()
fun App() {

    MaterialTheme(colors = darkColors()) {
        Surface {

            val getMovies = ImdbService()
                .getTop250Movies()
                ?.items
                ?.map { it.toMovie() }

            LazyColumn(
                contentPadding = PaddingValues(all = 2.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                if (getMovies != null) {
                    items(getMovies.size) { index ->
                        labelMovie(getMovies[index])
                    }
                }
            }
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "IMDB") {
        App()
    }
}