package com.example.noteslite

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class OnboardingAct1 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_act1)

        val btnNext1 = findViewById<Button>(R.id.btnNext1)
        val lottieAnimationView = findViewById<LottieAnimationView>(R.id.lottieAnimationView)

        // Animasi Lottie
        lottieAnimationView.setAnimation(R.raw.employee1)
        lottieAnimationView.playAnimation()

        btnNext1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnNext1->{
                val intent = Intent(this@OnboardingAct1, OnboardingAct2::class.java)
                startActivity(intent)
            }
        }
    }
}