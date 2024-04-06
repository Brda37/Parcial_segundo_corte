package com.example.par2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class Enviar : AppCompatActivity() {

    lateinit var mostrar: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enviar)

        mostrar = findViewById(R.id.mostrar)

        val textoRecibido = intent.getStringExtra("texto_Enviado")
        mostrar.text = textoRecibido
    }
}
