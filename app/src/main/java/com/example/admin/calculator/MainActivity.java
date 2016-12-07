package com.example.admin.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int a=0;
    int b=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void toAdd(View view){
        EditText firstNumber = (EditText) findViewById(R.id.first_number);
        EditText secondNumber = (EditText) findViewById(R.id.second_number);

        a= Integer.parseInt(firstNumber.getText().toString());
        b = Integer.parseInt(secondNumber.getText().toString());

        TextView displayNumber = (TextView)findViewById(R.id.display_answer);
        displayNumber.setText(a+b +"");
    }
    public void toMultiply(View view){
        TextView displayNumber = (TextView)findViewById(R.id.display_answer);
        displayNumber.setText(a*b + "");
    }
    public void toSubtract(View view){
        TextView displayNumber = (TextView)findViewById(R.id.display_answer);
        displayNumber.setText(a-b + "");
    }
}





