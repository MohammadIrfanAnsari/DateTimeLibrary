package com.irfanexpense.datetimelibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.irfanexpense.mydtlibrary.DateTime

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById(R.id.txvShowMessage) as TextView

        textView.text = DateTime.getDateTime("yyyyMMdd_HHmmss")
    }
}