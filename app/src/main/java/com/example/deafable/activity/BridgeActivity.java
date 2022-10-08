package com.example.deafable.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.deafable.R;

public class BridgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge);

        Button btnLogin = (Button) findViewById(R.id.deafablebtn);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(BridgeActivity.this, LoginActivity.class));
            }
        });

        Button btnVoiceHelp = (Button) findViewById(R.id.bantuanbtn);
        btnVoiceHelp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(BridgeActivity.this, VoiceHelpActivity.class));
            }
        });


    }
}