package com.example.lanchonete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        supportActionBar?.title = ""
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId) {
            R.id.bt_lanches -> {
                val arrayAdapter: ArrayAdapter<*>
                val lanches = arrayOf(
                    "Hamburger", "X-Burger", "X-Bacon", "X-Tudo", "X-ITE"
                )
                var lista = findViewById<ListView>(R.id.listViewLanches)
                arrayAdapter = ArrayAdapter(
                    this,
                    android.R.layout.simple_list_item_1, lanches
                )
                lista.adapter = arrayAdapter
            }
        }
        when(item?.itemId) {
                R.id.bt_porcoes -> {
                    val arrayAdapter: ArrayAdapter<*>
                    val porcoes = arrayOf(
                        "Batata Frita", "Frango Frito", "Polenta Frita", "Mandioca Frita", "Ovos de Codorna"
                    )
                    var lista = findViewById<ListView>(R.id.listViewLanches)
                    arrayAdapter = ArrayAdapter(
                        this,
                        android.R.layout.simple_list_item_1, porcoes
                    )
                    lista.adapter = arrayAdapter
                }
            }
        when(item?.itemId) {
            R.id.bt_bebidas -> {
                    val arrayAdapter: ArrayAdapter<*>
                    val bebidas = arrayOf(
                        "Água", "Suco (sabores)", "Coca-Cola", "Fanta", "Sprite"
                    )
                    var lista = findViewById<ListView>(R.id.listViewLanches)
                    arrayAdapter = ArrayAdapter(this,
                        android.R.layout.simple_list_item_1, bebidas)
                    lista.adapter = arrayAdapter
            }
        }
        return super.onOptionsItemSelected(item)
    }
}