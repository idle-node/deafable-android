package com.example.deafable.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.deafable.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    private View parent_view;
    private TextInputEditText ti_email;
    private TextInputEditText ti_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        parent_view = findViewById(android.R.id.content);
        ti_email = (TextInputEditText) findViewById(R.id.ti_email);
        ti_password = (TextInputEditText) findViewById(R.id.ti_password);

        Button btnLogin = (Button) findViewById(R.id.btn_signup);
        TextView tvSignup = (TextView) findViewById(R.id.sign_up);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        tvSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myitent = new Intent(LoginActivity.this, SignupActivity.class);
                LoginActivity.this.startActivity(myitent);

            }
        });

        ((View) findViewById(R.id.forgot_password)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(parent_view, "Forgot Password", Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}