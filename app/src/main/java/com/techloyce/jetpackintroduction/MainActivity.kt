package com.techloyce.jetpackintroduction



import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.techloyce.jetpackintroduction.Components.ClickableCard
import com.techloyce.jetpackintroduction.Components.ClickableOutlinedCard
import com.techloyce.jetpackintroduction.Components.navBar
import com.techloyce.jetpackintroduction.Model.Route
import com.techloyce.jetpackintroduction.ui.theme.JetPackIntroductionTheme

data class navItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unSelectedIcon: ImageVector,
    val hasNews: Boolean

)

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackIntroductionTheme {
                //LoginPage()
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
                        ClickableOutlinedCard(applicationContext,route.route,route.description)
                    }

                }
            }
        }
    }
}









@Preview
@Composable
fun LoginPage() {
    val context = LocalContext.current

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
    ){

        Text(
            text = AnnotatedString("Sign up here"),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(20.dp),

            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily.Default,
                textDecoration = TextDecoration.Underline,
                color = Color.White
            )
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .border(10.dp, Color.Blue)
            .padding(10.dp)
            .border(10.dp, Color.Magenta),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val username = remember { mutableStateOf(TextFieldValue()) }
        val password = remember { mutableStateOf(TextFieldValue()) }

        Text(text = "Login", style = TextStyle(fontSize = 40.sp, fontFamily = FontFamily.Default, color = Color.White))

        Spacer(modifier = Modifier.height(20.dp))
        CustomTextField("Email",value = username.value, onValueChange = { username.value = it })
        Spacer(modifier = Modifier.height(20.dp))
        CustomTextField("Password",value = password.value, onValueChange = { password.value = it })
        Spacer(modifier = Modifier.height(20.dp))
        //Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
        OutlinedButton(
            onClick = { /* TODO */ }
        ) {
            Text("Show more")
        }

        Button(
                onClick = {
                    ContextCompat.startActivity(
                        context,
                        Intent(context, this::class.java),
                        null
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(40.dp, 0.dp, 40.dp, 0.dp)
                    .height(50.dp)

            ) {
                Text(text = "Login")
            }
        //}

        Spacer(modifier = Modifier.height(20.dp))
        ClickableText(
            text = AnnotatedString("Forgot password?"),
            onClick = {
                Toast.makeText(context, "Work in-progress", Toast.LENGTH_SHORT).show()
            },
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily.Default,
                color = Color.White
            )
        )
    }
}
@Composable
fun CustomTextField(labelText: String, value: TextFieldValue, onValueChange: (TextFieldValue) -> Unit) {
    Box(
        modifier = Modifier.padding(horizontal = 40.dp, vertical = 0.dp)
    ) {
        TextField(
            label = { Text(text = labelText) },
            value = value,
            onValueChange = onValueChange,
//            modifier = Modifier.fillMaxWidth()
        )
    }
}

