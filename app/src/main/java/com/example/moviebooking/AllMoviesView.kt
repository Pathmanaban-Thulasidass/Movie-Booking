package com.example.moviebooking

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter

val groupedLangMovie = mapOf(
    "Tamil" to listOf("Indian 2", "Kalki", "Captain Miller", "Karudan", "Maharaja", "Siren"),
    "Telugu" to listOf("RRR", "Baahubali", "Pushpa", "Ala Vaikunthapurramuloo", "Arjun Reddy", "Eega"),
    "Malayalam" to listOf("Drishyam", "Premam", "Lucifer", "Kumbalangi Nights", "Bangalore Days", "Ustad Hotel"),
    "Kannada" to listOf("KGF", "Raajakumara", "Kirik Party", "Tagaru", "Mungaru Male", "Pailwaan"),
    "Hindi" to listOf("3 Idiots", "Dangal", "Dilwale Dulhania Le Jayenge", "Sholay", "Kabir Singh", "Chhichhore"),
    "English" to listOf("Inception", "The Dark Knight", "Titanic", "Avengers: Endgame", "The Godfather", "Forrest Gump")
)


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun AllMoviesView(
    controller: NavHostController,
    viewModal: MainViewModal
){

    LazyColumn(){

        groupedLangMovie.forEach{
            stickyHeader {
                Text(
                    text = it.key,
                    modifier = Modifier.padding(start = 16.dp, top = 16.dp, bottom = 16.dp),
                    textDecoration = TextDecoration.Underline,
                    fontWeight = FontWeight.ExtraBold
                )
                LazyRow(){
                    items(it.value){
                        movieName ->
                        RecommendedMovieItemCard(item = movieName){
                            controller.navigate(Screen.ClickedMovie.route + "/$movieName")
                            viewModal.changeTitle(movieName)
                            viewModal.currentlyViewingMovie = movieName
                        }
                    }
                }
            }
        }

        item {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ){

            }
        }

    }

}
