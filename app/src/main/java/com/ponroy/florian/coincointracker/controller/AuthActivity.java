package com.ponroy.florian.coincointracker.controller;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ponroy.florian.coincointracker.R;

public class AuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
    }

    public String getUserToken() {
        SharedPreferences prefs = getSharedPreferences("UserToken", MODE_PRIVATE);

        // Fetches the token, does a lot of things, then...
        return "IncredibleToken";
    }
}
