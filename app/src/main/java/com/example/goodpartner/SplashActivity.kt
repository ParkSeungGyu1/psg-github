package com.example.goodpartner

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // 2초 후 LoginActivity로 이동
        CoroutineScope(Dispatchers.Main).launch {
            delay(2000) // 2초 대기
            val intent = Intent(this@SplashActivity, com.example.goodpartner.Login.LoginActivity::class.java)
            startActivity(intent)
            finish() // 스플래시 액티비티 종료
        }
    }
}
