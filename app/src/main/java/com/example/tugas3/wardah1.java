package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class wardah1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wardah1);
    }

    public void sunscreen (View view){
        Intent a = new Intent(wardah1.this, MainActivity.class);
        startActivity(a);
    }
    public void azarine (View view){
        Intent b = new Intent(wardah1.this, azarine.class);
        startActivity(b);
    }
}