package com.example.demo

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnAcceso = findViewById<MaterialButton>(R.id.btnAcceso)
        btnAcceso.setOnClickListener {
            // Aquí puedes validar campos si deseas
            val intent = Intent(this, activity_menu::class.java)
            startActivity(intent)
        }
    }
}