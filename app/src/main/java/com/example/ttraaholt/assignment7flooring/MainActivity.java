package com.example.ttraaholt.assignment7flooring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText etLength, etWidth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etLength = (EditText) findViewById(R.id.editTextLength);
        etWidth = (EditText) findViewById(R.id.editTextWidth);
    }

        public void onClickCalculate(View v) {

        Intent Intent = new Intent(MainActivity.this, Main2Activity.class);
            String width = etWidth.getText().toString();
            String length = etLength.getText().toString();
        Intent.putExtra("length",length);
        Intent.putExtra("width",width);

        startActivity(Intent);

    }
}

