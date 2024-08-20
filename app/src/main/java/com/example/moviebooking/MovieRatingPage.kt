package com.example.moviebooking

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.material.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp

@Composable
fun MovieRatingView(
    viewModal: MainViewModal,
){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row (

        ){
            for(i in 0..4){
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = null ,
                    modifier = Modifier.size(40.dp)
                )
            }
        }

        OutlinedTextField(

            value = viewModal.ratingDesc ,
            onValueChange = {
                viewModal.onRatingDescChange(it)
            },
            modifier = Modifier
                .size(350.dp, 200.dp)
                .padding(16.dp),
            label = {
                Text(text = "Comment")
            },
            placeholder = {
                Text(text = "Say your Experience in this Movie")
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = colorResource(id = R.color.black),
                focusedBorderColor = colorResource(id = R.color.topViolet),
                unfocusedBorderColor = colorResource(id = R.color.lightViolet),
                focusedLabelColor = colorResource(id = R.color.topViolet),
                unfocusedLabelColor = colorResource(id = R.color.lightViolet),
            )

        )

    }
}