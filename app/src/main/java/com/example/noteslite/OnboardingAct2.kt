package com.example.noteslite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class OnboardingAct2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_act2)

        val btnNext2 = findViewById<Button>(R.id.btnNext2)
        val btnPrev2 = findViewById<Button>(R.id.btnPrev2)

        btnNext2.setOnClickListener(this)
        btnPrev2.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnNext2 -> {
                val intent = Intent(this@OnboardingAct2, OnboardingAct3::class.java)
                startActivity(intent)
            }
            R.id.btnPrev2 -> {
                val intent = Intent(this@OnboardingAct2, OnboardingAct1::class.java)
                startActivity(intent)
            }
        }
    }
}