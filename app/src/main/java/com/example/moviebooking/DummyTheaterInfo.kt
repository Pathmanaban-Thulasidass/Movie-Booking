package com.example.moviebooking

data class DummyTheaterInfo(
    val theaterName : String,
    val theaterLocation : String,
    val movieTiming1 : List<String>,
    val movieTiming2: List<String>
)

val dummyTheaterList = listOf(

    DummyTheaterInfo(
        "Saranya Theater",
        "Near Busstand,Harur",
        listOf("9:30am","12:30pm","2:30pm"),
        listOf("6:00pm","9:00pm")
    ),

    DummyTheaterInfo(
        "IMAX",
        "Prozone Mall,Coimbatore",
        listOf("9:30am","10:20am","12:30pm"),
        listOf("2:30pm","6:00pm","9:00pm")
    ),

    DummyTheaterInfo(
        "Karpagam Cinemas",
        "Crosscut Road, Coimbatore",
        listOf("10:20am","12:30pm","6:00pm"),
        listOf("9:00pm")
    ),

    DummyTheaterInfo(
        "Murugan Cinemas",
        "near Pollachi mainRoad, Palani",
        listOf("9:20am","10:10am","12:30pm"),
        listOf("6:00pm","9:00pm","10:20pm")
    ),

    DummyTheaterInfo(
        "Dorais Theater",
        "opposite to Dmart, Pollachi",
        listOf("9:20am","10:10am","6:00pm"),
        listOf("9:00pm")
    )

)