package com.dicoding.picodiploma.monitori;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Say_Hai extends AppCompatActivity {

    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say__hai);

        String nama = getIntent().getExtras().getString("nama");
        String umur = getIntent().getExtras().getString("umur");

        result = findViewById(R.id.txtResult);
        result.setText("Beres! Sekarang "+nama+"\n udah bisa ngecek\n" +
                "penggunaan HP mu\n tiap hari buat bantu "+nama+"\n ngatur waktu :)");



    }
}