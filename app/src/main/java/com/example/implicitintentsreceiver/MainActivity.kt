package com.example.implicitintentsreceiver

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = intent
        val uri = intent.data
        if (uri != null) {
            val uri_string = "URI: $uri"
            val textView = findViewById<TextView>(R.id.text_uri_message)
            textView.text = uri_string
        }

    }
}