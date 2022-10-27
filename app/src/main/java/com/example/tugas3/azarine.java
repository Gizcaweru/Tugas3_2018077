package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class azarine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azarine);
    }

    public void sunscreen(View view){
        Intent a = new Intent(azarine.this, MainActivity.class);
        startActivity(a);
    }
    public void wardah1(View view){
        Intent a = new Intent(azarine.this, wardah1.class);
        startActivity(a);
    }
}