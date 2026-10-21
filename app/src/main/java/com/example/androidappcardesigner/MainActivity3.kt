
package com.example.androidappcardesigner

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val rood = Color.rgb(217, 0, 0)

        window.statusBarColor = rood
        window.navigationBarColor = rood

        val naarPagina2 =
            findViewById<Button>(R.id.buttonNaarPagina2)

        val naarPagina1 =
            findViewById<Button>(R.id.buttonNaarPagina1)

        listOf(naarPagina2, naarPagina1).forEach { knop ->
            knop.backgroundTintList = ColorStateList.valueOf(rood)
            knop.setTextColor(Color.WHITE)
        }


        naarPagina2.setOnClickListener {
            finish()
        }


        naarPagina1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
            finish()
        }
    }
}
