package com.example.deafable.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.deafable.R;

public class MainActivity extends AppCompatActivity {

    String[] mobileArray = {"onboarding","login"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.activity_listview, mobileArray);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent myIntent;
                switch (i) {
                    case 0:
                        myIntent = new Intent(MainActivity.this, OnboardingActivity.class);
                        MainActivity.this.startActivity(myIntent);
                        break;
                    case 1:
                        myIntent = new Intent(MainActivity.this, LoginActivity.class);
                        MainActivity.this.startActivity(myIntent);
                        break;
                }
            }
        });
    }
}