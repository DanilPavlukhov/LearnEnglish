package com.example.learnenglish.BasicActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import com.example.learnenglish.R;

public class SplashActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private int pStatus = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Handler handler = new Handler();


        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, RegistrationActivity.class));
                finish();
            }
        },1000);
    }
}