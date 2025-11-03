package com.example.acsuperherois

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Resultado : AppCompatActivity() {

    private var nomeHeroiParaPesquisa: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val imgHeroi = findViewById<ImageView>(R.id.imgResultadoHeroi)
        val txtHeroi = findViewById<TextView>(R.id.txtResultadoHeroi)
        val btnPesquisar = findViewById<Button>(R.id.btnPesquisar)
        val nomeHeroi = intent.getStringExtra("NOME_HEROI")

        when (nomeHeroi) {
            "batman" -> {
                imgHeroi.setImageResource(R.drawable.batman)
                txtHeroi.text = "Você é sombrio como o Batman!"
                nomeHeroiParaPesquisa = "Batman"
            }
            "homem_de_ferro" -> {
                imgHeroi.setImageResource(R.drawable.homem_de_ferro)
                txtHeroi.text = "Você é um gênio bilionário como o Homem de Ferro!"
                nomeHeroiParaPesquisa = "Homem de Ferro"
            }
            "hulk" -> {
                imgHeroi.setImageResource(R.drawable.hulk)
                txtHeroi.text = "Você é forte como o Hulk!"
                nomeHeroiParaPesquisa = "Hulk"
            }
            "superman" -> {
                imgHeroi.setImageResource(R.drawable.superman)
                txtHeroi.text = "Você é poderoso como o Superman!"
                nomeHeroiParaPesquisa = "Superman"
            }
        }

        btnPesquisar.setOnClickListener {

            val url = "https://www.google.com/search?q=$nomeHeroiParaPesquisa"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)

            startActivity(intent)
        }
    }
}
