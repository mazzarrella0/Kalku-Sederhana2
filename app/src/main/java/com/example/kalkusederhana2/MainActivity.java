package com.example.kalkusederhana2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etAngka1, etAngka2;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAngka1 = findViewById(R.id.etAngka1);
        etAngka2 = findViewById(R.id.etAngka2);
        tvHasil = findViewById(R.id.tvHasil);
    }

    public void hitung(View v) {
        String inputAngka1 = etAngka1.getText().toString();
        String inputAngka2 = etAngka2.getText().toString();

        if (inputAngka1.isEmpty() || inputAngka2.isEmpty()) {
            Toast.makeText(this, "Isi dulu kedua angkanya", Toast.LENGTH_SHORT).show();
            return;
        }

        double a = Double.parseDouble(inputAngka1);
        double b = Double.parseDouble(inputAngka2);
        double hasil = 0;

        int id = v.getId();

        if (id == R.id.btnTambah) {
            hasil = a + b;
        } else if (id == R.id.btnKurang) {
            hasil = a - b;
        } else if (id == R.id.btnKali) {
            hasil = a * b;
        } else if (id == R.id.btnBagi) {
            if (b == 0) {
                Toast.makeText(this, "Tidak bisa dibagi 0", Toast.LENGTH_SHORT).show();
                return;
            }
            hasil = a / b;
        }

        else if (id == R.id.btnModulus) {
        if (b == 0) {
            Toast.makeText(this, "Tidak bisa modulus dengan 0", Toast.LENGTH_SHORT).show();
            return;
        }
        hasil = a % b;
    }

        tvHasil.setText("Hasil: " + hasil);
    }
}