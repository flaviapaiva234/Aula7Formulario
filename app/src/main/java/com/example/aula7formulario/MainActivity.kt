package com.example.aula7formulario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aula7formulario.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botaoAplicar.setOnClickListener {

            val nome = binding.etNome.text.toString()
            val cel = binding.etCel.text.toString().toInt()
            val endereco = binding.etEnd.text.toString()


            //tem que importar o Intent (Alt+Enter)
            Intent(this, SegundaActivity::class.java).also {

                val bundle = Bundle()
                bundle.putString("EXTRA_NOME", nome)
                bundle.putInt("EXTRA_NOME", cel)
                bundle.putString("EXTRA_NOME", endereco)
                it.putExtras(bundle)


                startActivity(it) //Iniciar a ação da Activity

            }

        }
    }
}