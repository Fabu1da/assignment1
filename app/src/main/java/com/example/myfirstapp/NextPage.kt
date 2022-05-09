package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class NextPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_page)
        val names = intent.getStringExtra("names")
        val name = findViewById<TextView>(R.id.content).apply {
            text = "Welcome $names !"
        }
    }


    fun goBackHome(view: View){
        val intent = Intent(this, MainActivity::class.java).apply {
            val toast = Toast.makeText(applicationContext, "Thank you i am going back to home", Toast.LENGTH_LONG)
            toast.show()
        }

        startActivity(intent)
    }

}