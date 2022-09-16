package com.example.signuplab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class loggedIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged_in)
        val imageView : ImageView = findViewById(R.id.imageView)
        imageView.setImageResource(R.drawable.happy)
        val logout : Button = findViewById(R.id.tryagain)
        logout.setOnClickListener {
            val intent  = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Logged Out", Toast.LENGTH_LONG).show()
        }
    }
}