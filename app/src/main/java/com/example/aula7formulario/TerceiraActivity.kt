package com.example.aula7formulario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aula7formulario.databinding.ActivitySegundaBinding
import com.example.aula7formulario.databinding.ActivityTerceiraBinding

class TerceiraActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTerceiraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTerceiraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //recuperando a inteção extras (Intent)
        val extras = intent.extras

        //criar novas variáveis
        //incoming é que está vindo = tem que deixar a ? que é para a opção do null,
        // se não, pode acabar dando cresh
        val incomingNome = extras?.getString("EXTRA_NOME") // getString => é para trazer a nossa String
        val incomingCel = extras?.getInt("EXTRA_CEL")
        val incomingEndereco = extras?.getString("EXTRA_ENTERECO")
        val incomingEmail = extras?.getString("EXTRA_EMAIL") // getString => é para trazer a nossa String
        val incomingDoce = extras?.getString("EXTRA_DOCE")
        val incomingFruta = extras?.getString("EXTRA_FRUTA")

        val formularioString1 = " $incomingNome seu cellular $incomingCel e endereço: $incomingEndereco , foram adicionados com sucesso!!!"
        binding.resposta1.text = formularioString1

        val formularioString2 = "Voce receberá no seu e-mail: $incomingEmail , uma foto de $incomingDoce , e uma foto de $incomingFruta"
        binding.resposta2.text = formularioString2
    }
}