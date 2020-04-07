package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class halaman3 extends AppCompatActivity {
    private Button button;
    EditText nama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman3);
        button = findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhalaman4();
            }
        });
    }
    public void openhalaman4(){
        nama = (EditText)findViewById(R.id.editText);
        String text = nama.getText().toString();

        Intent intent = new Intent(this, halaman4.class);
        intent.putExtra("nama",text);
        startActivity(intent);
    }
}
