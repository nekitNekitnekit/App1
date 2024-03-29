package com.example.app1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
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
        App()
    }
}

@Composable
fun App() {
    val userImage = painterResource(R.drawable.user);
    val settingsImage = painterResource(R.drawable.phonelink_setup);
    val searchImage = painterResource(R.drawable.search);
    val wifiImage = painterResource(R.drawable.wifi);
    val connectImage = painterResource(R.drawable.devices_other);
    val appImage = painterResource(R.drawable.apps);
    val notificationImage = painterResource(R.drawable.notifications_none);
    val digitalImage = painterResource(R.drawable.accessibility);
    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxHeight()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Image(
                painter = userImage,
                contentDescription = null,
                modifier = Modifier
                    .width(51.dp)
                    .height(51.dp)
                    .clip(CircleShape)
            )
        }

        Box(
            modifier = Modifier
                .padding(10.dp)
        ) {
            Text(
                text = "Settings",
                fontSize = 36.sp,
                lineHeight = 42.19.sp,
            )
        }

        ExploreCard(settingsImage)

        SearchLine(searchImage)

        SettingsElement(wifiImage, "Network & Internet", "Wi-Fi, Mobile, Data using, Hotspot")
        SettingsElement(connectImage, "Connected devices", "Bluetooth, Cast, NFC")
        SettingsElement(appImage, "App", "Permissions, default, apps")
        SettingsElement(notificationImage, "Notifications", "Permissions, default apps")
        SettingsElement(digitalImage, "Digital wellbeing", "Screen time, app, timer, bedtime, schedules")
    }
}

@Composable
fun ExploreCard(painter: Painter) {
    Box(
        modifier = Modifier
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(Color(0xFFDBEA8D), RoundedCornerShape(16.dp)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painter,
                contentDescription = null,
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp)
                    .padding(10.dp)
            )

            Column(
                verticalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = "Get to know your Pixel",
                    modifier = Modifier
                        .padding(4.dp),
                    fontSize = 21.sp,
                    lineHeight = 25.03.sp,
                )
                Text(
                    text = "Explore what you can do with your phone",
                    modifier = Modifier
                        .padding(4.dp),
                    fontSize = 14.sp,
                    lineHeight = 16.69.sp,
                )
            }
        }
    }
}

@Composable
fun SearchLine(painter: Painter) {
    Box(
        modifier = Modifier
            .padding(10.dp, 0.dp, 10.dp, 10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(32.dp)
                .background(Color.White, RoundedCornerShape(16.dp)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painter,
                contentDescription = null,
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp)
                    .padding(6.dp)
            )

            Text(
                text = "Search settings...",
                modifier = Modifier
                    .padding(4.dp),
                fontSize = 12.sp
            )
        }
    }
}

@Composable
fun SettingsElement(painter: Painter, title: String, text: String) {
    Box(
        modifier = Modifier
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painter,
                contentDescription = null,
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .padding(10.dp)
            )

            Column(
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = title,
                    modifier = Modifier
                        .padding(4.dp),
                    fontSize = 20.sp,
                    lineHeight = 23.84.sp,
                )
                Text(
                    text = text,
                    modifier = Modifier
                        .padding(4.dp),
                    fontSize = 14.sp,
                    lineHeight = 16.69.sp,
                )
            }
        }
    }
}

