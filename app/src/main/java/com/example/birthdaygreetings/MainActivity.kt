package com.example.birthdaygreetings

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.birthdaygreetings.ui.theme.BirthdayGreetingsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirthdayGreetingsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        message = "Bernardo F. Catriz Jr.",
                        modifier = Modifier.padding(innerPadding)
                    )
                    surface (
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) }
                }
            }
        }

    private fun surface(modifier: Modifier, color: androidx.compose.ui.graphics.Color) {

    }
}


@Composable
fun Greeting(message: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $message!",
        modifier = modifier,
        fontSize = 100.sp,
        lineHeight = 116.sp,

    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BirthdayGreetingsTheme {
        Greeting("Bernardo F. Catriz Jr.")
    }
}