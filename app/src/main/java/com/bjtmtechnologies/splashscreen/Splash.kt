package com.bjtmtechnologies.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieDrawable
import com.bjtmtechnologies.splashscreen.databinding.ActivitySplashBinding

class Splash : AppCompatActivity() {


    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupAnim()

    }

    private fun setupAnim() {
        binding.lottie.setAnimation(R.raw.moneysplash)
        binding.lottie.repeatCount = LottieDrawable.INFINITE
        binding.lottie.playAnimation()

        binding.img.animate().translationY((-3000).toFloat()).setDuration(1000).setStartDelay(5000)
        binding.appName.animate().translationY((2000).toFloat()).setDuration(1000)
            .setStartDelay(5000)
        binding.lottie.animate().translationY((1500).toFloat()).setDuration(1000)
            .setStartDelay(5000)


        Handler().postDelayed({
            val i = Intent(this@Splash, MainActivity::class.java)
            startActivity(i)
        }, 6000)


    }
}