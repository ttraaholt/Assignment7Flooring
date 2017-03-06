package com.example.ttraaholt.assignment7flooring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    //Declare the TextView that will be changed
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Call the Intent
        Intent Intent = getIntent();
        //Place the Strings passed into two new variables l and w.
        String l = Intent.getStringExtra("length");
        String w = Intent.getStringExtra("width");
        //Parse the strings to doubles
        Double width = Double.parseDouble(w);
        Double length = Double.parseDouble(l);
        //create a result variable that takes the width and the length and multiplies them together.
        Double result = width * length;

        //Locat the text view from the xml file.
        tvResult = (TextView) findViewById(R.id.textViewResult);
        //set the text view to include the width, length, and result.
        tvResult.setText("Flooring needed: Width is " + width + " and Length is " + length + " and flooring needed is " + result);
    }
}
