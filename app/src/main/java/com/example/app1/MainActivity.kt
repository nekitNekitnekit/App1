package com.example.app1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
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
            getExplore = "Explore what you can do with your phone",
            title = title,
            desc = desc
        )
        SettingsText(
            title = "Network & Internet", desc = "Wi-Fi, Mobile, Data usage, Hotspot"
        )
    }
}

@Composable
fun Greeting(
    settings: String,
    getKnow: String,
    getExplore: String,
    title: String,
    desc: String,
    modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.user)
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(21.dp)
    ){
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .size(51.dp)
                .clip(CircleShape)
        )
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
        SettingsText(
            title = title,
            desc = desc
        )
    }
}

@Composable
fun SettingsText(title: String, desc: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = title,
            fontSize = 20.sp,
            lineHeight = 23.84.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .paddingFromBaseline(top = 50.dp)
        )
        Text(
            text = desc,
            fontSize = 14.sp,
            lineHeight = 16.69.sp,
            modifier = Modifier
                .paddingFromBaseline(top = 5.dp)
        )
    }
}

