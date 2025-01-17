package com.example.alertapp;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Do you want to exit");
        builder.setTitle("Alert !");
        builder.setCancelable(false);

        builder.setPositiveButton("yes",(DialogInterface.OnClickListener)(dialog,which)->{
            finish();
        });

        builder.setNegativeButton("No",(DialogInterface.OnClickListener)(dialog,which)->{
            dialog.cancel();
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
}
