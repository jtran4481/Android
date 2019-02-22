package com.example.johnfirstappaddtion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNum = (EditText) findViewById(R.id.secondNum);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                double num2 = Double.parseDouble(secondNum.getText().toString());
                double result = num1 + num2;

                resultTextView.setText(result + "");
            }
        });

        Button subtractBtn = (Button) findViewById(R.id.subtractBtn);
        subtractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNum = (EditText) findViewById(R.id.secondNum);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                double num2 = Double.parseDouble(secondNum.getText().toString());
                double result = num1 - num2;

                resultTextView.setText(result + "");
            }
        });

        Button multiplyBtn = (Button) findViewById(R.id.multiplyBtn);
        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNum = (EditText) findViewById(R.id.secondNum);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                double num2 = Double.parseDouble(secondNum.getText().toString());
                double result = num1 * num2;

                resultTextView.setText(result + "");
            }
        });

        Button divideBtn = (Button) findViewById(R.id.divideBtn);
        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNum = (EditText) findViewById(R.id.secondNum);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                double num2 = Double.parseDouble(secondNum.getText().toString());
                double result = num1/num2;

                resultTextView.setText(result + "");
            }
        });
    }
}
