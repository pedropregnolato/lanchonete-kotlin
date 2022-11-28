package com.example.lanchonete

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_login.setOnClickListener {
            IrParaTelaLogin()
        }

    }

    private fun IrParaTelaLogin() {

        val loginTela = Intent(this, LoginActivity::class.java)
        startActivity(loginTela)
    }
}