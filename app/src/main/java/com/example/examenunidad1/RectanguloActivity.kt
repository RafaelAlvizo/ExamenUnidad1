package com.example.examenunidad1

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class RectanguloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangulo)

        val nombre = intent.getStringExtra("nombre")

        val tvNombre = findViewById<TextView>(R.id.tvNombre)
        val etBase = findViewById<EditText>(R.id.etBase)
        val etAltura = findViewById<EditText>(R.id.etAltura)
        val etArea = findViewById<EditText>(R.id.etArea)
        val etPerimetro = findViewById<EditText>(R.id.etPerimetro)

        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val btnRegresar = findViewById<Button>(R.id.btnRegresar)
        val btnLimpiar = findViewById<Button>(R.id.btnLimpiar)

        tvNombre.text = "Mi nombre es $nombre"

        btnCalcular.setOnClickListener {
            val base = etBase.text.toString().toDoubleOrNull()
            val altura = etAltura.text.toString().toDoubleOrNull()
            if (base != null && altura != null) {
                val rect = Rectangulo(base, altura)
                etArea.setText(rect.calcularArea().toString())
                etPerimetro.setText(rect.calcularPerimetro().toString())
            } else {
                Toast.makeText(this, "Ingresa base y altura válidas", Toast.LENGTH_SHORT).show()
            }
        }

        btnRegresar.setOnClickListener {
            finish()
        }

        btnLimpiar.setOnClickListener {
            etBase.text.clear()
            etAltura.text.clear()
            etArea.text.clear()
            etPerimetro.text.clear()
        }
    }
}
