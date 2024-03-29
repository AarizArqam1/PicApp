package com.techloyce.jetpackintroduction


import android.content.Intent
import android.media.RouteListingPreference
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.techloyce.jetpackintroduction.ui.theme.JetPackIntroductionTheme
import com.techloyce.jetpackintroduction.ui.theme.PurpleGrey40
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackIntroductionTheme {
                LoginPage2()
                }

//                Column{
//                    Text(
//                        text = "text 01",
//                        fontSize = 30.sp,
//                        color = Color.Cyan,
//                        modifier = Modifier
//                            .background(Color.Black)
//
//                    )
//                    var arr=arrayOf("arr01","arr02","arr03","arr04")
//                    for (nam in arr)
//                        Text(text = nam)
//
//                }
//                Text(
//                    text = "jetpack Compoadfse"
//                )
            }
        }
    }
@Preview
@Composable
fun LoginPage2() {
    val context = LocalContext.current

    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Black)) {
        Image(
            painter = painterResource(id = R.drawable.img01),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
        )
        ClickableText(
            text = AnnotatedString("Sign up here"),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(20.dp),
            onClick = {
                Toast.makeText(context, "Work in-progress", Toast.LENGTH_SHORT).show()
            },
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily.Default,
                textDecoration = TextDecoration.Underline,
                color = PurpleGrey40
            )
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val username = remember { mutableStateOf(TextFieldValue()) }
        val password = remember { mutableStateOf(TextFieldValue()) }

        Text(text = "Login", style = TextStyle(fontSize = 40.sp, fontFamily = FontFamily.Default))

        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier.alpha(0.4f) // Set the opacity value here (e.g., 0.5f for 50% opacity)
        ) {
            TextField(
                label = { Text(text = "Mobile Number") },
                value = username.value,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                onValueChange = { username.value = it }
            )
        }

        Spacer(modifier = Modifier.height(20.dp))
        Box (
            modifier = Modifier.alpha(0.4f)
        ){
            TextField(
                label = { Text(text = "Password") },
                value = password.value,
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                onValueChange = { password.value = it })
        }

        Spacer(modifier = Modifier.height(20.dp))
        //Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
            Button(
                onClick = {
                    ContextCompat.startActivity(
                        context,
                        Intent(context, MainActivity::class.java),
                        null
                    )
                },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(40.dp, 0.dp, 40.dp, 0.dp)
                    .height(50.dp)
                    .alpha(0.6f)
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
                fontFamily = FontFamily.Default
            )
        )
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    LazyColumn {
//        items(10){
//                i->
//            Icon(imageVector = Icons.Default.Add, contentDescription = null,modifier=Modifier
//                .background(Color.Yellow)
//                .size(100.dp)
//                .fillParentMaxWidth()
//            )
//        }
//
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    JetPackIntroductionTheme {
//        Greeting("Android")
//    }
//}