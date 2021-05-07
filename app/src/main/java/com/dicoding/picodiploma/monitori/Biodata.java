package com.dicoding.picodiploma.monitori;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Biodata extends AppCompatActivity {

    EditText  nama,umur;
    Button  kirim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        nama = findViewById(R.id.nama);
        umur = findViewById(R.id.umur);
        kirim = findViewById(R.id.btnSelanjutnya);

        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Biodata.this, Say_Hai.class);
                i.putExtra("nama", nama.getText().toString());
                i.putExtra("umur", umur.getText().toString());
                startActivity(i);
            }
        });
    }
}