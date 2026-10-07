package com.example.androidappcardesigner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val volgende = findViewById<Button>(R.id.button)

        volgende.setOnClickListener {

            val gekozenAuto = when (radioGroup.checkedRadioButtonId) {
                R.id.radioSport -> "sport"
                R.id.radioSUV -> "suv"
                R.id.radioOldtimer -> "oldtimer"
                else -> "geen"
            }

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("gekozenAuto", gekozenAuto)
            startActivity(intent)
        }
    }
}