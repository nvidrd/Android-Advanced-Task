package com.example.noteslite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class OnboardingAct3 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_act3)

        val btnNext3 = findViewById<Button>(R.id.btnNext3)
        val btnPrev3 = findViewById<Button>(R.id.btnPrev3)

        btnNext3.setOnClickListener(this)
        btnPrev3.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnNext3 -> {
                val intent = Intent(this@OnboardingAct3, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.btnPrev3 -> {
                val intent = Intent(this@OnboardingAct3, OnboardingAct2::class.java)
                startActivity(intent)
            }
        }
    }
}