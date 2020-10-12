package com.example.startanotheractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String strName = getIntent().getExtras().getString("name");
        String lastName = getIntent().getExtras().getString("lastname");
        int age = getIntent().getExtras().getInt("age");
        TextView text1 = findViewById(R.id.textView);
        TextView text2 = findViewById(R.id.textView2);
        TextView text3 = findViewById(R.id.textView3);
        text1.setText(lastName);
        text2.setText(""+age);
        text3.setText(strName);
    }
}