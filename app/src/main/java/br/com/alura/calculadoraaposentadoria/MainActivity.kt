package br.com.alura.calculadoraaposentadoria

import android.app.Activity
import android.os.Bundle
import android.widget.*


class MainActivity:Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
        super.onCreate(savedInstanceState)
        val spn_sexo = findViewById<Spinner>(R.id.spn_sexo)
        var resultado = 0
        val txt_idade = findViewById<EditText>(R.id.txt_idade)
        val btn_calcular =findViewById<Button>(R.id.btn_calcular)
        spn_sexo.adapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, listOf("Masculino", "Feminino"))
        var sexo = spn_sexo.selectedItem as String
        var txt_aposentadoria =findViewById<TextView>(R.id.txt_aposentadoria)

        btn_calcular.setOnClickListener {



            if (sexo == "Masculino"){
                resultado = 65 - txt_idade.text.toString().toInt()

            }else{
                resultado = 60- txt_idade.text.toString().toInt()
            }
            txt_aposentadoria.text="Faltam $resultado anos, para você se aposentar"
        }

    }

}