package com.example.par2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var text_enviar: EditText
    lateinit var button_enviar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_enviar = findViewById(R.id.text_enviar)
        button_enviar = findViewById(R.id.button_enviar)

        button_enviar.setOnClickListener {
            val textoIngresado = text_enviar.text.toString()
            val intent = Intent(this, Enviar::class.java)
            intent.putExtra("texto_Enviado", textoIngresado)
            startActivity(intent)
        }
    }
}
