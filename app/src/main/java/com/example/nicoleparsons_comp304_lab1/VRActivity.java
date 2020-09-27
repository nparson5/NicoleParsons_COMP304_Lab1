package com.example.nicoleparsons_comp304_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class VRActivity extends AppCompatActivity {

    private TextView vr;

    private String lifecycle="VRActivity:\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_r);
        vr = findViewById(R.id.vrTextView);

        lifecycle +=getResources().getString(R.string.onCreate);
        vr.setText(lifecycle);

    }


    @Override
    protected void onStart() {
        super.onStart();
        lifecycle +=getResources().getString(R.string.onStart);
        vr.setText(lifecycle);
    }

    @Override
    protected void onStop() {
        super.onStop();
        lifecycle +=getResources().getString(R.string.onStop);
        vr.setText(lifecycle);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        lifecycle +=getResources().getString(R.string.onDestroy);
        vr.setText(lifecycle);
    }

    @Override
    protected void onPause() {
        super.onPause();
        lifecycle +=getResources().getString(R.string.onPause);
        vr.setText(lifecycle);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lifecycle +=getResources().getString(R.string.onResume);
        vr.setText(lifecycle);
    }
}