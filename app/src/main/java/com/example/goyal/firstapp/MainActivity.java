package com.example.goyal.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       TextView textView = findViewById(R.id.abc);
       textView.setText("Button Frequency = 0");
    }
    int freq =0;
    public void demo (View view){
        Button button = (Button) view;
        button.setText("Button Clicked");
        freq++;

        TextView t= findViewById(R.id.abc);
        t.setText("Button Clicked frequency = " + freq);

    }
}
