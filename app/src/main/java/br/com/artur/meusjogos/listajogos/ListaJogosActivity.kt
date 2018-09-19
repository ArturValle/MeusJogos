package br.com.artur.meusjogos.listajogos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import br.com.artur.meusjogos.R
import br.com.artur.meusjogos.detalhejogo.DetalheActivity
import br.com.artur.meusjogos.model.Jogo
import kotlinx.android.synthetic.main.activity_lista_jogos.*

class ListaJogosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_jogos)

        rvJogos.adapter = JogosAdapter(this, getJogos(), { jogo ->
            val detalheIntent = Intent(this, DetalheActivity::class.java)
            detalheIntent.putExtra("JOGO", jogo)
            startActivity(detalheIntent)

        })

        rvJogos.layoutManager = LinearLayoutManager(this)
    }

    private fun getJogos(): List<Jogo> {
        return listOf(
                Jogo(R.drawable.spiderman, titulo = "Uncharted", ano = 2018, descricao = "Nao informado"),
                Jogo(R.drawable.crash, titulo = "Crash", ano = 2017, descricao = "Nao informado"),
                Jogo(R.drawable.deadpool, titulo = "Dead Pool", ano = 2018, descricao = "Nao informado"),
                Jogo(R.drawable.farcry5, titulo = "Far Cry 5", ano = 2018, descricao = "Nao informado"),
                Jogo(R.drawable.knack, titulo = "Knack", ano = 2017, descricao = "Nao informado"),
                Jogo(R.drawable.godofwar, titulo = "Good of War", ano = 2018, descricao = "Nao informado")

        )


    }

}
