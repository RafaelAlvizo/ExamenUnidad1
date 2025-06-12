package com.example.examenunidad1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

// Esta es la actividad principal donde el usuario ingresa su nombre.
// Si deja el campo vacío, se le pedirá que lo llene antes de continuar.

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val btnEntrar = findViewById<Button>(R.id.btnEntrar)
        val btnSalir = findViewById<Button>(R.id.btnSalir)

        btnEntrar.setOnClickListener {
            val nombre = etNombre.text.toString().trim()

            if (nombre.isEmpty()) {
                // Mostrar mensaje si el campo está vacío
                Toast.makeText(this, "Por favor ingresa tu nombre", Toast.LENGTH_SHORT).show()
            } else {
                // Continuar si el nombre es válido
                val intent = Intent(this, RectanguloActivity::class.java)
                intent.putExtra("nombre", nombre)
                startActivity(intent)
            }
        }

        btnSalir.setOnClickListener {
            finishAffinity()
        }
    }
}
