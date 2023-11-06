package com.example.baituan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {
    private static final String STATE = "Trang thai";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(STATE, "onCreate");
    }
    public void openSecondActivity(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(STATE, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(STATE, "onStop");
    }
    @Override
    protected void onResume() {
        super.onResume();

        Log.e(STATE, "onResume");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e(STATE, "onDestroy");
    }
}