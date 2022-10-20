package com.example.anomesdiasapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt_Ano = findViewById<EditText>(R.id.txt_Ano)
        val txt_Mes = findViewById<EditText>(R.id.txt_Mes)
        val txt_Dia = findViewById<EditText>(R.id.txt_Dia)
        val txt_Resultado = findViewById<TextView>(R.id.txt_Resultado)
        val btn_Converter = findViewById<Button>(R.id.btn_Converter)
        var ModoEscuro = findViewById<Switch>(R.id.switch_cor)
        val tela = findViewById<LinearLayout>(R.id.view_Tela)

        btn_Converter.setOnClickListener{
            if(txt_Ano.text.isEmpty()){
                txt_Ano.error = "Digite a quantidade de ano(s)"
            }else if (txt_Mes.text.isEmpty()){
                txt_Mes.error = "Digite a quantidade de Mes(es)"
            }else if (txt_Dia.text.isEmpty()){
                txt_Dia.error = "Digite a quantidade de Dia(s)"
            }else{
                val ano = txt_Ano.text.toString().toInt()
                val mes = txt_Mes.text.toString().toInt()
                val dia = txt_Dia.text.toString().toInt()
                var resultado: Int
                resultado = (ano*360) + (mes*30) + dia
                txt_Resultado.text = "Você tem $resultado dia(s)! "

            }
        }

        ModoEscuro.setOnCheckedChangeListener{
            buttonView, isChecked -> isChecked
            if (isChecked) {
                tela.setBackgroundColor(getResources().getColor(R.color.black))
                txt_Ano.setTextColor(getResources().getColor(R.color.Accent))
                txt_Mes.setTextColor(getResources().getColor(R.color.Accent))
                txt_Dia.setTextColor(getResources().getColor(R.color.Accent))
                txt_Ano.setHintTextColor(getResources().getColor(R.color.Accent))
                txt_Mes.setHintTextColor(getResources().getColor(R.color.Accent))
                txt_Dia.setHintTextColor(getResources().getColor(R.color.Accent))
                txt_Resultado.setTextColor(getResources().getColor(R.color.Accent))
                ModoEscuro.setTextColor(getResources().getColor(R.color.Accent))

            } else {
                tela.setBackgroundColor(getResources().getColor(R.color.Accent))
                txt_Ano.setTextColor(getResources().getColor(R.color.black))
                txt_Mes.setTextColor(getResources().getColor(R.color.black))
                txt_Dia.setTextColor(getResources().getColor(R.color.black))
                txt_Ano.setHintTextColor(getResources().getColor(R.color.black))
                txt_Mes.setHintTextColor(getResources().getColor(R.color.black))
                txt_Dia.setHintTextColor(getResources().getColor(R.color.black))
                txt_Resultado.setTextColor(getResources().getColor(R.color.black))
                ModoEscuro.setTextColor(getResources().getColor(R.color.black))

            }
        }


    }
}