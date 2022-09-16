package com.example.signuplab3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class TryAgain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_try_again)
        val imageView : ImageView = findViewById(R.id.imageView)
        imageView.setImageResource(R.drawable.sad)

        val logout : Button = findViewById(R.id.tryagain)
        logout.setOnClickListener {
            val intent  = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}