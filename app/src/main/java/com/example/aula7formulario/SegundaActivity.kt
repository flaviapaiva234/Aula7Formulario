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

        val nome = intent.getStringExtra("EXTRA_NOME")
        val endereco = intent.getStringExtra("EXTRA_ENDERECO")
        val cel = intent.getIntExtra("EXTRA_CEL", 0)


        binding.botaoAplicar2.setOnClickListener {

            val email = binding.etEmail.text.toString()
            val doce = binding.etDocePreferido.text.toString()
            val fruta = binding.etFrutaPreferida.text.toString()

            Intent(this, TerceiraActivity::class.java).also{

                val bundle = Bundle()
                with(bundle){
                    putString("EXTRA_NOME", nome)
                    putInt("EXTRA_CEL", cel)
                    putString("EXTRA_ENDERECO", endereco)
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