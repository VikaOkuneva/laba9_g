package com.example.myapplication;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Question_1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);


        Button button_var1 = findViewById(R.id.button_var1);
        Button button_var2 = findViewById(R.id.button_var2);
        Button button_var4 = findViewById(R.id.button_var4);
        TextView warning = findViewById(R.id.warning);

        button_var1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_var1.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                warning.setText("Неправильно!");
            }
        });
        button_var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_var2.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                warning.setText("Неправильно!");
            }
        });
        button_var4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_var4.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                warning.setText("Неправильно!");
            }
        });

    }
    public void onClickWin(View v) {
        Intent intent = new Intent(this, Congratulations.class);
        startActivity(intent);
    }
}