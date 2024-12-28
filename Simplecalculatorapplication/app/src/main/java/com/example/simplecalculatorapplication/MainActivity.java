package com.example.simplecalculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.simplecalculatorapplication.R;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6;
    EditText e1,e2;
    TextView t1;
    int num1,num2;

    public boolean getNumbers() {


        e1 = (EditText) findViewById(R.id.editTextTextPersonName);


        e2 = (EditText) findViewById(R.id.editTextTextPersonName1);


        t1 = (TextView) findViewById(R.id.textView);


        String s1 = e1.getText().toString();


        String s2 = e2.getText().toString();
        if(s1.equals("Please enter value 1") && s2.equals(null))
        {
            String result = "Please enter value 2";
            e2.setText(result);
            return false;
        }
        if(s1.equals(null) && s2.equals("Please enter value 2"))
        {
            String result = "Please enter value 1";
            e1.setText(result);
            return false;
        }
        if(s1.equals("Please enter value 1") || s2.equals("Please enter value 2"))
        {
            return false;
        }

        if((!s1.equals(null) && s2.equals(null))|| (!s1.equals("") && s2.equals("")) ){

            String result = "Please enter value 2";

            e2.setText(result);
            return false;
        }
        if((s1.equals(null) && !s2.equals(null))|| (s1.equals("") && !s2.equals("")) ){

            String result = "Please enter value 1";
            e1.setText(result);
            return false;
        }
        if((s1.equals(null) && s2.equals(null))|| (s1.equals("") && s2.equals("")) ){

            String result1 = "Please enter value 1";
            e1.setText(result1);
            String result2 = "Please enter value 2";
            e2.setText(result2);
            return false;
        }

        else {

            num1 = Integer.parseInt(s1);
            num2 = Integer.parseInt(s2);


        }

        return true;
    }

    public void doSum() {


        if (getNumbers()) {
            int sum = num1 + num2;
            t1.setText(Integer.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }

    }

    public void clearTextNum1(View v) {


        e1.getText().clear();
    }
    public void clearTextNum2(View v) {


        e2.getText().clear();
    }

    public void doPow() {


        if (getNumbers()) {
            double sum = Math.pow(num1, num2);
            t1.setText(Double.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }
    }

    public void doSub() {

        if (getNumbers()) {
            int sum = num1 - num2;
            t1.setText(Integer.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }
    }

    public void doMul() {

        if (getNumbers()) {
            int sum = num1 * num2;
            t1.setText(Integer.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }
    }


    public void doDiv() {

        if (getNumbers()) {


            double sum = num1 / (num2 * 1.0);
            t1.setText(Double.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }
    }


    public void doMod() {

        if (getNumbers()) {
            double sum = num1 % num2;
            t1.setText(Double.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button1);
        b3=(Button) findViewById(R.id.button2);
        b4=(Button) findViewById(R.id.button3);
        b5=(Button) findViewById(R.id.button4);
        b6=(Button) findViewById(R.id.button5);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doSum();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doSub();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doPow();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doMul();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doDiv();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doMod();
            }
        });


    }
}
