package com.example.scrollview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var result : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        result = findViewById(R.id.textView)

        var userName : String = intent.getStringExtra("username").toString()
        var userAge : Int = intent.getIntExtra("userage",0)

        result.text = "YOUR NAME IS $userName and YOUR AGE IS $userAge"

    }
}















