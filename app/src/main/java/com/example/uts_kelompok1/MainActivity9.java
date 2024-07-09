package com.example.uts_kelompok1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity9 extends AppCompatActivity {

    Button btnSajaaaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main9);

        btnSajaaaa = findViewById(R.id.btnSajaaaa);
        btnSajaaaa.setOnClickListener(v1 -> startActivity(new Intent(MainActivity9.this, MainActivity3.class)));
    }
}