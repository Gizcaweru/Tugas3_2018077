package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void wardah1(View view){
        Intent a = new Intent(MainActivity.this, wardah1.class);
        startActivity(a);
    }
    public void azarine (View view){
        Intent a = new Intent(MainActivity.this, azarine.class);
        startActivity(a);
    }

    public void sunscreen(View view) {
    }
}