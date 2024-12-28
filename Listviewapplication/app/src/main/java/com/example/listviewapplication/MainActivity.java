package com.example.listviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    String subject[]= {"MAD", "SPM","PHP","Java"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.list);

        ArrayAdapter<String> aa;

        aa =new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,subject);

        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String ps= aa.getItem(position);
                Toast.makeText(getApplicationContext(),ps, Toast.LENGTH_LONG).show();
            }
        });
    }
}
