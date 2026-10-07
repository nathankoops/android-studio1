package com.example.androidappcardesigner

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val auto1 = findViewById<ImageView>(R.id.imageView2)
        val auto2 = findViewById<ImageView>(R.id.imageView3)

        val gekozenAuto = intent.getStringExtra("gekozenAuto")

        when (gekozenAuto) {
            "sport" -> {
                auto1.setImageResource(R.drawable.sportauto)
                auto2.setImageResource(R.drawable.sportauto2)
            }

            "suv" -> {
                auto1.setImageResource(R.drawable.suv)
                auto2.setImageResource(R.drawable.suv2)
            }

            "oldtimer" -> {
                auto1.setImageResource(R.drawable.oldtimer)
                auto2.setImageResource(R.drawable.oldtimer2)
            }
        }

        val terug = findViewById<Button>(R.id.button2)

        terug.setOnClickListener {
            finish()
        }
    }
}