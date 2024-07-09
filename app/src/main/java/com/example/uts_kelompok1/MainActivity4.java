package com.example.uts_kelompok1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {

    Button btnSelanjut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

            btnSelanjut = findViewById(R.id.btnSelanjut);
            btnSelanjut.setOnClickListener(v1 -> startActivity(new Intent(MainActivity4.this, MainActivity5.class)));
    }
}