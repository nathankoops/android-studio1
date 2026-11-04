
package com.example.androidappcardesigner

import android.os.Bundle
import android.widget.TextView
import android.widget.EditText
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(
                WindowInsetsCompat.Type.systemBars()
            )

            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )

            insets
        }

        // Gegevens ophalen van vorige pagina's
        val kleur = intent.getStringExtra("kleur")
        val gekozenAuto = intent.getStringExtra("gekozenAuto")

        // Gekozen gegevens weergeven
        val informatie = findViewById<TextView>(R.id.textViewInfo)

        informatie.text = """
            De gekozen auto is:
            ${gekozenAuto ?: "Niet ingevuld"}

            De gekozen kleur is:
            ${kleur ?: "Niet ingevuld"}
        """.trimIndent()

        // Adres invullen
        val adres = findViewById<EditText>(R.id.editTextAdres)

        // Terug naar pagina 3
        val terug = findViewById<Button>(R.id.buttonNaarPagina)

        terug.setOnClickListener {
            finish()
        }

        // Bestellen
        val bestellen = findViewById<Button>(R.id.buttonBestellen)

        bestellen.setOnClickListener {
            val ingevuldAdres = adres.text.toString()

            if (ingevuldAdres.isEmpty()) {
                adres.error = "Vul je adres in"
            } else {
                informatie.text = "Je bestelling is ingevuld!\nAdres: $ingevuldAdres"
            }
        }
    }
}
