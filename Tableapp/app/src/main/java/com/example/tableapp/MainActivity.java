package com.example.tableapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        EditText e1=(EditText) findViewById(R.id.editTextTextPersonName); EditText e2=(EditText) findViewById(R.id.editTextTextEmailAddress2); EditText e3=(EditText) findViewById(R.id.editTextPhone);
        Button btn=(Button) findViewById(R.id.button);

        EditText e4=(EditText) findViewById(R.id.editTextTextPostalAddress);


        btn.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View view) { Toast.makeText(MainActivity.this, "Submitted",
                Toast.LENGTH_LONG).show();
        }
        });
    }
}

