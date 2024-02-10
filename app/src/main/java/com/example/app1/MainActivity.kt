package com.example.app1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app1.ui.theme.App1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "MyPreview"
)

@Composable
fun GreetingPreview() {
    App1Theme {
        Greeting(
            settings = "Settings",
            getKnow = "Get to know your Pixel",
            getExplore = "Explore what you can do with your phone"
        )
    }
}

@Composable
fun Greeting(settings: String, getKnow: String, getExplore: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(21.dp)

    ){
        Text(
            text = settings,
            fontSize = 36.sp,
            lineHeight = 42.19.sp,
            modifier = modifier
        )
        Text(
            text = getKnow,
            fontSize = 21.sp,
            lineHeight = 25.03.sp,
            modifier = Modifier
                .paddingFromBaseline(top = 50.dp)
        )
        Text(
            text = getExplore,
            fontSize = 14.sp,
            lineHeight = 16.69.sp,
            modifier = Modifier
                .paddingFromBaseline(top = 5.dp)
        )
    }
}

