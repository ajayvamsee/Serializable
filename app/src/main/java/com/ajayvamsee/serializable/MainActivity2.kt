package com.ajayvamsee.serializable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val myIntent = intent

        val derivedObject = myIntent.getSerializableExtra("objectData") as MyObject

        val textView = findViewById<TextView>(R.id.tv1)
        textView.append(derivedObject.name + "\n")
        textView.append(derivedObject.id.toString() + "\n")
        textView.append(derivedObject.place + "\n")
    }
}