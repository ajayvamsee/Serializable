package com.ajayvamsee.serializable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btnSend)

        btn.setOnClickListener {

            val intent = Intent(this,MainActivity2::class.java)

            // created Serializable class a object
            val passingObj = MyObject()
            passingObj.id = 1
            passingObj.place = "India"
            passingObj.name = "Ajay"

            intent.putExtra("objectData",passingObj)

            startActivity(intent)
        }
    }
}