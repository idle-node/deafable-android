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

    String[] pages = {"phonenumber", "splashscreen","onboarding","bridge","login", "signup", "home", "voicehelp", "railways", "stationdetail", "trainschedule", "guideme", "search", "facility", "profil", "changepassword"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.activity_listview, pages);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent myIntent;
                switch (pages[i]) {
                    case "splashscreen":
                        myIntent = new Intent(MainActivity.this, SplashScreenActivity.class);
                        MainActivity.this.startActivity(myIntent);
                        break;
                    case "onboarding":
                        myIntent = new Intent(MainActivity.this, OnboardingActivity.class);
                        MainActivity.this.startActivity(myIntent);
                        break;
                    case "bridge":
                        myIntent = new Intent(MainActivity.this, BridgeActivity.class);
                        MainActivity.this.startActivity(myIntent);
                        break;
                    case "login":
                        myIntent = new Intent(MainActivity.this, LoginActivity.class);
                        MainActivity.this.startActivity(myIntent);
                        break;
                    case "signup":
                        myIntent = new Intent(MainActivity.this, SignupActivity.class);
                        MainActivity.this.startActivity(myIntent);
                        break;
                    case "home":
                        myIntent = new Intent(MainActivity.this, HomeActivity.class);
                        MainActivity.this.startActivity(myIntent);
                        break;
                    case "voicehelp":
                        myIntent = new Intent(MainActivity.this, VoiceHelpActivity.class);
                        MainActivity.this.startActivity(myIntent);
                        break;
                    case "phonenumber":
                        myIntent = new Intent(MainActivity.this, phonenumberActivity.class);
                        MainActivity.this.startActivity(myIntent);
                        break;
                }
            }
        });
    }
}