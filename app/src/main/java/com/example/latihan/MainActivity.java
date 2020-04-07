package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
NIM : 10117179
Nama : Wisuda Nur Fadli
Kelas : IF5

04-04 Membuat tampilan halaman pertama
05-04 Membuat tampilan halaman kedua
06-04   - Membuat agar tombol button berfungsi dengan benar
        - Membuat halaman ketiga dan keempat
07-04 Membuat halaman ketiga dapat mengirim inputan nama ke halaman keempat
 */

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            openhalaman2();
            }
        });
    }
    public void openhalaman2(){
        Intent intent = new Intent(this, halaman2.class);
        startActivity(intent);
    }
}
