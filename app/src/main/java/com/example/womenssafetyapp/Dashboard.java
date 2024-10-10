package com.example.womenssafetyapp;

import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Dashboard extends AppCompatActivity {
    ImageView contact,selfdefence,laws, img;
    Button logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        contact = findViewById(R.id.contact);
        logout=findViewById(R.id.logoutbtn);

        selfdefence = findViewById(R.id.selfdef);
        laws = findViewById(R.id.laws);
        img = findViewById(R.id.sett);

        NotificationUtils.displayNotification(this, "ALERT", "Click me if you are in trouble!");
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this, com.example.womenssafetyapp.contact.class));
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), loginPage.class));
            }
        });

        selfdefence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this, self_defence.class));
            }
        });

        laws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this, basic_law.class));
            }
        });
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this, about_us.class));
            }
        });



    }

}


