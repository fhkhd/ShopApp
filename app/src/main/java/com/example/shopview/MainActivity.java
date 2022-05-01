package com.example.shopview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.shopview.activity.HomeActivity;

public class MainActivity extends AppCompatActivity {

    private TextView enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enter = findViewById(R.id.enter_app);
        enter.setOnClickListener(view -> {
            Intent intent =new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
        });
    }
}