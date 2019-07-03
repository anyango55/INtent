package com.example.intentextras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;



public class MainActivity extends AppCompatActivity {
    EditText etName;
    EditText etAge;
    Button btnSend;
    String name;
    String age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setActionBar(toolbar);
        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.etAge);
        btnSend = findViewById(R.id.btnSend);


        btnSend.setOnClickListener((v));
        Intent myIntent = new Intent(getBaseContext(), ReceiverActivity.class);
        name = etName.getText().toString();
        age = etAge.getText().toString();
        myIntent.putExtra("etName", name);
        myIntent.putExtra("etAge", age);
        startActivity(myIntent);

    }



}











