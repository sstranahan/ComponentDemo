package com.example.componentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button spanBtn;
    Button engBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spanBtn = (Button)findViewById(R.id.spanish);
        engBtn = (Button)findViewById(R.id.english);

        spanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,SpanView.class);
                MainActivity.this.startActivity(intent);
            }
        });

        engBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,EngView.class);
                MainActivity.this.startActivity(intent);
            }
        });

    }



}