
package com.example.androidappcardesigner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val gekozenAuto = when (radioGroup.checkedRadioButtonId) {
                R.id.radioSport -> "sport"
                R.id.radioSUV -> "suv"
                R.id.radioOldtimer -> "oldtimer"
                else -> null
            }

            if (gekozenAuto == null) {
                Toast.makeText(
                    this,
                    "Kies eerst een auto!",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("gekozenAuto", gekozenAuto)
            startActivity(intent)
        }
    }
}
