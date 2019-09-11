package com.example.sample6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("message", "onCreate() has executed...");
        tvMessage = findViewById(R.id.myTv);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("message", "onStart() has executed...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("message", "onResume() has executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("message", "onPause() has executed...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("message", "onStop() has executed...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("message", "onDestroy() has executed...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("message", "onRestart() has executed...");
    }

    /*
    public void showMessage(View v){
        Toast toast = Toast.makeText(this, "Button was clicked...", Toast.LENGTH_LONG);
        toast.show();
    }
    */
    public void showMessage(View buton){
        Snackbar sbar = Snackbar.make(buton, "Button was clicked...", Snackbar.LENGTH_LONG);
        sbar.show();
    }
    /*
    public void showMessage(View buton){
        tvMessage.setText("Button was clicked...");
    }
    */
}