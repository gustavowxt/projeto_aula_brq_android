package oo_cor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.brq.projetotestebrq.R
import oo_animal.Animal
import oo_animal.Cachorro

class TesteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teste)

        val corAmarelo = Amarelo(nome = "amarelo claro")
        val corAzul = Azul(nome = "azul claro")
        pintar(corAmarelo)
        pintar(corAzul)



    }
    fun pintar(cor: Cor){
        println("Estou pintando a parada com a cor: ${cor.nome}")
    }

    fun levarAoPetShop(animal: Animal) {
        println ("Levando o(a) ${animal.nome}")
    }

    }
