package com.trab.aula42.ui

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.trab.aula42.R


class ContatoCreatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contato_creator)

        findViewById<Button>(R.id.btnSalvar).setOnClickListener {
            finish()
        }
    }
}