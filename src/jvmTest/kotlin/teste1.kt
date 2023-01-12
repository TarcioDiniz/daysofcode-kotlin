
import com.daysofcodeKotlin.API.ImdbService
import com.daysofcodeKotlin.API.toMovie

fun main() {
    val json = ImdbService().getTop250Movies()

    println(json?.items?.map { it.toMovie() })






}