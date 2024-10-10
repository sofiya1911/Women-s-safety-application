package com.example.womenssafetyapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class basic_law extends AppCompatActivity {
    ImageView back;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_law);
        back=findViewById(R.id.backbtn);
        next=findViewById(R.id.button3);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(basic_law.this, com.example.womenssafetyapp.Dashboard.class));
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(basic_law.this,basic_law1.class));
            }
        });
    }
}