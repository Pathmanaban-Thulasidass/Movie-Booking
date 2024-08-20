package com.example.moviebooking.ui.theme

import android.annotation.SuppressLint
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.example.moviebooking.DummyMovies
import com.example.moviebooking.MainViewModal
import com.example.moviebooking.MovieRatingView
import com.example.moviebooking.R
import com.example.moviebooking.Screen
import com.example.moviebooking.dummyActorPhoto
import com.example.moviebooking.dummyMoviesList
import com.example.moviebooking.dummyVideos
import com.example.moviebooking.mainMovieList
import com.example.moviebooking.movieNames

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ClickedMovie(
    movieName : String,
    viewModal: MainViewModal,
    controller: NavHostController
){

    var mainIndex = 0
    var innerIndex = 0

    for (i in 0 until mainMovieList.size) {  // use 'until' to avoid IndexOutOfBoundsException
        val temp = mainMovieList[i]
        for (j in 0 until temp.size) {  // use 'until' to avoid IndexOutOfBoundsException
            if (temp[j].movieName == movieName) {
                mainIndex = i
                innerIndex = j
                break
            }
        }
    }
    

    val movie = mainMovieList[mainIndex][innerIndex]


    Column (
        modifier = Modifier.fillMaxSize()
    ){

        Box(
            modifier = Modifier
                .padding(top = 10.dp, start = 15.dp)

        ){
            VideoScreen(
                movieName = movie.movieName
            )
        }


        Card(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(top = 10.dp, start = 15.dp)
                .size(360.dp, 50.dp),
            backgroundColor = colorResource(id = R.color.lightGray),
            border = BorderStroke(2.dp, colorResource(id = R.color.lightViolet)),
            elevation = 5.dp
        ) {
            Row (
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Icon(painter = painterResource(id = R.drawable.ic_rateus), contentDescription = null)
                Text(text = movie.movieRate)
                Text(text = movie.rateVotedCount)
                Button(
                    onClick = {
                         controller.navigate(Screen.MovieRating.route)
                    },
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.lightViolet))
                ) {
                    Text(text = "Rate this")
                }
            }

        }

//        Text(
//            modifier = Modifier.padding(start = 20.dp,top = 10.dp),
//            text = movie.movieName ,
//            textDecoration = TextDecoration.Underline,
//            fontWeight = FontWeight.ExtraBold
//        )
        
        Spacer(modifier = Modifier.heightIn(20.dp))

        LazyRow(){
            items(movie.movieActors){
                actor ->
                ActorsPhotoView(actorName = actor)
            }
        }

        Text(
            modifier = Modifier.padding(start = 20.dp,top = 10.dp),
            text = "Comments..." ,
            textDecoration = TextDecoration.Underline,
            fontWeight = FontWeight.ExtraBold
        )

        LazyRow(){
            items(movie.movieComment){
                comment ->
                MovieComments(movieComment = comment,movie = movie)
            }
        }

    }


}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ActorNames(
    actorName : String
){

    Card(
        modifier = Modifier
            .size(150.dp, 150.dp)
            .padding(start = 15.dp, top = 20.dp, end = 10.dp),
        border = BorderStroke(3.dp, colorResource(id = R.color.topViolet)),
        onClick = { /*TODO*/ }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = actorName, fontWeight = FontWeight.ExtraBold)
        }
    }
}


@Composable
fun ActorsPhotoView(
    actorName : String
) {

    val url = dummyActorPhoto[actorName]

    Card(
        modifier = Modifier
            .size(150.dp, 150.dp)
            .padding(start = 15.dp, top = 20.dp, end = 10.dp),
        border = BorderStroke(3.dp, colorResource(id = R.color.topViolet)),
    ){
        Box(
            modifier = Modifier.fillMaxHeight()
        ){
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = rememberAsyncImagePainter(url),
                contentDescription = null,
                contentScale = ContentScale.FillBounds
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

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MovieComments(
    movieComment : String,
    movie : DummyMovies
){

    val indexOfComment = movie.movieComment.indexOf(movieComment)

    Card(
        modifier = Modifier
            .size(280.dp, 200.dp)
            .padding(start = 15.dp, top = 20.dp, end = 10.dp),
        border = BorderStroke(3.dp, colorResource(id = R.color.topViolet)),
        onClick = { /*TODO*/ }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),

        ) {
            Text(
                text = movie.commenterName[indexOfComment],
                modifier = Modifier.padding(start = 12.dp, top = 12.dp, bottom = 4.dp),
                textDecoration = TextDecoration.Underline,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = movieComment ,
                modifier = Modifier
                    .wrapContentSize()
                    .padding(8.dp),
                textAlign = TextAlign.Justify
            )
            Icon(
                imageVector = Icons.Default.FavoriteBorder,
                contentDescription = null,
                modifier = Modifier.padding(start = 12.dp)
            )
        }
    }
}


@SuppressLint("SetJavaScriptEnabled")
@Composable
fun VideoScreen(
    movieName: String
) {
    
    val videoUrl = dummyVideos[movieName]

    // YouTube embed URL with iframe
    val videoUrlEmbedded = """
        <html>
            <body style="margin:0;padding:0;">
                <iframe width="100%" height="100%" 
                        src="$videoUrl"
                        frameborder="0" allowfullscreen>
                </iframe>
            </body>
        </html>
    """.trimIndent()

    AndroidView(
        factory = { context ->
            WebView(context).apply {
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
                webViewClient = WebViewClient()
                settings.javaScriptEnabled = true
                settings.loadWithOverviewMode = true
                settings.useWideViewPort = true
                settings.cacheMode = WebSettings.LOAD_NO_CACHE
                loadData(videoUrlEmbedded, "text/html", "utf-8")
            }
        },
        modifier = Modifier.size(width = 360.dp, height = 200.dp) // Set your desired size
    )
}

