package com.daysofcodeKotlin.API

import com.daysofcodeKotlin.model.data.Movie


data class Top250Data(
    val items: List<ApiMovie>
)

data class ApiMovie(
    val id: String,
    val rank: String,
    val title: String,
    val fullTitle: String,
    val year: String,
    val image: String,
    val crew: String,
    val imDbRating: String,
    val imDbRatingCount: String
)

fun ApiMovie.toMovie(): Movie = Movie(
    movieCover = this.image,
    title = this.title,
    year = this.year,
    imDbRating = this.imDbRating
)



