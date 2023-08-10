package com.example.mytasks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Toast;

public class ListTasks extends AppCompatActivity {
    // variable in scope class
    CardView cv_career;
    CardView cv_social;
    CardView cv_pray;
    CardView cv_close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_tasks);

        //inflate xml element
        cv_career=findViewById(R.id.cv_career);
        cv_social=findViewById(R.id.cv_Social);
        cv_pray=findViewById(R.id.cv_pray);
        cv_close=findViewById(R.id.cv_close);

        //click on career card
        cv_career.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent1);
            }
        });

        //click on Social card
        cv_social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(getApplicationContext(),social.class);
                startActivity(intent2);
            }
        });

        //click on pray card
        cv_pray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(getApplicationContext(),pray.class);
                startActivity(intent3);
            }
        });

        //click on close card
        cv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                finish();
           //    finish();
            }
        });
    }
}