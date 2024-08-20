package com.example.moviebooking

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.moviebooking.ui.theme.ClickedMovie


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Navigation(
    controller: NavHostController,
    viewModal: MainViewModal
){
    NavHost(navController = controller, startDestination =  Screen.BottomScreen.Home.bRoute){

//        composable(Screen.DrawerScreen.UserName.route){
//            //TODO remove
//        }

        composable(Screen.DrawerScreen.Profile.route){
            ProfilePage()
        }

        composable(Screen.DrawerScreen.ChangeLocation.route){
            LocationChangePage()
        }

        composable(Screen.DrawerScreen.Setting.route){
            SettingsPage()
        }

        composable(Screen.BottomScreen.Home.bRoute){
            HomeView(controller = controller,viewModal = viewModal)
        }

        composable(Screen.BottomScreen.Search.bRoute){
            SettingsPage()
        }

        composable(Screen.BottomScreen.Movie.bRoute){
            AllMoviesView(controller = controller,viewModal = viewModal)
        }

        composable(Screen.BottomScreen.Notification.bRoute){
            SettingsPage()
        }

        composable(Screen.BottomScreen.BottomProfile.bRoute){
            SettingsPage()
        }

        composable(Screen.ModalBottomSheetScreen.Setting.route){
            SettingsPage()
        }

        composable(Screen.ModalBottomSheetScreen.Share.route){
            SettingsPage()
        }

        composable(Screen.ModalBottomSheetScreen.RateUs.route){
            SettingsPage()
        }

        composable(Screen.ModalBottomSheetScreen.Help.route){
            SettingsPage()
        }

        composable(
            Screen.ClickedMovie.route + "/{movieName}",
            arguments = listOf(
                navArgument("movieName"){
                    type = NavType.StringType
                    defaultValue = ""
                    nullable = false
                }
            )
            ){
            entry ->
            val moviename = if(entry.arguments != null) entry.arguments!!.getString("movieName") else "No Name"
            moviename?.let { ClickedMovie(it, viewModal = viewModal,controller) }

        }

        composable(Screen.MovieRating.route){
            MovieRatingView(viewModal = viewModal)
        }

        composable(Screen.TheaterInfo.route){
            TheaterInfoView(viewModal = viewModal,controller = controller)
        }

        composable(Screen.SeatSelection.route){
            SeatSelectView()
        }

        composable(Screen.Notification.route){
             NotificationView(viewModal = viewModal)
        }

    }
}