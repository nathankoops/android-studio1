
package com.example.androidappcardesigner

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.statusBarColor = Color.rgb(217, 0, 0)
        window.navigationBarColor = Color.rgb(217, 0, 0)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val knop = findViewById<Button>(R.id.button)

        knop.backgroundTintList =
            ColorStateList.valueOf(Color.rgb(217, 0, 0))
        knop.setTextColor(Color.WHITE)

        knop.setOnClickListener {
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
            } else {
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("gekozenAuto", gekozenAuto)
                startActivity(intent)
            }
        }
    }
}
