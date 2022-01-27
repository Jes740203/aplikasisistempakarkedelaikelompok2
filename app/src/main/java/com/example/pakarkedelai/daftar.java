package com.example.pakarkedelai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class daftar extends AppCompatActivity {
    ImageView back, penyakit1, penyakit2, penyakit3, penyakit4, penyakit5, penyakit6, penyakit7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        penyakit1 = findViewById(R.id.penyakit1);
        penyakit2 = findViewById(R.id.penyakit2);
        penyakit3 = findViewById(R.id.penyakit3);
        penyakit4 = findViewById(R.id.penyakit4);
        penyakit5 = findViewById(R.id.penyakit5);
        penyakit6 = findViewById(R.id.penyakit6);
        penyakit7 = findViewById(R.id.penyakit7);
        back = findViewById(R.id.back);

        penyakit1.setOnClickListener(v -> {
            Intent intent = new Intent(daftar.this, karatdaun.class);
            startActivity(intent);
            finish();
        });

        penyakit2.setOnClickListener(v -> {
            Intent intent = new Intent(daftar.this, busukrhi.class);
            finish();
            startActivity(intent);
        });

        penyakit3.setOnClickListener(v -> {
            Intent intent = new Intent(daftar.this, busukbatang.class);
            finish();
            startActivity(intent);
        });

        penyakit4.setOnClickListener(v -> {
            Intent intent = new Intent(daftar.this, layubakteri.class);
            startActivity(intent);
            finish();
        });

        penyakit5.setOnClickListener(v -> {
            Intent intent = new Intent(daftar.this, bercakdaun.class);
            finish();
            startActivity(intent);
        });

        penyakit6.setOnClickListener(v -> {
            Intent intent = new Intent(daftar.this, antraknosa.class);
            finish();
            startActivity(intent);
        });

        penyakit7.setOnClickListener(v -> {
            Intent intent = new Intent(daftar.this, Kerdil.class);
            startActivity(intent);
            finish();
        });

        back.setOnClickListener(v -> {
            Intent intent = new Intent(daftar.this, MainActivity.class);
            finish();
            startActivity(intent);
        });

    }
}