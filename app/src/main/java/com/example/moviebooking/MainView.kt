package com.example.moviebooking

import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BadgedBox
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.IconButton
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.moviebooking.ui.theme.ClickedMovie
import kotlinx.coroutines.launch



@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MainView(
    viewModal: MainViewModal
){

    var drawerGesturesEnabled by remember {
        mutableStateOf(false)
    }

    val context = LocalContext.current

    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    val controller = rememberNavController()
    val navBackStackEntry by controller.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    val bottomBarText = viewModal.bottomBarText

    drawerGesturesEnabled = currentRoute == Screen.BottomScreen.Home.route


    if(
        currentRoute == Screen.BottomScreen.Home.route ||
        currentRoute == Screen.BottomScreen.Search.bRoute ||
        currentRoute == Screen.BottomScreen.Movie.route ||
        currentRoute == Screen.BottomScreen.Notification.route ||
        currentRoute == Screen.BottomScreen.BottomProfile.route||
        currentRoute == Screen.DrawerScreen.Profile.route ||
        currentRoute == Screen.DrawerScreen.ChangeLocation.route ||
        currentRoute == Screen.DrawerScreen.Setting.route
    ){
        if(currentRoute == Screen.BottomScreen.Home.route)
        {
            viewModal.changeTitle("Home")
        }

        viewModal.appearBottomBarShow()
    }else{
        if(currentRoute == Screen.MovieRating.route){
            viewModal.bottomBarText = "Rate"
        }
        else{
            viewModal.bottomBarText = "Book Ticket"
        }
        viewModal.disappearBottomBarShow()
    }

    if(currentRoute == Screen.TheaterInfo.route){
        viewModal.changeTitle(viewModal.currentlyViewingMovie)
    }


    var title = viewModal.retrieveTitle()

    val modalSheetState = rememberModalBottomSheetState(
        initialValue = ModalBottomSheetValue.Hidden,
        confirmStateChange = {it != ModalBottomSheetValue.HalfExpanded})

    val isBottomBarShow = viewModal.isBottomBarBarShow()


    ModalBottomSheetLayout(
        sheetState = modalSheetState,
        sheetShape = RoundedCornerShape(12.dp),
        sheetBackgroundColor = colorResource(id = R.color.lightViolet),
        sheetContent = {
            Box(
                modifier = Modifier
                    .height(230.dp)
                    .fillMaxWidth()
            ){
                Column (
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ){
                    ModalBottomSheetInScreen.forEach {
                        item ->
                            MoreBottomSheets(item){
                                controller.navigate(item.mRoute)
                                scope.launch {
                                    modalSheetState.hide()
                                }
                                viewModal.changeTitle(item.mTitle)
                            }
                    }
                }
            }
        }
    ) {
        Scaffold(
            scaffoldState = scaffoldState,
            topBar = {
                if (isBottomBarShow) {
                    TopAppBar(
                        title = { Text(text = title) },
                        backgroundColor = colorResource(id = R.color.topViolet),
                        navigationIcon = {
                            IconButton(
                                onClick = {
                                    drawerGesturesEnabled = true
                                    scope.launch {
                                        scaffoldState.drawerState.open()
                                    }
                                }
                            ) {
                                Icon(imageVector = Icons.Default.Menu, contentDescription = null)
                            }
                        },
                        elevation = 3.dp,
                        actions = {
                            IconButton(
                                onClick = {
                                    scope.launch {
                                        if (modalSheetState.isVisible) {
                                            modalSheetState.hide()
                                        } else {
                                            modalSheetState.show()
                                        }
                                    }
                                }
                            ) {
                                Icon(
                                    imageVector = Icons.Default.MoreVert,
                                    contentDescription = null
                                )
                            }
                        }
                    )
                }
                else{
                    TopAppBar(
                        title = { Text(text = viewModal.retrieveTitle()) },
                        backgroundColor = colorResource(id = R.color.topViolet),
                        navigationIcon = {
                            IconButton(
                                onClick = {
                                    controller.navigateUp()
                                }
                            ) {
                                Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = null)
                            }
                        },
                        elevation = 3.dp,
                        actions = {
                            IconButton(
                                onClick = {
                                    //TODO to share the movie
                                    Toast.makeText(context,"Now u can't Share Movie",Toast.LENGTH_SHORT).show()
                                }
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Share,
                                    contentDescription = null
                                )
                            }
                        }
                    )
                }
            },
            drawerContent = {
                LazyColumn(){
                    item { 
                        Column (
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            horizontalAlignment = Alignment.Start,
                            verticalArrangement = Arrangement.Center
                        ){
                            Text(
                                text = "Pathmanaban Path",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(start = 20.dp, top = 20.dp)
                            )
                            Text(
                                text = "Mylleripallayam, Coimbatore",
                                fontSize = 20.sp,
                                modifier = Modifier.padding(start = 20.dp)
                            )
                            Divider(
                                modifier = Modifier
                                    .heightIn(3.dp)
                                    .padding(start = 5.dp, end = 5.dp, top = 20.dp)
                                    .background(Color.Black)
                            )
                        }
                    }
                    items(DrawerInScreen){
                            item ->
                        DrawerItem(selected = item.dRoute == currentRoute, item = item) {
                            drawerGesturesEnabled = false
                            Toast.makeText(context,item.dTitle,Toast.LENGTH_LONG).show()
                            controller.navigate(item.dRoute)
                            scope.launch {
                                scaffoldState.drawerState.close()
                            }
                            viewModal.changeTitle(item.dTitle)
                        }
                    }
                }
            },
            drawerBackgroundColor = colorResource(id = R.color.lightViolet),
            bottomBar = {
                if(isBottomBarShow){
                    BottomNavigation (
                        modifier = Modifier.wrapContentSize(),
                        backgroundColor = colorResource(id = R.color.lightGray)
                    ){
                        BottomInScreen.forEach{
                                item ->
                            val bottomIconColor =
                                if(currentRoute == item.bRoute) colorResource(id = R.color.topViolet)
                                else colorResource(id = R.color.darkGray)

                            BottomNavigationItem(
                                selected = currentRoute == item.bRoute,
                                onClick = {
                                    controller.navigate(item.bRoute)
                                    viewModal.changeTitle(item.bTitle)
                                },
                                icon = {
                                    if(item.bTitle == "Notification"  && viewModal.getNoOfNotifications.intValue > 0){
                                        BadgedBox(
                                            badge = {
                                                Text(
                                                    text = ".",
                                                    fontSize = 40.sp,
                                                    fontWeight = FontWeight.ExtraBold,
                                                    modifier = Modifier.padding(bottom = 15.dp, end = 5.dp),
                                                    color = Color.Red
                                                )
                                            }
                                        ) {
                                            Icon(
                                                painter = painterResource(id = item.icon),
                                                contentDescription = null,
                                                tint = bottomIconColor,
                                                modifier = Modifier.size(30.dp)
                                            )
                                        }
                                    }
                                    else{
                                        Icon(
                                            painter = painterResource(id = item.icon),
                                            contentDescription = null,
                                            tint = bottomIconColor,
                                            modifier = Modifier.size(30.dp)
                                        )
                                    }
                                },
                                selectedContentColor = colorResource(id = R.color.topViolet),
                                unselectedContentColor = colorResource(id = R.color.darkGray)
                            )
                        }
                    }
                }
                else{
                    BottomNavigation (
                        modifier = Modifier
                            .wrapContentSize()
                            .height(60.dp),
                        backgroundColor = colorResource(id = R.color.lightViolet)
                    ){
                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .clickable {
                                    if (bottomBarText == "Rate") {
                                        if (viewModal.ratingDesc.isNotBlank()) {
                                            controller.navigateUp()
                                            viewModal.ratingDesc = ""
                                            Toast
                                                .makeText(
                                                    context,
                                                    "Thanks for Rating",
                                                    Toast.LENGTH_SHORT
                                                )
                                                .show()
                                        } else {
                                            Toast
                                                .makeText(
                                                    context,
                                                    "Leave comment for Rate",
                                                    Toast.LENGTH_SHORT
                                                )
                                                .show()
                                        }
                                    } else {
                                        //TODO Navigate to Seat Booking

                                        controller.navigate(Screen.TheaterInfo.route)
                                    }
                                },
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = bottomBarText,
                                fontWeight = FontWeight.ExtraBold,
                                color = Color.White,
                                fontSize = 20.sp
                            )
                        }
                    }
                }

            },
            drawerGesturesEnabled = drawerGesturesEnabled

        ) {
            Text(text = "", modifier = Modifier.padding(it))
            Navigation(controller = controller, viewModal = viewModal)
        }

    }



}

