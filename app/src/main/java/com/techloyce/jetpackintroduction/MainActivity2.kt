package com.techloyce.jetpackintroduction

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.techloyce.jetpackintroduction.ui.theme.JetPackIntroductionTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackIntroductionTheme {
                // A surface container using the 'background' color from the theme
                Column(){
                    ClickableCard("Route 1")
                    ClickableCard("Route 2")
                    ClickableCard("Route 3")
                    ClickableCard("Route 4")
                }
                //Greeting()

            }
        }
    }
}

@Preview
@Composable
fun Greeting() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)) {


        Text(
            text = AnnotatedString("second activity"),
            modifier = Modifier
                .align(Alignment.Center)
                .padding(20.dp),

            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily.Default,
                textDecoration = TextDecoration.Underline,
                color = Color.Yellow
            )
        )
    }
}
@Composable
fun ClickableCard(route:String) {
    val context = LocalContext.current
    Card(

        modifier = Modifier
            .padding(16.dp)
            .clickable(onClick = {
                Toast
                    .makeText(context, "Work in-progress", Toast.LENGTH_SHORT)
                    .show()
            }), // Adding clickable modifier,

    ) {
        // Content of the card
        Text(text = route)
    }
}


