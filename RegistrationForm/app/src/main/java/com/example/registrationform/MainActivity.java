package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	EditText firstName;
	EditText lastName;
	EditText address;
	EditText email;
	EditText phonenumber;
	Button register;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		firstName = findViewById(R.id.firstName);
		lastName = findViewById(R.id.lastName);
		address = findViewById(R.id.address);
		email = findViewById(R.id.email);
		phonenumber = findViewById(R.id.phonenumber);
		register = findViewById(R.id.register);

		register.setOnClickListener(view -> checkDataEntered());
	}

	boolean isEmail(EditText text) {
		CharSequence email = text.getText().toString();
		return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
	}

	boolean isEmpty(EditText text) {
		CharSequence str = text.getText().toString();
		return TextUtils.isEmpty(str);
	}

	void checkDataEntered() {
		if (isEmpty(firstName)) {
			Toast t = Toast.makeText(this, "You must enter first name to register!", Toast.LENGTH_SHORT);
			t.show();
		}

		if (isEmpty(lastName)) {
			lastName.setError("Last name is required!");
		}

		if (!isEmail(email)) {
			email.setError("Enter valid email!");
		}

	}
}
