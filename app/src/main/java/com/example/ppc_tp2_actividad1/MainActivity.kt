package com.example.ppc_tp2_actividad1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        botonCambiar.setOnClickListener {
            val intent:Intent = Intent(this, Activity_2::class.java)
            startActivity(intent)
        }

       val recibetexto: Intent=intent
       var muestratexto = recibetexto.getStringExtra("textocambio")
       textomostrar.text = "$muestratexto"
    }
}
