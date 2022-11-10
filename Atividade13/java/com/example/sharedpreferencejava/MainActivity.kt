package com.example.sharedpreferencejava

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import com.example.sharedpreferencejava.R
import android.content.SharedPreferences
import android.view.View
import android.widget.Button
import com.example.sharedpreferencejava.MainActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //private var btnSalvar: Button? = null
    //private var txtNome: EditText? = null
    //private var labelResultado: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txtNome = findViewById<EditText>(R.id.txtNome)
        var btnSalvar = findViewById<Button>(R.id.btnSalvar)
        var labelResultado = findViewById<TextView>(R.id.labelResultado)

        //Ativar o código ao clicar no botão Salvar
        btnSalvar.setOnClickListener(View.OnClickListener {
            //Cria ou chama o arquivo texto gravado no celular
            val preferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0)

            //Faz a ligação entre o aplicativo e o arquivo, habilita a edição no arquivo
            val editor = preferences.edit()

            //Validar o nome
            if (txtNome.getText().toString() == "") {
                //Toast vai criar na tela uma label temporaria mostrando o conteudo do text abaixo se o edi
                Toast.makeText(applicationContext, "Preencha seu nome", Toast.LENGTH_LONG).show()
            } else {
                //nome recebe o valor digitado no txtNome
                val nome = txtNome.getText().toString()
                //Salva no arquivo no arquivo na chave nome a variavel nome
                editor.putString("nome", nome)
                editor.commit()
                //Exibe na labelResultado o valor da variavel nome
                labelResultado.setText("Olá, $nome")
            }
        })

        //Recuperar dados salvos
        //Cria ou chama o arquivo texto gravado no celular
        val preferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0)
        //Validar se o arquivo está vazio
        if (preferences.contains("nome")) {
            val nome = preferences.getString("nome", "\"usuário não definido\"")
            labelResultado.setText("Olá, $nome")
        } else {
            labelResultado.setText("Olá, usuário não definido")
        }
    }

    companion object {
        private const val ARQUIVO_PREFERENCIA = "arquivoPreferencia"
    }
}