package com.example.startanotheractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button btn = findViewById(R.id.button);
        Button btn2 = findViewById(R.id.button2);
        final RadioGroup radioSexGroup = findViewById(R.id.radioGroup);
        final CheckBox ch1 = findViewById(R.id.checkBox1);
        final CheckBox ch2 = findViewById(R.id.checkBox2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer result = new StringBuffer();
                result.append("check box1: ").append(ch1.isChecked());
                result.append("\ncheck box2: ").append(ch2.isChecked());
                Toast.makeText(MainActivity3.this, result.toString(),
                        Toast.LENGTH_LONG).show();


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = radioSexGroup.getCheckedRadioButtonId();
                RadioButton radioSexButton = findViewById(selectedId);
                Toast.makeText(MainActivity3.this,radioSexButton.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });

            }



    }
