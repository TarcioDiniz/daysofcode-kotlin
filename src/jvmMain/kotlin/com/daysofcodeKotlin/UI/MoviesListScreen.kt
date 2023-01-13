package com.daysofcodeKotlin.UI

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.daysofcodeKotlin.API.ImdbService
import com.daysofcodeKotlin.API.toMovie

@Composable
fun MoviesListScreen(){

    val getMovies = ImdbService()
        .getTop250Movies()
        ?.items
        ?.map { it.toMovie() }

    LazyVerticalGrid(
        columns = GridCells.Adaptive(150.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        if (getMovies != null) {
            items(getMovies.size) { index ->
                labelMovie(getMovies[index])
            }
        }
    }

}
