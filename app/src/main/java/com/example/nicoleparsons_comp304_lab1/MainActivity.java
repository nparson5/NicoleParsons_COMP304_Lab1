package com.example.nicoleparsons_comp304_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String lifecycle = "MainActivity:\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstFragment top = new FirstFragment();
        SecondFragment secondFragment = new SecondFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.firstFragment, top,"firstfragment").replace(R.id.secondFragment, secondFragment,"bottom").commit();

        lifecycle +=getResources().getString(R.string.onCreate);


        SecondFragment fragment = (SecondFragment) getSupportFragmentManager().findFragmentById(R.id.secondFragment);
        if (fragment!=null)
            fragment.update(lifecycle);


    }

    @Override
    protected void onStart() {
        super.onStart();
        lifecycle +=getResources().getString(R.string.onStart);

        SecondFragment fragment = (SecondFragment) getSupportFragmentManager().findFragmentByTag("bottom");
        if (fragment!=null)
            fragment.update(lifecycle);
    }

    @Override
    protected void onStop() {
        super.onStop();
        lifecycle +=getResources().getString(R.string.onStop);

        SecondFragment fragment = (SecondFragment) getSupportFragmentManager().findFragmentByTag("bottom");
        if (fragment!=null)
            fragment.update(lifecycle);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        lifecycle +=getResources().getString(R.string.onDestroy);

        SecondFragment fragment = (SecondFragment) getSupportFragmentManager().findFragmentByTag("bottom");
        if (fragment!=null)
            fragment.update(lifecycle);
    }

    @Override
    protected void onPause() {
        super.onPause();
        lifecycle +=getResources().getString(R.string.onPause);

        SecondFragment fragment = (SecondFragment) getSupportFragmentManager().findFragmentByTag("bottom");
        if (fragment!=null)
            fragment.update(lifecycle);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lifecycle +=getResources().getString(R.string.onResume);

        SecondFragment fragment = (SecondFragment) getSupportFragmentManager().findFragmentByTag("bottom");
        if (fragment!=null)
            fragment.update(lifecycle);
    }
}