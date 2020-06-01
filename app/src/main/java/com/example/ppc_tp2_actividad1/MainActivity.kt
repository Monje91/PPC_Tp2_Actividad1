package com.example.ppc_tp2_actividad1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity2.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btncambio = findViewById(R.id.botonCambiar) as Button

        btncambio.setOnClickListener {
            val intent = (textoacambiar, Activity2::class.java)
            startActivity(intent);
        }
    }
}
