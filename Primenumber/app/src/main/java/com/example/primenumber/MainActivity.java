package com.example.primenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ed1;
    Button btn;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText) findViewById(R.id.num);
        btn=(Button) findViewById(R.id.button);
        tv1=(TextView) findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int i,n,flag = 0;
                int x=Integer.parseInt(ed1.getText().toString());
                for(i=2;i<=x/2;i++)
                {
                    if(x%i==0)
                    {
                        flag=1;
                        break;
                    }
                }

                if(flag==0)
                {
                    tv1.setText("Number is prime");
                }
                else
                {
                    tv1.setText("Number is not prime");
                }
            }
        });
    }
}
