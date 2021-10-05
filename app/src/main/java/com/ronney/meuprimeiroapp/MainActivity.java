package com.ronney.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TextView text = new TextView(this);
        // text.setText("É Nois");
        // setContentView(text);
        // setContentView(R.layout.activity_main);
        // Toolbar toolBar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(tooBar);
    }

    public void exibir(View view) {
        //TextView textView = (TextView) findViewById(R.id.textView2);
    }
}