package com.example.demo

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class activity_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnRutas = findViewById<MaterialButton>(R.id.btnRutas)
        val btnProceso = findViewById<MaterialButton>(R.id.btnProceso)

        btnRutas.setOnClickListener {
            startActivity(Intent(this, activity_prueba::class.java))
        }

        btnProceso.setOnClickListener {
            startActivity(Intent(this, activity_proceso::class.java))
        }
    }
}