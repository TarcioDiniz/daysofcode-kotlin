package com.daysofcodeKotlin.model

import com.daysofcodeKotlin.model.data.Movie

class MovieAll {

    fun getAllMovieData(): List<Movie> {
        return listOf(

            Movie(
                "https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_FMjpg_UX674_.jpg",
                "The Shawshank Redemption",
                "1994",
                "9.2"
            ),
            Movie(
                "https://m.media-amazon.com/images/M/MV5BZjgwNzE5ODgtYzAyZC00YTZhLThhNDktMDVlOGNhYzk5NTVkXkEyXkFqcGdeQXVyMTAzMDM4MjM0._V1_FMjpg_UY720_.jpg",
                "O Poderoso Chefão",
                "1972",
                "9.2"
            ),
            Movie(
                "https://m.media-amazon.com/images/M/MV5BM2E1ZjEyYWQtMjgyMy00ZTkwLThkM2QtN2YwM2NmYzAyYjE0XkEyXkFqcGdeQXVyMTAzMDM4MjM0._V1_FMjpg_UX800_.jpg",
                "Batman: O Cavaleiro das Trevas",
                "2008",
                "9.0"
            ),
            Movie(
                "https://m.media-amazon.com/images/M/MV5BOGM2M2Q0ZWQtZjc5NC00NDY4LWIxYTktMDE4ZjIyYTRlNTIyXkEyXkFqcGdeQXVyODc0OTEyNDU@._V1_FMjpg_UX844_.jpg",
                "O Poderoso Chefão II",
                "1974",
                "9.0"
            )
        )


    }

}