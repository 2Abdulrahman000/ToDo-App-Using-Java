package com.example.mytasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class welcomeact extends AppCompatActivity {

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomeact);

        Runnable r = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), ListTasks.class);
                startActivity(intent);
            }
        };

        Handler handler = new Handler();
        handler.postDelayed(r, 3000);
    }

}