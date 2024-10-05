package com.example.natureapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.natureapp.models.ListItem
import com.example.natureapp.ui.theme.Orange

@Composable
fun MyListItem(item : ListItem){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .height(450.dp)
            .padding(20.dp)
            ,
        shape = RoundedCornerShape(10.dp)) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalArrangement = Arrangement.Center) {

            Image(
                painter = rememberAsyncImagePainter(model = item.img),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.5f),
                contentScale = ContentScale.Crop)

            Box (
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.15f)
                    .background(Orange),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = item.name,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                    modifier = Modifier.padding(10.dp)
                )
            }


            Box (
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.35f)
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = item.descripcion,
                    color = Color.Black,
                    fontWeight = FontWeight.Medium,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(10.dp)
                )
            }
        }

    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun GreetingPreview() {

}