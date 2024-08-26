package com.example.clickercounter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.clickercounter.ui.theme.ClickerCounterTheme
import android.widget.Button
import android.widget.TextView

class MainActivity : ComponentActivity() {

    private var counter = 0
    private lateinit var counterTextView: TextView
    private lateinit var incrementButton: Button
    private lateinit var resetButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterTextView = findViewById(R.id.counterTextView)
        incrementButton = findViewById(R.id.incrementButton)
        resetButton = findViewById(R.id.resetButton)


        incrementButton.setOnClickListener {
            counter++
            counterTextView.text = counter.toString()
        }

        resetButton.setOnClickListener {
            counter = 0
            counterTextView.text = counter.toString()
        }
        enableEdgeToEdge()
    }
}