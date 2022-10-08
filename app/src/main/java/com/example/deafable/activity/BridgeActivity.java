package com.example.deafable.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.deafable.R;

public class BridgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge);

        Button btnLogin = (Button) findViewById(R.id.deafablebtn); //tombol login di bridge
        btnLogin.setOnClickListener(v -> startActivity(new Intent(BridgeActivity.this, LoginActivity.class)));

        Button btnVoiceHelp = (Button) findViewById(R.id.bantuanbtn); //tombol bantuan suara di bridge
        btnVoiceHelp.setOnClickListener(v -> startActivity(new Intent(BridgeActivity.this, VoiceHelpActivity.class)));

    }
}