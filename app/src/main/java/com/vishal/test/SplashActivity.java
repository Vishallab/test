package com.vishal.test;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {
    LottieAnimationView splashview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashview = findViewById(R.id.lifeon);

        splashview.animate().translationY(3500).setDuration(500).setStartDelay(5000).setListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(@NonNull Animator animation) {
                //jb animation start ho rhi tb kuch krnah to
            }

            @Override
            public void onAnimationEnd(@NonNull Animator animation) {
                //ba jb animation edn ho jayegi to appnei ko kya krna jaise splash h to apne to intent pass krna h
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);

            }

            @Override
            public void onAnimationCancel(@NonNull Animator animation) {

            }

            @Override
            public void onAnimationRepeat(@NonNull Animator animation) {

            }
        });





    }
}