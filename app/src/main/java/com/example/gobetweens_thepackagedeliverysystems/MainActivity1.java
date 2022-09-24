package com.example.gobetweens_thepackagedeliverysystems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(7000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent login = new Intent(MainActivity1.this, MainActivity.class);
                    startActivity(login);
                }
            }
        };
thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
