package com.example.spinner;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity{
    Spinner sp;
    TextView tv;
    String Months[]={"January"," February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=(Spinner) findViewById(R.id.spinner);
        tv=(TextView) findViewById(R.id.textView);
        ArrayAdapter<String> aa;
        aa=new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,Months);
        sp.setAdapter(aa);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i,
                                       long l) {
                String ps=aa.getItem(i);
                Toast.makeText(MainActivity.this, ps, Toast.LENGTH_LONG).show();
                tv.setText(ps);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                tv.setText("Nothig selected");
            }
        });
    }
}