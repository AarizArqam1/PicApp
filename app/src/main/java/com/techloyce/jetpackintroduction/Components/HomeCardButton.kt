package com.techloyce.jetpackintroduction.Components

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.techloyce.jetpackintroduction.MainActivity
import com.techloyce.jetpackintroduction.MainActivityTemp
import com.techloyce.jetpackintroduction.R
import com.techloyce.jetpackintroduction.temp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeCardButton(context: Context) {
    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            // Handle the result if needed
        }
    }
    OutlinedCard(
        onClick = {
            Toast.makeText(context," Clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(context, temp::class.java)
            launcher.launch(intent)
        },
        border = BorderStroke(1.dp, Color.Red),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
        modifier = Modifier
            .padding(16.dp)
            .size(100.dp, 100.dp)

    ) {
        Box(
            modifier = Modifier.fillMaxSize()
                .background(Color.Black),
            contentAlignment = Alignment.TopCenter
        ) {
            Image(
                painter = painterResource(id = R.drawable.bus),
                contentDescription = "Fairs",
            )
            Text(text = "Routes",
                modifier = Modifier.padding(0.dp,40.dp,0.dp,0.dp),
                fontSize = 30.sp,
                color = Color.Red
            )
        }
    }

}