package com.example.goodpartner.Login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton
import com.example.goodpartner.MainActivity
import com.example.goodpartner.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val kakaoLoginButton: ImageButton = findViewById(R.id.kakao_login_button)
        kakaoLoginButton.setOnClickListener {
            // 로그인 버튼 클릭 시 MainActivity로 이동
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // LoginActivity 종료
        }
    }
}