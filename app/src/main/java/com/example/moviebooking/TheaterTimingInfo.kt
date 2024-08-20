package com.example.moviebooking

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun TheaterContainer(
    theater : DummyTheaterInfo,
    viewModal: MainViewModal,
    controller: NavHostController
){

    val context = LocalContext.current
    
    Card(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .size(390.dp, 180.dp)
            .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp),
        border = BorderStroke(2.dp, colorResource(id = R.color.lightViolet))
    ) {
        Column {
            Text(
                text = theater.theaterName,
                modifier = Modifier.padding(start = 8.dp,top = 8.dp),
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp,
                textDecoration = TextDecoration.Underline
            )

            Text(
                text = theater.theaterLocation,
                modifier = Modifier.padding(start = 8.dp),
            )

            Spacer(modifier = Modifier.height(10.dp))

            Divider(
                color = colorResource(id = R.color.lightViolet)
            )
            Row (
                modifier = Modifier.wrapContentWidth()
            ){
                //TODO show timing
                theater.movieTiming1.forEach {
                    timing ->
                        IndividualTheaterTiming(timing = timing, theater = theater){
                            controller.navigate(Screen.SeatSelection.route)
                            viewModal.changeTitle("${theater.theaterName}\n${theater.theaterLocation}")
                        }
                }
            }
            Row (
                modifier = Modifier.wrapContentWidth()
            ){
                //TODO show timing
                theater.movieTiming2.forEach {
                        timing ->
                    IndividualTheaterTiming(timing = timing,theater = theater){
                        controller.navigate(Screen.SeatSelection.route)
                        viewModal.changeTitle("${theater.theaterName}\n${theater.theaterLocation}")
                    }
                }
            }
        }
    }
    
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun IndividualTheaterTiming(
    timing : String,
    theater: DummyTheaterInfo,
    onMovieTimingClicked : () -> Unit
){
    
    Card(
        modifier = Modifier
            .size(100.dp, 45.dp)
            .padding(start = 8.dp, top = 8.dp),
        onClick = {
            //TODO navigate to seat selection page
                  onMovieTimingClicked()
        },
        border = BorderStroke(2.dp, colorResource(id = R.color.lightGray))
    ) {
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = timing, fontWeight = FontWeight.Bold)
        }

    }
}