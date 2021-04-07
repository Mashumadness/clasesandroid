package com.example.tp1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val temperatura: EditText = findViewById(R.id.ingresoTemperatura);
        val button3: Button = findViewById(R.id.button3);
        var resultadoConvertir: TextView = findViewById(R.id.resultadoConvertir)

        var ingresoPalindromo: EditText = findViewById(R.id.ingresoPalindromo);
        val verificar: Button = findViewById(R.id.verificar);
        var resultadoPalindromo: TextView = findViewById(R.id.resultadoPalindromo);



       verificar.setOnClickListener(View.OnClickListener {
           var ing = ingresoPalindromo.toString();
           var dadoVuelta = ing.reversed();

           if(ing == dadoVuelta){
               resultadoPalindromo.text = "Es un palindromo :)";
           }
           else{
               resultadoPalindromo.text = "No es un palindromo :(";
           }
       })

            button3.setOnClickListener(View.OnClickListener {

            var gradosCelsius = temperatura.text.toString().toDouble()
            var gradosFarenheit : Double;

            fun calculo() {
                gradosFarenheit = (1.8 * gradosCelsius) + 32;
                resultadoConvertir.text = gradosFarenheit.toString();
            }
            calculo();
            })

        }




    }






