package com.example.calculadorabitcoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import java.net.URL
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.RuntimeException

import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.Main
import org.json.JSONObject
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    val API_URL = "https://www.mercadobitcoin.net/api/BTC/ticker/"
    private val TAG = "Lais"

    var cotacaoBitcoin: Double = 0.0
    var venda: Double = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Reescrever o log
        Log.v(TAG, "log de verbose")
        Log.d(TAG, "log de debug")
        Log.i(TAG, "log de info")
        Log.w(TAG, "log de alerta")
        //Log.e(TAG, "log de erro", RuntimeException("teste de erro"))

        var btnCalcular = findViewById<Button>(R.id.btnCalcular)
        var btnCalcularVenda = findViewById<Button>(R.id.btnCalcularVenda)



        buscarCotacao()
        buscarVenda()
        btnCalcular.setOnClickListener{ calcular()}
        btnCalcularVenda.setOnClickListener{ calcularVenda() }

    }

    fun buscarCotacao() {
        GlobalScope.async(Dispatchers.Default) {
            val resposta = URL(API_URL).readText()
            cotacaoBitcoin = JSONObject(resposta).getJSONObject("ticker").getDouble("last")
            Log.i(TAG, cotacaoBitcoin.toString())
            val f = NumberFormat.getCurrencyInstance(Locale("pt", "br"))
            val cotacaoFormatada = f.format(cotacaoBitcoin)
            var txtCotacao = findViewById<TextView>(R.id.txtCotacao)
            txtCotacao.setText("$cotacaoFormatada")
            withContext(Main) {}

        }
    }

    fun buscarVenda() {
        GlobalScope.async(Dispatchers.Default) {
            val resposta = URL(API_URL).readText()
            venda = JSONObject(resposta).getJSONObject("ticker").getDouble("sell")
            Log.i(TAG, venda.toString())
            //val f = NumberFormat.getCurrencyInstance(Locale("pt", "br"))
            //val vendaFormatada = f.format(venda)
            var txtVenda = findViewById<TextView>(R.id.txtVenda)
            txtVenda.setText("$venda")
            withContext(Main) {}

        }
    }
        fun calcular(){
            var txtValor = findViewById<EditText>(R.id.txtValor)
            var txtQtd = findViewById<TextView>(R.id.txtQtd)
            if(txtValor.text.isEmpty()){
                txtValor.error = "Preencha um valor"
                return
            }
            //valor digitado pelo usuário
            val valorDigitado = txtValor.text.toString().replace(",", ".").toDouble()
            //Caso não vem valor da API
            val resultado = if (cotacaoBitcoin > 0) valorDigitado / cotacaoBitcoin
                else 0.0
            //Atualizando o textView com o resultado formatado com 8 casas decimais
            txtQtd.text = "%.8f".format(resultado)
            txtValor.text.clear()
            
        }

    fun calcularVenda(){
        var txtValorVenda = findViewById<EditText>(R.id.txtValorVenda)
        var txtQtd = findViewById<TextView>(R.id.txtQtd)
        if(txtValorVenda.text.isEmpty()){
            txtValorVenda.error = "Preencha um valor"
            return
        }
        //valor digitado pelo usuário
        val valorDigitado = txtValorVenda.text.toString().replace(",", ".").toDouble()
        //Caso não vem valor da API
        val resultado = if (venda > 0) valorDigitado * venda
        else 0.0
        //Atualizando o textView com o resultado formatado com 8 casas decimais
        txtQtd.text = "%.8f".format(resultado)
        txtValorVenda.text.clear()

    }





}