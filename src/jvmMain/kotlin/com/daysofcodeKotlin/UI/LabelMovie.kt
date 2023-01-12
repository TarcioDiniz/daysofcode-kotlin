package com.daysofcodeKotlin.UI

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.daysofcodeKotlin.extensions.loadImageBitmap
import com.daysofcodeKotlin.model.data.Movie

@Composable
fun labelMovie(movie: Movie){
    Surface {
        Box(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .width(200.dp)
                    .padding(16.dp)
            ) {

                Image(
                    bitmap = movie.movieCover.loadImageBitmap(),
                    contentDescription = "movie cover",
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(6.dp))
                )
                Row(
                    modifier = Modifier.fillMaxWidth()
                        .padding(
                            top = 8.dp,
                            start = 8.dp,
                            end = 8.dp
                        ),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            Icons.Default.Star,
                            "star icon",
                            tint = Color.Yellow,
                            modifier = Modifier.height(16.dp)
                        )
                        Text(
                            text = movie.imDbRating,
                            modifier = Modifier
                                .padding(start = 2.dp),
                            color = Color(0xffeeeeee),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Text(
                        text = movie.year,
                        fontSize = 14.sp,
                        color = Color(0xffeeeeee)
                    )
                }
                Text(
                    text = movie.title,
                    modifier = Modifier
                        .padding(
                            start = 16.dp,
                            top = 8.dp,
                            end = 16.dp
                        ),
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }
        }

    }
}
