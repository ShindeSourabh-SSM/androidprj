package com.example.greaternumberapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText) findViewById(R.id.num1);
        ed2=(EditText) findViewById(R.id.num2);
        ed3=(EditText) findViewById(R.id.num3);
        btn=(Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result,temp;
                int x=Integer.parseInt(ed1.getText().toString());
                int y=Integer.parseInt(ed2.getText().toString());
                int z=Integer.parseInt(ed3.getText().toString());

                temp=x>y?x:y;
                result=z>temp?z:temp;

                Toast.makeText(MainActivity.this, "Greatest Number is= "+result, Toast.LENGTH_LONG).show();

            }


        });

    }
}
