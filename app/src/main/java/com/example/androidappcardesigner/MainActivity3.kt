
package com.example.androidappcardesigner

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val v12 = findViewById<Button>(R.id.button5)
        val v8 = findViewById<Button>(R.id.button6)
        val v6 = findViewById<Button>(R.id.button7)

        val geselecteerdeMotor = findViewById<TextView>(R.id.textView3)

        v12.setOnClickListener {
            geselecteerdeMotor.text =
                "De geselecteerde motor is: V12 Twin Turbo"
        }

        v8.setOnClickListener {
            geselecteerdeMotor.text =
                "De geselecteerde motor is: V8"
        }

        v6.setOnClickListener {
            geselecteerdeMotor.text =
                "De geselecteerde motor is: V6"
        }

        // Naar pagina 4
        val volgende = findViewById<Button>(R.id.button4)

        volgende.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        // Terug naar pagina 2
        val terug = findViewById<Button>(R.id.buttonNaarPagina3)

        terug.setOnClickListener {
            finish()
        }
    }
}
