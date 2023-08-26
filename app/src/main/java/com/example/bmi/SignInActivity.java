package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
    }

    public void signIn(View view) {
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        // Simulate sign-in logic
        if (isValidSignIn(email, password)) {
            // Navigate to the main app screen or another activity
            // For this example, we'll just show a toast message
            Toast.makeText(this, "Sign-in successful!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isValidSignIn(String email, String password) {
        // Implement your actual sign-in logic here
        // You might check against a database or an authentication service
        // For this example, let's use hardcoded values
        return email.equals("user@example.com") && password.equals("password");
    }
}
