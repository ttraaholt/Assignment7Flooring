package com.example.ttraaholt.assignment7flooring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    //Creates two EditText variables
    EditText etLength, etWidth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //When the onCreate method is called, attribute etLength and etWidth with their respective Text Fields.
        etLength = (EditText) findViewById(R.id.editTextLength);
        etWidth = (EditText) findViewById(R.id.editTextWidth);
    }
        //On click calculate passes the intent to the Main2Activity and grabs the strings in the two text fields.
        public void onClickCalculate(View v) {

        Intent Intent = new Intent(MainActivity.this, Main2Activity.class);
            String width = etWidth.getText().toString();
            String length = etLength.getText().toString();
            //Attribute the width and length into an extra and send it with the key "length" and "width".
        Intent.putExtra("length",length);
        Intent.putExtra("width",width);
        //Start the Intent
        startActivity(Intent);

    }
}

