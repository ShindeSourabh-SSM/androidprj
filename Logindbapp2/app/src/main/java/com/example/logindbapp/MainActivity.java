package com.example.logindbapp;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1, ed2;
    Button btn;
    TextView tv;
    private DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText)
                findViewById(R.id.editTextTextPersonName);
        ed2 = (EditText)
        findViewById(R.id.editTextTextPassword);
        btn = (Button) findViewById(R.id.button);
        tv =(TextView) findViewById(R.id.textView);

        dbHandler = new DBHandler(MainActivity.this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = ed1.getText().toString();
                String password = ed2.getText().toString();

                if (username.isEmpty() && password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please Enter all the data..", LENGTH_SHORT).show();
                } else {
                    dbHandler.addNewCourse(username, password);
                    Toast.makeText(MainActivity.this, "login details are added.", LENGTH_SHORT).show();
                    tv.setText("Login credentials are added to database");
                    ed1.setText("");
                    ed2.setText("");
                }
            }
        });



    }
}