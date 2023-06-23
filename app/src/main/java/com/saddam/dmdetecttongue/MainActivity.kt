package com.saddam.dmdetecttongue

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnScan : ImageButton =findViewById(R.id.id_scan)
        btnScan.setOnClickListener()
        {
            val intent = Intent(this, scan::class.java)
            startActivity(intent)
        }

    }
}
