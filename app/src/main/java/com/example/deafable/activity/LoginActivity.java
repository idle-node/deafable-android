package com.example.deafable.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.deafable.R;
import com.google.android.material.snackbar.Snackbar;

public class LoginActivity extends AppCompatActivity {
    private View parent_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        parent_view = findViewById(android.R.id.content);

        ((View) findViewById(R.id.forgot_password)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(parent_view, "Forgot Password", Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}