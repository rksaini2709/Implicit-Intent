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


            /*
            // Map Location
            var intent = Intent(Intent.ACTION_VIEW,Uri.parse("geo: 30.1060,77.4675"))
            startActivity(Intent.createChooser(intent, "select your application"))
             */


            /*
            // call a number
            var intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel: 7668664131"))
            startActivity(intent)
             */


            /*
            // send Email
            var intent = Intent(Intent.ACTION_SEND)
            intent.type = "message/rfc822"
            intent.putExtra(Intent.EXTRA_SUBJECT,"Invition")
            intent.putExtra(Intent.EXTRA_TEXT, "my birthday party on 27 Sep")
            // intent.putExtra(Intent.EXTRA_EMAIL,arrayOf("itsrk2709@gmai.com"))
            intent.putExtra(Intent.EXTRA_EMAIL,arrayOf("itsrk2709@gmai.com", "ritksaini8060@gamil.com")) // multiple
            startActivity(intent)
             */


            /*
            // send text by email, massage, whtsup, insta etc.
            var intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain" // Set the MIME type to plain text
            intent.putExtra(Intent.EXTRA_SUBJECT, "Invitation")
            intent.putExtra(Intent.EXTRA_TEXT, "My birthday party on 27 Sep")
            startActivity(intent)
             */


        }
    }
}