@Composable
fun MoreBottomSheets(
    item : Screen.ModalBottomSheetScreen,
    onClickMBSItem : () -> Unit
){
    Row (
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .clickable {
                onClickMBSItem()
            },
        verticalAlignment = Alignment.CenterVertically
    ){
        Icon(
            painter = painterResource(id = item.icon),
            contentDescription = null,
            tint = colorResource(id = R.color.black)
        )
        Text(
            text = item.mTitle, 
            modifier = Modifier.padding(start = 10.dp),
            fontWeight = FontWeight.ExtraBold
        )
    }
}

@Composable
fun DrawerItem(
    selected : Boolean,
    item : Screen.DrawerScreen,
    onClickDrawerItem : () -> Unit
){
    
    val background = if(selected) colorResource(id = R.color.lightViolet) else Color.Transparent

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp, start = 30.dp)
            .clickable {
                onClickDrawerItem()
            }
            .background(background)
            .height(35.dp),
        verticalAlignment = Alignment.CenterVertically,

    ) {
        Icon(
            painter = painterResource(id = item.icon),
            contentDescription = null ,
            tint = colorResource(id = R.color.black)

        )
        Text(
            text = item.dTitle,
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(start = 10.dp)
        )

    }

    if(item.dTitle == "UserName"){
        Divider(
            thickness = 3.dp,
            color = colorResource(id = R.color.white),
            modifier = Modifier.padding(top = 10.dp)
        )
    }

}
