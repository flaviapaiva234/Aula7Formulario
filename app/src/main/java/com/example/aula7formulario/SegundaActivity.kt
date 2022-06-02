package com.example.aula7formulario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aula7formulario.databinding.ActivityMainBinding
import com.example.aula7formulario.databinding.ActivitySegundaBinding

class SegundaActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySegundaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val email = intent.getStringExtra("EXTRA_EMAIL")
        val doce = intent.getStringExtra("EXTRA_DOCE")
        val fruta = intent.getStringExtra("EXTRA_FRUTA")

        binding.botaoAplicar2.setOnClickListener {

            Intent(this, TerceiraActivity::class.java).also{

                val bundle = Bundle()
                with(bundle){
                    putString("EXTRA_EMAIL", email)
                    putString("EXTRA_DOCE", doce)
                    putString("EXTRA_FRUTA", fruta)
                    it.putExtras(bundle)
                }
                startActivity(it)
            }

        }


    }
}