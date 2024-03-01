package com.example.ocean_android_intro_fev_2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvTexto = findViewById<TextView>(R.id.textView1)
        tvTexto.setText("outra coisa")

        val botao = findViewById<Button>(R.id.button2)
        botao.setText("Ola!")
        botao.setOnClickListener{
            tvTexto.setText("clique")
            Toast.makeText(this, "Clicou...",Toast.LENGTH_LONG).show()
        }
    }
}