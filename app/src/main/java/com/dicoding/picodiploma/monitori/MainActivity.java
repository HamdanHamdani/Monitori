package com.dicoding.picodiploma.monitori;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//    tgl-pengerjaan : 07 Mei 2021
//    deskripsi pengerjaan : mengerjakan activity welcome, login code, biodata, dan say hai
//    nim : 10116580
//    nama : Hamdan Hamdani
//    kelas : IF-1

    Button btnMulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMulai = findViewById(R.id.btnMulai);

        btnMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Login_Code.class );
                startActivity(i);
            }
        });

    }
}