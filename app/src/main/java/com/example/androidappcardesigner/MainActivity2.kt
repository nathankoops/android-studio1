
package com.example.androidappcardesigner

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        window.statusBarColor = Color.rgb(217, 0, 0)
        window.navigationBarColor = Color.rgb(217, 0, 0)

        val auto1 = findViewById<ImageView>(R.id.imageView2)
        val auto2 = findViewById<ImageView>(R.id.imageView3)

        when (intent.getStringExtra("gekozenAuto")) {
            "suv" -> {
                auto1.setImageResource(R.drawable.suv)
                auto2.setImageResource(R.drawable.suv2)
            }

            "oldtimer" -> {
                auto1.setImageResource(R.drawable.oldtimer)
                auto2.setImageResource(R.drawable.oldtimer2)
            }

            "sport" -> {
                auto1.setImageResource(R.drawable.sportauto)
                auto2.setImageResource(R.drawable.sportauto2)
            }
        }

        val terug = findViewById<Button>(R.id.button2)

        terug.backgroundTintList =
            ColorStateList.valueOf(Color.rgb(217, 0, 0))
        terug.setTextColor(Color.WHITE)

        terug.setOnClickListener {
            finish()
        }
    }
}
