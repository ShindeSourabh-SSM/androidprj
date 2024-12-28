package com.example.sourabhshinde;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    GridView gv;
    String[]a=new String[]{"a","b","c","d","e","f","g",
            "h","i","j","k","l","m","n",
            "o","p","q","r","s",
            "t","u","v","w","x","y","z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        gv=(GridView) findViewById(R.id.Grid);
        ArrayAdapter<String>aa=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,a);
        gv.setAdapter(aa);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int i, long id)
            {
                Toast.makeText(getApplicationContext(), ((TextView)v).getText(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}