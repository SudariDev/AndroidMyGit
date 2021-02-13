package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText no1,no2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no1 = findViewById(R.id.No1);
        no2 = findViewById(R.id.No2);
        tv = findViewById(R.id.result);
    }


    public void add(View v){

        double n1,n2,sum;

        n1 = Double.parseDouble(no1.getText().toString());
        n2 = Double.parseDouble(no2.getText().toString());
        sum = n1+n2;
        tv.setText(Double.toString(sum));

    }
}