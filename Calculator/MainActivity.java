package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
    public class MainActivity extends AppCompatActivity {

        Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttondot, buttonplus, buttonminus, buttonmultiply, buttonC, buttonequals;
        EditText result;
        float mvalueone, mvaluetwo;
        boolean plus, minus, multiply;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            button0 = findViewById(R.id.button0);
            button1 = findViewById(R.id.button1);
            button2 = findViewById(R.id.button2);
            button3 = findViewById(R.id.button3);
            button4 = findViewById(R.id.button4);
            button5 = findViewById(R.id.button5);
            button6 = findViewById(R.id.button6);
            button7 = findViewById(R.id.button7);
            button8 = findViewById(R.id.button8);
            button9 = findViewById(R.id.button9);
            buttonC = findViewById(R.id.buttonc);
            buttondot = findViewById(R.id.buttondot);
            buttonplus = findViewById(R.id.plus);
            buttonminus = findViewById(R.id.minus);
            buttonmultiply = findViewById(R.id.multiply);
            buttonequals = findViewById(R.id.buttonequals);
            result = findViewById(R.id.edit1);

            button1.setOnClickListener(new View.OnClickListener() {
                public void nClick(View v) {
                    result.setText(result.getText() + "1");
                }
            });

            button2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    result.setText(result.getText() + "2");
                }
            });

            button3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    result.setText(result.getText() + "3");
                }
            });

            button4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    result.setText(result.getText() + "4");
                }
            });

            button5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    result.setText(result.getText() + "5");
                }
            });

            button6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    result.setText(result.getText() + "6");
                }
            });

            button7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    result.setText(result.getText() + "7");
                }
            });

            button8.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    result.setText(result.getText() + "8");
                }
            });

            button9.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    result.setText(result.getText() + "9");
                }
            });

            button0.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    result.setText(result.getText() + "0");
                }
            });

            buttondot.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    result.setText(result.getText() + ".");
                }
            });

            buttonC.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    result.setText("");
                }
            });

            buttonplus.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (result.getText().toString().equals("")) {
                        result.setText("");
                    } else {
                        mvalueone = Float.parseFloat(result.getText().toString());
                        plus = true;
                        result.setText(null);
                    }
                }
            });

            buttonminus.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (result.getText().toString().equals("")) {
                        result.setText("");
                    } else {
                        mvalueone = Float.parseFloat(result.getText().toString());
                        minus = true;
                        result.setText(null);
                    }
                }
            });

            buttonmultiply.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (result.getText().toString().equals("")) {
                        result.setText("");
                    } else {
                        mvalueone = Float.parseFloat(result.getText().toString());
                        multiply = true;
                        result.setText(null);
                    }
                }
            });

            buttonequals.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    mvaluetwo = Float.parseFloat(result.getText().toString());

                    if (plus == true) {
                        result.setText(String.valueOf(mvalueone + mvaluetwo));
                        plus = false;
                    }

                    if (minus == true) {
                        result.setText(String.valueOf(mvalueone - mvaluetwo));
                        minus = false;
                    }

                    if (multiply == true) {
                        result.setText(String.valueOf(mvalueone * mvaluetwo));
                        multiply = false;
                    }
                }
            });
        }
    }
