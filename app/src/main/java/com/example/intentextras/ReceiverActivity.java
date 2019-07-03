package com.example.intentextras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;




public class ReceiverActivity extends AppCompatActivity {
    TextView tvName;
    TextView tvAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciver);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tvName=findViewById(R.id.tvName);
        tvAge=findViewById(R.id.tvAge);

        Bundle  Extras = getIntent().getExtras();
        if (Extras != null){
            String name = Extras.getString("etName");
            String age = Extras.getString("etAge");
            tvName.setText(name);
            tvAge.setText(age);
        }




//        String savedExtra = getIntent().getStringExtra("etName");
//        tvName.setText(name);
//        int savedExtraNumber = getIntent().getIntExtra("etAge",);
//        tvAge.setText(age);

    }
}
