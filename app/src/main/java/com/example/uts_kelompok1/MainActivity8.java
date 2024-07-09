package com.example.uts_kelompok1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity8 extends AppCompatActivity {

    Button btnSajaaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main8);

        btnSajaaa = findViewById(R.id.btnSajaaa);
        btnSajaaa.setOnClickListener(v1 -> startActivity(new Intent(MainActivity8.this, MainActivity9.class)));
    }
}