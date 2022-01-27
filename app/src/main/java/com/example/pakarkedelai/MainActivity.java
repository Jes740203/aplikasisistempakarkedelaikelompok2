package com.example.pakarkedelai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView diagnosa, daftarpenyakit, tentangkami;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diagnosa = findViewById(R.id.diagnosa);
        daftarpenyakit = findViewById(R.id.daftarpenyakit);
        tentangkami = findViewById(R.id.tentangkami);

        diagnosa.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Deskripsi.class);
            intent.putExtra("id","G001");
            startActivity(intent);
            finish();
        });

        daftarpenyakit.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, daftar.class);
            finish();
            startActivity(intent);
        });

        tentangkami.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Tentang.class);
            finish();
            startActivity(intent);
        });
    }
}