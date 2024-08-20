package com.example.moviebooking

import androidx.annotation.DrawableRes

sealed class Screen(val title : String, val route : String) {

    sealed class DrawerScreen(val dTitle : String, val dRoute : String, @DrawableRes val icon : Int)
        :Screen(dTitle,dRoute)
    {
//        object UserName : DrawerScreen(
//            "UserName",
//            "username",
//            R.drawable.ic_profile
//        )

        object Profile : DrawerScreen(
            "Profile",
            "profile",
            R.drawable.ic_profile
        )

        object ChangeLocation : DrawerScreen(
            "Change Location",
            "changelocation",
            R.drawable.ic_changelocation
        )

        object Setting : DrawerScreen(
            "Settings",
            "settings",
            R.drawable.ic_settings
        )

    }

    sealed class BottomScreen(val bTitle : String, val bRoute : String, @DrawableRes val icon : Int)
        :Screen(bTitle,bRoute)
    {
        object Home : BottomScreen(
            "Home",
            "home",
            R.drawable.ic_home
        )

        object Search : BottomScreen(
            "Search",
            "search",
            R.drawable.ic_search
        )

        object Movie : BottomScreen(
            "Movie",
            "movie",
            R.drawable.ic_movie
        )

        object Notification : BottomScreen(
            "Notification",
            "notification",
            R.drawable.ic_notification
        )

        object BottomProfile : BottomScreen(
            "Profile",
            "Bottomprofile",
            R.drawable.ic_profile
        )
    }

    sealed class ModalBottomSheetScreen(val mTitle : String,val mRoute : String,@DrawableRes val icon : Int)
        :Screen(mTitle,mRoute)
    {
        object Setting : ModalBottomSheetScreen(
            "Setting",
            "mbsSetting",
            R.drawable.ic_settings
        )

        object Share : ModalBottomSheetScreen(
            "Share",
            "share",
            R.drawable.ic_share
        )

        object Help : ModalBottomSheetScreen(
            "Help",
            "help",
            R.drawable.ic_help
        )

        object RateUs : ModalBottomSheetScreen(
            "Rate Us",
            "rateus",
            R.drawable.ic_rateus
        )


    }

    object ClickedMovie : Screen(
        "ClickedMovie",
        "clickedmovie"
    )

    object MovieRating : Screen(
        "MovieRating",
        "movierating"
    )

    object TheaterInfo : Screen(
        "TheaterInfo",
        "theaterinfo"
    )

    object SeatSelection : Screen(
        "SeatSelection",
        "seatselection"
    )

    object Notification : Screen(
        "Notification",
        "notification"
    )

}

val DrawerInScreen = listOf(
    Screen.DrawerScreen.Profile,
    Screen.DrawerScreen.ChangeLocation,
    Screen.DrawerScreen.Setting
)

val BottomInScreen = listOf(
    Screen.BottomScreen.Home,
    Screen.BottomScreen.Search,
    Screen.BottomScreen.Movie,
    Screen.BottomScreen.Notification,
    Screen.BottomScreen.BottomProfile
)

val ModalBottomSheetInScreen = listOf(
    Screen.ModalBottomSheetScreen.Setting,
    Screen.ModalBottomSheetScreen.Share,
    Screen.ModalBottomSheetScreen.Help,
    Screen.ModalBottomSheetScreen.RateUs
)