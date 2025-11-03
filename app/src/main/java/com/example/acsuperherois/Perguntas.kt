package com.example.acsuperherois

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Perguntas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroupOpcoes)
        val btnResultado = findViewById<Button>(R.id.btnVerResultado)

        btnResultado.setOnClickListener {
            val idSelecionado = radioGroup.checkedRadioButtonId
            var heroi = ""

            when (idSelecionado) {
                R.id.radioSombrio -> heroi = "batman"
                R.id.radioBilionario -> heroi = "homem_de_ferro"
                R.id.radioForca -> heroi = "hulk"
                R.id.radioInvencivel -> heroi = "superman"
            }

            if (heroi.isNotEmpty()) {
                val intent = Intent(this, Resultado::class.java)
                intent.putExtra("NOME_HEROI", heroi)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Por favor, escolha uma opção", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
