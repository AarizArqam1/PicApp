package com.techloyce.jetpackintroduction


import android.content.Context
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.techloyce.jetpackintroduction.Components.ClickableCard
import com.techloyce.jetpackintroduction.Components.navBar
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
                //navBar()
                val scrollState = rememberScrollState()
                Column(
                    modifier = Modifier
                        .verticalScroll(scrollState)
                        .fillMaxSize()
                ) {
                    Text(text = "Speedo Bus Route",modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth(),
                        textAlign = TextAlign.Center,
                    )
                    ClickableCard(applicationContext,"Route 1","Railway Station to Bhatti Ckawk")
                    ClickableCard(applicationContext,"Route 2","Samanabad Mor to Bhatti Chawk")
                    ClickableCard(applicationContext,"Route 3","Railway Station to Shahdara Lari Aada")
                    ClickableCard(applicationContext,"Route 4","R.A Bazar to Chungi Amar Sadhu")
                    ClickableCard(applicationContext,"Route 5","Shadbagh UhderPass to Bhatti Chawk")
                    ClickableCard(applicationContext,"Route 6","Babu Sabu to Raj Garh Chawk")
                    ClickableCard(applicationContext,"Route 7","Bagrian to Chunji Amar Sidhu")
                    ClickableCard(applicationContext,"Route 8","Canal to Dewo Termminal Thokr")
                    ClickableCard(applicationContext,"Route 9","Railway Station Chauburgi")
                    ClickableCard(applicationContext,"Route 10","Multan Chungi to Qartabe Chawk")
                    ClickableCard(applicationContext,"Route 11","Babu Sabu to main Market Gulberg")
                    ClickableCard(applicationContext,"Route 12","R.A Bazar to Civil Secretariat")
                    ClickableCard(applicationContext,"Route 13","Bagrian to Kalma Ckawk")
                    ClickableCard(applicationContext,"Route 14","R.A Bazar to Chungi Amar Sindhu")
                    ClickableCard(applicationContext,"Route 15","Bhatti Chawk to R.A Bazar")
                    ClickableCard(applicationContext,"Route 16","Canal to Dawo Terminal Thokr")
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
        .background(Color.Black)) {

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
            Button(
                onClick = {
                    ContextCompat.startActivity(
                        context,
                        Intent(context, MainActivity2::class.java),
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

