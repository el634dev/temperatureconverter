package com.example.temperatureconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.temperatureconverter.ui.theme.TemperatureConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TemperatureConverterTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ConverterScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ConverterScreen(modifier: Modifier = Modifier) {
    Column(

    ) {
        Text(
            text = "Temperature Converter",
            fontSize = 60.sp,
            color = Color.Black
        )
        TextField(
            value = "What's going on?",
            onValueChange = {}
        )
        Row(

        ) {
            Text(
                text = "Celsius:",
                fontSize = 40.sp
            )
            Text(
                text = "0.00",
                fontSize = 40.sp
            )
        }
        Button(
            onClick = {}
        ) {
            Text(
                text = "Calculate"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TemperatureConverterTheme {
        ConverterScreen()
    }
}