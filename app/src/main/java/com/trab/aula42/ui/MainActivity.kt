package com.trab.aula42.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.trab.aula42.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<FloatingActionButton>(R.id.btnFAddCont)
        btn.setOnClickListener {
            val intent = Intent(this, ContatoCreatorActivity::class.java)
            startActivity(intent)
        }
    }

    fun exibir() {

    }
}