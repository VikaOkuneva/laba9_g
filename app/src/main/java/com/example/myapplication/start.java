package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class start extends AppCompatActivity {

    Handler handler;

    @Override
    protected void onCreate (Bundle savedInsranceState) {
        super.onCreate(savedInsranceState);
        setContentView(R.layout.activity_start);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(start.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);


    }
}
