package br.com.alura.calculadoraaposentadoria

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.*
import br.com.alura.calculadoraaposentadoria.databinding.ActivityMainBinding

class MainActivity:Activity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        val MainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(MainBinding.root)
        super.onCreate(savedInstanceState)
        var resultado = 0

        //Spinner:
        MainBinding.spnSexo.adapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, listOf("Masculino", "Feminino"))
        var sexo = MainBinding.spnSexo.selectedItem as String

        //Comando Botão:
        MainBinding.btnCalcular.setOnClickListener {
            if (sexo == "Masculino"){
                resultado = 65 - MainBinding.txtIdade.text.toString().toInt()

            }else{
                resultado = 60 - MainBinding.txtIdade.text.toString().toInt()
            }
            MainBinding.txtAposentadoria.text="Faltam $resultado anos, para você se aposentar"
        }

    }

}