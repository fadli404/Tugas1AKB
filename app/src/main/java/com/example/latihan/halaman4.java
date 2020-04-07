package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class halaman4 extends AppCompatActivity {
    private Button button;
    TextView tampilnama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman4);

        tampilnama = (TextView)findViewById(R.id.textView8);

        tampilnama.setText("Beres! Sekarang "+getIntent().getStringExtra("nama")+" udah bisa ngecek penggunaan HP mu tiap hari buat "
                +getIntent().getStringExtra("nama")+" ngatur waktu :)");

        button = findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhalaman1();
            }
        });
    }
    public void openhalaman1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
