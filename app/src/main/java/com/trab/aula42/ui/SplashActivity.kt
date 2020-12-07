package com.trab.aula42.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.trab.aula42.R
import kotlinx.coroutines.*

class SplashActivity : AppCompatActivity(){
    val scope = CoroutineScope(Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()

        var intent = Intent(this, MainActivity::class.java)
        scope.launch {
            delay(3000)
            startActivity(intent)
            finish()
        }
    }

    override fun onPause() {
        scope.cancel()
        super.onPause()
    }
}