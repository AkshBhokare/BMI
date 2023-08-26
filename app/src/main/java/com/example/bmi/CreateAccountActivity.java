package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CreateAccountActivity extends AppCompatActivity {

    private EditText nameEditText;
    private EditText emailEditText;
    private EditText mobileEditText;
    private EditText ageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        mobileEditText = findViewById(R.id.mobileEditText);
        ageEditText = findViewById(R.id.ageEditText);
    }

    public void saveProfile(View view) {
        String name = nameEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String mobile = mobileEditText.getText().toString();
        String age = ageEditText.getText().toString();

        // You can now use the collected data to save the user's profile
        // For this example, we'll just show a toast message
        String message = "Profile saved: Name = " + name + ", Email = " + email
                + ", Mobile = " + mobile + ", Age = " + age;
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
