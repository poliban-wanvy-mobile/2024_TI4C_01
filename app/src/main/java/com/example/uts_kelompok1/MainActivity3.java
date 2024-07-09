package com.example.uts_kelompok1;

import android.content.Intent;
import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.DecimalFormat;

public class MainActivity3 extends AppCompatActivity {

    private EditText buyerNameEditText;
    private EditText itemNameEditText;
    private EditText itemQuantityEditText;
    private EditText itemPriceEditText;
    private EditText paymentEditText;
    private Button calculateButton;
    private TextView resultTextView;
    Button btnHapus, btnBiodata, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        buyerNameEditText = findViewById(R.id.buyerNameEditText);
        itemNameEditText = findViewById(R.id.itemNameEditText);
        itemQuantityEditText = findViewById(R.id.itemQuantityEditText);
        itemPriceEditText = findViewById(R.id.itemPriceEditText);
        paymentEditText = findViewById(R.id.paymentEditText);
        calculateButton = findViewById(R.id.calculateButton);
        resultTextView = findViewById(R.id.resultTextView);
        btnHapus = findViewById(R.id.btnHapus);
        btnBiodata = findViewById(R.id.btnBiodata);
        btnBiodata.setOnClickListener(v -> startActivity(new Intent(MainActivity3.this, MainActivity4.class)));
        btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(v -> startActivity(new Intent(MainActivity3.this, MainActivity2.class)));



        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateTotal();
            }
        });
    }

    private void calculateTotal() {
        String buyerName = buyerNameEditText.getText().toString();
        String itemName = itemNameEditText.getText().toString();
        int itemQuantity = Integer.parseInt(itemQuantityEditText.getText().toString());
        double itemPrice = Double.parseDouble(itemPriceEditText.getText().toString());
        double payment = Double.parseDouble(paymentEditText.getText().toString());

        double totalPrice = itemQuantity * itemPrice;
        double change = payment - totalPrice;

        // Format angka tanpa desimal
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        String totalPriceFormatted = decimalFormat.format(totalPrice);
        String paymentFormatted = decimalFormat.format(payment);
        String changeFormatted = decimalFormat.format(change);

        String result = "Nama Pembeli: " + buyerName + "\n" +
                "Nama Barang: " + itemName + "\n" +
                "Jumlah Barang: " + itemQuantity + "\n" +
                "Harga: " + itemPrice + "\n" +
                "Total Harga: " + totalPriceFormatted + "\n" +
                "Uang Bayar: " + paymentFormatted + "\n" +
                "Kembalian: " + changeFormatted;

        resultTextView.setText(result);
        resultTextView.setVisibility(View.VISIBLE);

        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buyerNameEditText.setText("");
                itemNameEditText.setText("");
                itemQuantityEditText.setText("");
                itemPriceEditText.setText("");
                paymentEditText.setText("");
                resultTextView.setText("");
            }
        });
    }
}


