package com.example.lanchonete

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.title = "Login"

        bt_back.setOnClickListener {
            IrParaTelaIncial()
        }

        bt_register.setOnClickListener {
            mostrarErro()
        }

        var id = findViewById(R.id.id_login_on) as EditText
        var password = findViewById(R.id.password_login) as EditText
        var bt_login_on = findViewById(R.id.bt_login_on) as Button

        bt_login_on.setOnClickListener {
            var id = id_login_on.text;
            var password = password_login.text;

            if (id == null || id.isEmpty()) {
                Toast.makeText(this@LoginActivity, "Login inválido! Tente novamente.", Toast.LENGTH_SHORT).show()
        }   else if (password == null || password.isEmpty()) {
                Toast.makeText(this@LoginActivity, "Login inválido! Tente novamente.", Toast.LENGTH_SHORT).show()
            } else {
                irParaMenu()
            }
        }
}

    private fun IrParaTelaIncial() {
        val inicialTela = Intent(this, MainActivity::class.java)
        startActivity(inicialTela)
    }

    private fun mostrarErro() {
        Toast.makeText(this,"Ocorreu um erro! Tente novamente.", Toast.LENGTH_SHORT).show()
    }
    private fun irParaMenu(){
        val menuTela = Intent(this,MenuActivity::class.java)
        startActivity(menuTela)
    }

}
