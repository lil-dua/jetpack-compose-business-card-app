package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BusinessTitle()
        BusinessInfo()
    }
}

@Composable
fun BusinessInfo() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(bottom = 50.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            Modifier.fillMaxWidth()
                .padding(start = 70.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            val image = painterResource(id = R.drawable.ic_phone)
            Image(
                painter = image,
                contentDescription = null,
                Modifier
                    .height(height = 40.dp)
                    .width(width = 40.dp)
            )
            Text(
                text = "+84 972 524570",
                Modifier.padding(start = 10.dp)
            )
        }

        Row(
            Modifier.fillMaxWidth()
                .padding(start = 70.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            val image = painterResource(id = R.drawable.ic_share)
            Image(
                painter = image,
                contentDescription = null,
                Modifier
                    .height(height = 40.dp)
                    .width(width = 40.dp)
            )
            Text(
                text = "@AndroidDev",
                Modifier.padding(start = 10.dp)
            )
        }

        Row(
            Modifier.fillMaxWidth()
                .padding(start = 70.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            val image = painterResource(id = R.drawable.ic_email)
            Image(
                painter = image,
                contentDescription = null,
                Modifier
                    .height(height = 40.dp)
                    .width(width = 40.dp)
            )
            Text(
                text = "huuthom0209@gmail.com",
                Modifier.padding(start = 10.dp)
            )
        }
    }
}

@Composable
fun BusinessTitle() {
   Column(
       Modifier.fillMaxWidth()
           .padding(top = 240.dp),
       verticalArrangement = Arrangement.Center,
       horizontalAlignment = Alignment.CenterHorizontally
   ) {
       val image = painterResource(id = R.drawable.android_logo)
       Image(
           painter = image,
           contentDescription = null,
           Modifier
               .height(height = 180.dp)
               .width(width = 180.dp)
               .background(color = Color.Black)
       )
       Text(
           text = "Hoang Ryan",
           fontSize = 28.sp
       )
       Text(
           text = "Android Developer Vietnam",
           fontWeight = FontWeight.Bold
       )
   }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        BusinessCardApp()
    }
}