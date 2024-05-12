package com.example.myToDo

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.codility.todoapp.R
import com.example.recyclerview.MainActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)

        // Find the ImageView
        val getStartedButton = findViewById<ImageView>(R.id.getstartbtn)

        // Set OnClickListener for the ImageView
        getStartedButton.setOnClickListener {
            // Navigate to the home page (ScrollingActivity)
            val mainIntent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(mainIntent)
            finish() // Finish splash activity after navigation
        }
    }
}
