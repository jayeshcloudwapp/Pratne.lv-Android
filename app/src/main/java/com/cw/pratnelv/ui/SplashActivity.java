package com.cw.pratnelv.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.cw.pratnelv.R;

public class SplashActivity extends AppCompatActivity {

    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        handler.postDelayed(mTask, 1000);
    }

    Runnable mTask = new Runnable() {
        @Override
        public void run() {
            startActivity(new Intent(SplashActivity.this, WelcomeActivity.class));
            finish();
        }
    };

}