package com.example.moviebooking

import android.annotation.SuppressLint
import android.os.Build
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import java.time.LocalDate

@SuppressLint("MutableCollectionMutableState")
class MainViewModal : ViewModel() {

    private var title by mutableStateOf("Home")

    fun retrieveTitle() = title

    fun changeTitle(newTitle :String ){
        title = newTitle
    }

    private var showBottomBar by mutableStateOf(true)

    fun isBottomBarBarShow() = showBottomBar

    fun disappearBottomBarShow(){
        showBottomBar = false
    }

    fun appearBottomBarShow(){
        showBottomBar = true
    }

    var bottomBarText by mutableStateOf("")


    var ratingDesc by mutableStateOf("")

    fun onRatingDescChange(newDesc : String){
        ratingDesc = newDesc
    }

    //Background for Ticket Booking Theater Ingo page

    private fun getCurrentDate(): LocalDate {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            LocalDate.now()
        } else {
            TODO("VERSION.SDK_INT < O")
        }
    }

    val todayDate = getCurrentDate()

    var ticketBookingDates by mutableStateOf(
        mutableListOf(todayDate.toString())
    )

    var dateSelectedInTheaInfo by mutableStateOf(todayDate.toString())

    var currentlyViewingMovie by mutableStateOf("")


    var dummyNotifications = mutableStateMapOf<String, Boolean>(
        "Your booking for Inception on July 15 at 7:00 PM has been confirmed! Enjoy your movie!" to false,
        "Seats reserved! Your tickets for The Dark Knight are confirmed. See you on July 16 at 8:30 PM." to false,
        "Reminder: You have a movie booking for Interstellar on July 17 at 5:00 PM. Don't forget your popcorn!" to false,
        "Heads up! Your movie The Matrix is showing tomorrow at 6:00 PM. See you there!" to false,
        "Your booking for Avatar on July 18 at 4:00 PM has been successfully canceled. We hope to see you again soon." to false,
        "We're sorry to see you go! Your booking for Titanic has been canceled. Refunds will be processed shortly." to false,
        "Your booking for Jurassic Park on July 20 at 9:00 PM has been confirmed! Get ready for an adventure!" to false,
        "Don't miss your show! The Avengers is scheduled for July 19 at 7:30 PM." to false,
        "Your reservation for the special screening of Tenet on July 22 at 8:00 PM is confirmed!" to false,
        "Reminder: Your movie booking for Finding Nemo on July 23 at 3:00 PM is approaching." to false,
        "Your booking for Spider-Man: No Way Home has been successfully canceled. We hope to see you again!" to false,
        "Get ready! Your tickets for Black Widow are confirmed for July 25 at 6:00 PM." to false,
        "You have a movie booking for Dune on July 30 at 7:00 PM. Enjoy the show!" to false,
//        "Enjoy your movie! Your booking for Shrek on August 1 at 5:00 PM is confirmed!" to false,
//        "Your booking for the premiere of The Flash on August 3 at 8:30 PM has been successfully made!" to false,
//        "Reminder: Don't forget about your screening of The Lion King on August 5 at 2:00 PM." to false,
//        "Your tickets for the special event screening of Jaws are confirmed for August 7 at 6:00 PM." to false,
//        "We're excited to have you! Your booking for Toy Story on August 10 at 4:00 PM is confirmed!" to false,
//        "Get ready for a thrill! Your booking for Fast & Furious 9 on August 12 at 9:00 PM is confirmed!" to false,
//        "Your booking for the classic Casablanca on August 15 at 5:30 PM has been confirmed!" to false,
//        "Reminder: Your tickets for the animated feature Soul on August 17 at 6:15 PM are ready!" to false
    )



    //Budget For Notification

    private var _noOfNotifications = mutableIntStateOf(dummyNotifications.size)

    val getNoOfNotifications : MutableIntState = _noOfNotifications

    fun updateNoOfNotifications(newNotificationCount : Int){
        _noOfNotifications.intValue = newNotificationCount
    }


}