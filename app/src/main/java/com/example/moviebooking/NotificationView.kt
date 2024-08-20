package com.example.moviebooking

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NotificationView(
    viewModal: MainViewModal
){


    val listOfNoti = viewModal.dummyNotifications.keys.toList()

    LazyColumn {
        items(listOfNoti) {
            notification ->
            val isRead = viewModal.dummyNotifications[notification] ?: false
            NotificationCard(read = isRead, notificationMsg = notification) {
                // Update the notification state to read when clicked
                if (!isRead) {
                    viewModal.updateNoOfNotifications(viewModal.getNoOfNotifications.intValue - 1)
                    viewModal.dummyNotifications[notification] = true
                }
            }
        }

        item {
            Row (
                modifier = Modifier.fillMaxWidth().height(50.dp)
            ){

            }
        }
    }
}

@Composable
fun NotificationCard(
    read : Boolean,
    notificationMsg : String,
    onNotificationClick : () -> Unit
){

    val bg = if(read) Color.Transparent else colorResource(id = R.color.notificationBg)

    Column (
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                onNotificationClick()
            }
            .background(bg)
    ){
        Text(
            modifier = Modifier
                .padding(vertical = 12.dp)
                .padding(start = 16.dp),
            text = notificationMsg,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start,
            fontSize = 16.sp
        )
    }


    Divider(color = colorResource(id = R.color.black))

}