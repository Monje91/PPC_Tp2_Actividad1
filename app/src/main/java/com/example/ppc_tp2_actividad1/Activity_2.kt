package com.example.ppc_tp2_actividad1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*

class Activity_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)


        botonOK.setOnClickListener {
            var texto:String = textoacambiar.text.toString()
            startActivity(Intent(this, MainActivity::class.java).putExtra("textocambio", texto) )
        }

        botonCancelar.setOnClickListener {
            finish()
        }
    }
}
