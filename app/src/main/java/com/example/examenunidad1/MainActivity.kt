package com.example.examenunidad1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

//Pongo comentario para intentar hacer un commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val btnEntrar = findViewById<Button>(R.id.btnEntrar)
        val btnSalir = findViewById<Button>(R.id.btnSalir)

        btnEntrar.setOnClickListener {
            val nombre = etNombre.text.toString()
            val intent = Intent(this, RectanguloActivity::class.java)
            intent.putExtra("nombre", nombre)
            startActivity(intent)
        }

        btnSalir.setOnClickListener {
            finishAffinity()
        }
    }
}