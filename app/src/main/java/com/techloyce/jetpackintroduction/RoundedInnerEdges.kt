package com.techloyce.jetpackintroduction


import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.techloyce.jetpackintroduction.Components.ClickableOutlinedCard
import com.techloyce.jetpackintroduction.Model.Route

@Composable
fun RoundedBox(context: Context){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(0.dp,0.dp,0.dp,20.dp)
            .clip(RoundedCornerShape(40.dp)),
        contentAlignment = Alignment.Center
    ) {
        Surface(
            color = Color.Gray,
            modifier = Modifier.fillMaxSize()
        ) {
            val routes:List<Route>
            routes=mutableListOf(
                Route("Route 1","Railway Station to Bhatti Ckawk"),
                Route("Route 2","Samanabad Mor to Bhatti Chawk"),
                Route("Route 3","Railway Station to Shahdara Lari Aada"),
                Route("Route 4","R.A Bazar to Chungi Amar Sadhu"),
                Route("Route 5","Shadbagh UhderPass to Bhatti Chawk"),
                Route("Route 7","Bagrian to Chunji Amar Sidhu"),
                Route("Route 8","Canal to Dewo Termminal Thokr"),
                Route("Route 9","Railway Station Chauburgi"),
                Route("Route 10","Multan Chungi to Qartabe Chawk"),
                Route("Route 11","Babu Sabu to main Market Gulberg"),
                Route("Route 12","R.A Bazar to Civil Secretariat"),
                Route("Route 13","Bagrian to Kalma Ckawk"),
                Route("Route 14","R.A Bazar to Chungi Amar Sindhu"),
                Route("Route 15","Bhatti Chawk to R.A Bazar"),
                Route("Route 16","Canal to Dawo Terminal Thokr")
            )
            //navBar()
            val scrollState = rememberScrollState()
            Column(
                modifier = Modifier
                    .verticalScroll(scrollState)
                    .fillMaxSize()
                    .background(Color(0xFFD0C4AB))
            ) {
                val offset = Offset(5.0f, 10.0f)

                Text(text = "Bus Route",modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth(),
                    fontWeight = FontWeight.ExtraBold,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 24.sp,
                        shadow = Shadow(
                            color = Color.Red, offset = offset, blurRadius = 3f
                        )
                    )
                )
                routes.forEach { route ->
                    ClickableOutlinedCard(context,route.route,route.description)
                }

            }


        }
        

    }
}