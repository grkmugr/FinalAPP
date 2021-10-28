package com.example.lottieanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this,MainPage.class);
                startActivity(intent);
                finish();
            }
        };
        handler.postDelayed(runnable,5000);
    }
}