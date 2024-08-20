package com.example.moviebooking

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter

val movieNames = listOf<String>("Indian 2","KILL","Kalki","MahaRaja","M.S.Dhoni","Karudan","Despicable ME 4")
val grouped = listOf<String>("Recommended Movies").groupBy { it[0] }

@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterialApi::class)
@Composable
fun HomeView(
    controller: NavHostController,
    viewModal: MainViewModal
){

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        // Ads Row
        item {
            LazyRow(
                modifier = Modifier.padding(top = 20.dp)
            ) {
                items(adsInScreen) { item ->
                    HomePageAds(item)
                }
            }
        }

        // Grouped movies with sticky header and lazy row
        grouped.forEach {
            group ->
            stickyHeader {
                Text(text = group.value[0], modifier = Modifier.padding(16.dp))
            }
            item {
                LazyRow {
                    items(movieNames) { movie ->
                        RecommendedMovieItemCard(item = movie) {
                            controller.navigate(Screen.ClickedMovie.route + "/$movie")
                            viewModal.changeTitle(movie)
                            viewModal.currentlyViewingMovie = movie
                        }
                    }
                }
            }
        }

        // Location Card
        item {
            Card(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(16.dp)
                    .size(390.dp, 70.dp),
                border = BorderStroke(3.dp, colorResource(id = R.color.topViolet))
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_changelocation),
                        contentDescription = null
                    )
                    Text(text = "Browse By Cinemas          >>")
                }
            }
        }

        item {
            Row {
                MovieLanguages(langName = "Tamil", controller =  controller)
                MovieLanguages(langName = "Telugu", controller =  controller)
            }
        }

        item {
            Row {
                MovieLanguages(langName = "Malayalam", controller =  controller)
                MovieLanguages(langName = "Kanata", controller =  controller)
            }
        }

        item {
            Row {
                MovieLanguages(langName = "English", controller =  controller)
                MovieLanguages(langName = "Hindi", controller =  controller)
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

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MovieLanguages(
    langName : String,
    controller: NavHostController
){
    Card(
        onClick = {
                  controller.navigate(Screen.BottomScreen.Movie.route)
        },
        modifier = Modifier
            .padding(8.dp)
            .size(170.dp, 100.dp),
        border = BorderStroke(3.dp, colorResource(id = R.color.topViolet)),

    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = langName,
                fontWeight = FontWeight.ExtraBold,
                textDecoration = TextDecoration.Underline
            )
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HomePageAds(item : String){
    
    Card(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .size(380.dp, 150.dp)
            .background(colorResource(id = R.color.lightGray))
            .padding(start = 10.dp, end = 10.dp),
        border = BorderStroke(3.dp, colorResource(id = R.color.topViolet))
    ) {
        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = item, fontWeight = FontWeight.ExtraBold)
        }

    }
    
}
//
//@OptIn(ExperimentalMaterialApi::class)
//@Composable
//fun RecommendedMovieItem(
//    item : String,
//    onMovieClicked : () -> Unit
//){
//
//    val url = movieImg[item]
//
//    Card(
//        onClick = { onMovieClicked() },
//        modifier = Modifier
//            .size(180.dp, 250.dp)
//            .padding(start = 10.dp, end = 5.dp),
//        border = BorderStroke(3.dp, colorResource(id = R.color.black))
//    ) {
//        Column (
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ){
//            Image(
//                modifier = Modifier.fillMaxSize(),
//                painter = rememberAsyncImagePainter(url),
//                contentDescription = null,
//                contentScale = ContentScale.FillHeight
//            )
//
//        }
//
//    }
//
//}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun RecommendedMovieItemCard(
    item : String,
    onMovieClicked : () -> Unit
) {

    val url = movieImg[item]

    Card(
        onClick = { onMovieClicked() },
        modifier = Modifier
            .size(180.dp, 250.dp)
            .padding(start = 10.dp, end = 5.dp),
        border = BorderStroke(3.dp, colorResource(id = R.color.black))
    ){
        Box(
            modifier = Modifier.fillMaxHeight()
        ){
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = rememberAsyncImagePainter(url),
                contentDescription = null,
                contentScale = ContentScale.FillHeight
            )
            Box(
                modifier = Modifier.
                    fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 200f
                        )
                    )
            )

        }

    }



}

val adsInScreen = listOf("Ad1","Ad2","Ad3")