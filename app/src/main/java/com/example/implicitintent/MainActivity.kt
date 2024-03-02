package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var goBtn = findViewById<Button>(R.id.go)

        goBtn.setOnClickListener {
            /*
            var intent = Intent()
            // Set the data for the Intent using a URI to open a web page (in this case, Google's homepage)
            // Note: The URI is created using the parse method of Uri class
            // intent.data = Uri.parse("https::/www.google.com")
            intent.data = Uri.parse("https://sanatanilibrary.blogspot.com/")
            */
            var intent = Intent(Intent.ACTION_VIEW,Uri.parse("geo: 30.1060,77.4675"))
            startActivity(Intent.createChooser(intent, "select your application"))
        }
    }
}