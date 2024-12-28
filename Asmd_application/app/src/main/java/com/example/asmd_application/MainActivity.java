package com.example.asmd_application;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2;
    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText) findViewById(R.id.num1);
        ed2=(EditText) findViewById(R.id.num2);
        btn1=(Button) findViewById(R.id.btnAdd);
        btn2=(Button) findViewById(R.id.btnSub);
        btn3=(Button) findViewById(R.id.btnMul);
        btn4=(Button) findViewById(R.id.btnDiv);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int x=Integer.parseInt(ed1.getText().toString());
                int y=Integer.parseInt(ed2.getText().toString());
                int z=x+y;
                Toast.makeText(MainActivity.this, "Addition of Number="+z, Toast.LENGTH_LONG).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int x=Integer.parseInt(ed1.getText().toString());
                int y=Integer.parseInt(ed2.getText().toString());
                int z=x-y;
                Toast.makeText(MainActivity.this, "Subtraction of Number="+z, Toast.LENGTH_SHORT).show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int x=Integer.parseInt(ed1.getText().toString());
                int y=Integer.parseInt(ed2.getText().toString());
                int z=x*y;
                Toast.makeText(MainActivity.this, "Multiplication of Number="+z, Toast.LENGTH_SHORT).show();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int x=Integer.parseInt(ed1.getText().toString());
                int y=Integer.parseInt(ed2.getText().toString());
                int z=x/y;
                Toast.makeText(MainActivity.this, "Division of Number="+z, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
