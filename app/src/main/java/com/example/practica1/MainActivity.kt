package com.example.practica1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

lateinit var num1 : EditText
lateinit var num2 : EditText
lateinit var calcular : Button
lateinit var resultado : TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1 = findViewById(R.id.TxtNum1)
        num2 = findViewById(R.id.TxtNum2)
        calcular = findViewById(R.id.BtnCalcular)
        resultado = findViewById(R.id.LlbResultado)

        calcular.setOnClickListener{
            var TextoNumero1 = num1.text.toString()
            var TextoNumero2 = num2.text.toString()

            if (TextoNumero1.isNotEmpty() && TextoNumero2.isNotEmpty()){
                var  numero1 = TextoNumero1.toFloat()
                var  numero2 = TextoNumero2.toFloat()
                var suma = numero1 + numero2

                resultado.text = "Resultado: $suma"
            }
            else {
                resultado.text = "Favor ingrese ambos numeros"
            }
        }
    }
}

