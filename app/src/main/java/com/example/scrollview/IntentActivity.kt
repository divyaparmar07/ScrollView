package com.example.scrollview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class IntentActivity : AppCompatActivity() {

    lateinit var name : EditText
    lateinit var age : EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        name = findViewById(R.id.name)
        age = findViewById(R.id.age)
        button = findViewById(R.id.button)

        button.setOnClickListener {

            var n : String = name.text.toString()
            var a : Int = age.text.toString().toInt()

            var intent = Intent(this@IntentActivity,SecondActivity::class.java)

            intent.putExtra("username",n)
            intent.putExtra("userage",a)

            startActivity(intent)
        }
    }
}
