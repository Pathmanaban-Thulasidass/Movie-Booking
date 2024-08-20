package com.example.moviebooking

import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun TheaterInfoView(
    viewModal: MainViewModal,
    controller: NavHostController
){

    val todayDate = viewModal.todayDate

    for (i in 1L..5L){
        viewModal.ticketBookingDates.add(todayDate.plusDays(i).toString())
    }


    LazyColumn(){

        item {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(top = 8.dp)
            ){

                viewModal.ticketBookingDates.forEach {
                    date ->
                    if(viewModal.dateSelectedInTheaInfo == date){
                        TheaterInfoDate(
                            selected = true,
                            detailedDate = date
                        ){
                            viewModal.dateSelectedInTheaInfo = date
                        }

                    }
                    else{
                        TheaterInfoDate(
                            selected = false,
                            detailedDate = date
                        ){
                            viewModal.dateSelectedInTheaInfo = date
                        }
                    }

                }

            }
        }

        item {
            dummyTheaterList.forEach {
                    theater ->
                TheaterContainer(theater = theater, viewModal = viewModal, controller = controller)
            }
        }

        item {
            Row (
                modifier = Modifier.fillMaxWidth().height(70.dp)
            ){
                //To fill the empty space at bottom
            }
        }

    }

}

@Composable
fun TheaterInfoDate(
    selected : Boolean,
    detailedDate : String,
    onTicketDateClicked : () -> Unit
){

    val date = "${detailedDate[8]}${detailedDate[9]}"

    var month = detailedDate[6].toString()

    if(detailedDate[7].isDigit()){
        month = "${detailedDate[6]}${detailedDate[7]}"
    }


    val monthName = mapOf(
        "1" to "JAN",
        "2" to "FEB",
        "3" to "MAR",
        "4" to "APR",
        "5" to "MAY",
        "6" to "JUN",
        "7" to "JUL",
        "8" to "AUG",
        "9" to "SEP",
        "10" to "OCT",
        "11" to "NOV",
        "12" to "DEC"
    )

    val dateBg = if(selected) colorResource(id = R.color.lightViolet) else Color.Transparent
    val textColor = if(selected) Color.White else Color.Black

    Column (
        modifier= Modifier
            .size(65.dp, 80.dp)
            .border(1.dp, colorResource(id = R.color.darkGray))
            .background(dateBg)
            .clickable {
                onTicketDateClicked()
            },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = date,
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = textColor
        )

        Text(
            text = monthName[month].toString(),
            color = textColor
        )
    }


}