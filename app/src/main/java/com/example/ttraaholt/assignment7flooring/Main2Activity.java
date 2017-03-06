package com.example.ttraaholt.assignment7flooring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        tvResult = (TextView) findViewById(R.id.textViewResult);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent Intent = getIntent();
        String l = Intent.getStringExtra("length");
        String w = Intent.getStringExtra("width");
        Double length = Double.parseDouble(w);
        Double width = Double.parseDouble(l);
        Double result = width * length;

        tvResult.setText("Flooring needed: Width is " + width + " and length is " + length + " and flooring needed is " + result);
    }
}
