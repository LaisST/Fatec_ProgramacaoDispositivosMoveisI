package com.example.celsiusapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt_c = findViewById<EditText>(R.id.txt_c)
        val txt_Resultado_f = findViewById<TextView>(R.id.txt_Resultado_f)
        val btn_Converter_f = findViewById<Button>(R.id.btn_converter_f)

        val txt_f = findViewById<EditText>(R.id.txt_f)
        val txt_Resultado_c = findViewById<TextView>(R.id.txt_Resultado_c)
        val btn_Converter_c = findViewById<Button>(R.id.btn_converter_c)

        btn_Converter_f.setOnClickListener{
            if(txt_c.text.isEmpty()){
                txt_c.error = "Digite a temperatura em Celsius"
            } else {
                val celsius = txt_c.text.toString().toDouble()
                val resultado_f: Double
                resultado_f = (9 * celsius + 160) / 5
                txt_Resultado_f.text = "$celsius ºC equivale a $resultado_f ºF"
                txt_c.text.clear()
            }
        }

        btn_Converter_c.setOnClickListener{
            if(txt_f.text.isEmpty()){
                txt_f.error = "Digite a temperatura em Fahrenheit"
            } else {
                val fahrenheit = txt_f.text.toString().toDouble()
                val resultado_c: Double
                resultado_c = (fahrenheit - 32) * 5/ 9
                txt_Resultado_c.text = "$fahrenheit ºC equivale a $resultado_c ºF"
                txt_f.text.clear()
            }
        }

    }
}