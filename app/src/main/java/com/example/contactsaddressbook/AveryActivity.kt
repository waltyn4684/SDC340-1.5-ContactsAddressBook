// Wallace Tyner | November 15, 2026
// SDC340 1.5 Performance Assessment

package com.example.contactsaddressbook

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AveryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_avery)

        // Keep Avery's photo and details clear of the status and navigation bars.
        val contactLayout = findViewById<View>(R.id.main)
        ViewCompat.setOnApplyWindowInsetsListener(contactLayout) { view, insets ->
            val bars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(bars.left, bars.top, bars.right, bars.bottom)
            insets
        }
    }
}