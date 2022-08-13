package com.example.deafable.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.deafable.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class SignupActivity extends AppCompatActivity {
    private View parent_view;
    private TextInputEditText ti_email;
    private TextInputEditText ti_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        parent_view = findViewById(android.R.id.content);
        ti_email = (TextInputEditText) findViewById(R.id.ti_email);
        ti_password = (TextInputEditText) findViewById(R.id.ti_password);

        Button btnSignup = (Button) findViewById(R.id.btn_signup);
        TextView tvLogin = (TextView) findViewById(R.id.login);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                SignupActivity.this.startActivity(intent);
            }
        });
    }
}