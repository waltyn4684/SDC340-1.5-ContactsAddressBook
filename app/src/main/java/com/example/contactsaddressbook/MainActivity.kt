// Wallace Tyner | November 15, 2026
// SDC340 1.5 Performance Assessment

package com.example.contactsaddressbook

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Keep the contact list clear of the status and navigation bars.
        val mainLayout = findViewById<View>(R.id.main)
          ViewCompat.setOnApplyWindowInsetsListener(mainLayout) { view, insets ->
            val bars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(bars.left, bars.top, bars.right, bars.bottom)
            insets
        }

        // Each button opens the details for the contact listed above it.
        findViewById<Button>(R.id.btnAveryDetails).setOnClickListener {
            startActivity(Intent(this, AveryActivity::class.java))
        }

        findViewById<Button>(R.id.btnAndreDetails).setOnClickListener {
            startActivity(Intent(this, AndreActivity::class.java))
        }
    }
}