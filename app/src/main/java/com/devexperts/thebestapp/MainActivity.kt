package com.devexperts.thebestapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.devexperts.thebestapp.ui.theme.TheBestAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheBestAppTheme {
                GreetingScreen(greeting = "Hey, Android")
            }
        }
    }
}

@Composable
fun GreetingScreen(greeting: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),
        contentAlignment = Alignment.Center
    ) {
        Text(text = greeting)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TheBestAppTheme {
        GreetingScreen("Hey, Android")
    }
}