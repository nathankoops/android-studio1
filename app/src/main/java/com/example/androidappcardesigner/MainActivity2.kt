
package com.example.androidappcardesigner

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val autoAfbeelding =
            findViewById<ImageView>(R.id.imageView2)

        val titelAuto =
            findViewById<TextView>(R.id.titelAuto)

        val geselecteerdeKleur =
            findViewById<TextView>(R.id.geselecteerdeKleur)

        val gekozenAuto = intent.getStringExtra("gekozenAuto")

        val afbeeldingId = when (gekozenAuto) {
            "sport" -> R.drawable.sportauto
            "suv" -> R.drawable.suv
            "oldtimer" -> R.drawable.oldtimer
            else -> 0
        }

        if (afbeeldingId != 0) {
            autoAfbeelding.setImageResource(afbeeldingId)
        } else {
            Toast.makeText(
                this,
                "De afbeelding van deze auto ontbreekt.",
                Toast.LENGTH_LONG
            ).show()
        }

        titelAuto.text = when (gekozenAuto) {
            "sport" -> "Jouw sportwagen"
            "suv" -> "Jouw SUV"
            "oldtimer" -> "Jouw oldtimer"
            else -> "Jouw auto"
        }

        fun kiesKleur(naam: String, kleur: Int) {
            geselecteerdeKleur.text = "Gekozen kleur: $naam"


            autoAfbeelding.clearColorFilter()
        }

        findViewById<Button>(R.id.kleurRood).setOnClickListener {
            kiesKleur("rood", Color.RED)
        }

        findViewById<Button>(R.id.kleurBlauw).setOnClickListener {
            kiesKleur("blauw", Color.BLUE)
        }

        findViewById<Button>(R.id.kleurZwart).setOnClickListener {
            kiesKleur("zwart", Color.BLACK)
        }

        findViewById<Button>(R.id.kleurWit).setOnClickListener {
            kiesKleur("wit", Color.WHITE)
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            finish()
        }
    }
}
