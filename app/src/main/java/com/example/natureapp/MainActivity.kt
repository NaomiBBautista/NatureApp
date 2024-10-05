package com.example.natureapp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.natureapp.models.ListItem
import com.example.natureapp.ui.screens.MyListItem
import com.example.natureapp.ui.theme.Green
import com.example.natureapp.ui.theme.NatureAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NatureAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ComplexLayout(innerPadding)
                }
            }
        }
    }
}

@Composable
fun ComplexLayout(paddingValues: PaddingValues){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)
        .padding(paddingValues)
        .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally) {

//        Text(
//            modifier = Modifier
//                .padding(5.dp)
//                .background(Color.White)
//                .weight(0.05f),
//            text = "Maravillas del Mundo",
//            color = Green,
//            fontWeight = FontWeight.ExtraBold,
//            fontSize = 30.sp,)

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(top = 0.dp)
                .background(Color.White)) {
                items(ListItem.items) { item ->
                    MyListItem(item)
                    Spacer(modifier = Modifier.height(5.dp)) } }
    }
}

@Preview(
    showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    NatureAppTheme {
        ComplexLayout(PaddingValues(0.dp))
    }
}