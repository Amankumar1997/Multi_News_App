package com.example.multinews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_login);
        new Thread()
        {
            @Override
            public void run() {

                try {
                    super.run();
                    Thread.sleep(1000);
                    Intent it=new Intent(SplashLogin.this,MainActivity.class);
                    startActivity(it);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}