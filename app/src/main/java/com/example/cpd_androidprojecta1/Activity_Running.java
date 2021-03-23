package com.example.cpd_androidprojecta1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Running extends AppCompatActivity implements View.OnClickListener {
    private Button splashScreenButton;
    private Button loginScreenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__running);
        Button splashScreenButton = findViewById(R.id.splashScreenButton);
        Button loginScreenButton = findViewById(R.id.loginScreenButton);
        splashScreenButton.setOnClickListener(this);
        loginScreenButton.setOnClickListener(this);
    }


    public void openActivityLogin() {
        Intent intent = new Intent(this, Activity_Login.class);
        startActivity(intent);
    }

    public void openActivitySplashScreen(){
        Intent intent = new Intent(this, SplashActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.splashScreenButton:
                openActivitySplashScreen();
                break;
            case R.id.loginScreenButton:
                openActivityLogin();
                break;
            default:
                break;
        }
    }
}

/*
*  splashScreenButton = (Button) findViewById(R.id.splashScreenButton);
        loginScreenButton = (Button) findViewById(R.id.loginButton);
        splashScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityLogin();
            }
        });
        loginScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityLogin();
            }
        });*/
