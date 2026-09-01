package com.example.myfirstmobileapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfirstmobileapp.ui.theme.MyFirstMobileAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstMobileAppTheme{
                StudentApp(
                    name = "Aisyah omel",
                    modifier = Modifier
                )
            }
        }
    }
}

@Composable
fun StudentApp(name: String, modifier: Modifier = Modifier) {//variable
    var message by remember {
        mutableStateOf("Welcome to Mobile Application Development")
    }

    Column(//nak adjust format
        modifier = modifier
            .fillMaxSize()//nak bagi skrin penuh
            .padding(24.dp)//jarak dari tepi
            .background(MaterialTheme.colorScheme.surfaceVariant),// tambah background warna warni
        verticalArrangement = Arrangement.Center,//buat tulisan jadi tengah
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(//format text
            text = "My First Mobile App",
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.secondary
        )

        Spacer(modifier = Modifier.height(20.dp))


        Text(text = "Hello Aisyah Omel!")

        Spacer(modifier = Modifier.height(24.dp))

        //area mesej
        Text(text = message)

        Spacer(modifier = Modifier.height(24.dp))

        //about me button
        Button(
            onClick = {
                message ="Name: Aisyah Syafiah Binti Shaharudin\")\n" +
                        "Student ID: AM2412018207\")\n" +
                        "Programme: Diploma in Computer Science\")\n" +
                        "Course: Mobile Application Development\")\n" +
                        "Favourite App: Netflix\")."
            },
            colors = ButtonDefaults.buttonColors(//nak adjust design button
                containerColor = MaterialTheme.colorScheme.secondary,
                contentColor = MaterialTheme.colorScheme.onSecondary
            )
        ) {
            Text("About Me")
        }
    }
}
