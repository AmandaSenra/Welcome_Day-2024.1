package com.amandasenra.welcomeday_20241

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Fazer a barra de tarefas não parecer
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
    }

    fun sortear(view: View){
        val textoResultado = findViewById<TextView>(R.id.resultado)
        val numero = Random().nextInt(101) //0...99
        textoResultado.setText("$numero")
    }
}