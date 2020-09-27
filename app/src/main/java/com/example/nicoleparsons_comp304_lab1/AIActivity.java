package com.example.nicoleparsons_comp304_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AIActivity extends AppCompatActivity {

    private TextView ai;

    private String lifecycle="AIActivity:\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_i);
        ai = findViewById(R.id.aiTextview);

        lifecycle +=getResources().getString(R.string.onCreate);
        ai.setText(lifecycle);

    }


    @Override
    protected void onStart() {
        super.onStart();
        lifecycle +=getResources().getString(R.string.onStart);
        ai.setText(lifecycle);
    }

    @Override
    protected void onStop() {
        super.onStop();
        lifecycle +=getResources().getString(R.string.onStop);
        ai.setText(lifecycle);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        lifecycle +=getResources().getString(R.string.onDestroy);
        ai.setText(lifecycle);
    }

    @Override
    protected void onPause() {
        super.onPause();
        lifecycle +=getResources().getString(R.string.onPause);
        ai.setText(lifecycle);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lifecycle +=getResources().getString(R.string.onResume);
        ai.setText(lifecycle);
    }
}