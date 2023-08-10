package com.example.mytasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv_task;
    EditText et_addtask;
    Button btn_task;
   // int state_edit=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "career", Toast.LENGTH_SHORT).show();
        et_addtask=findViewById(R.id.et_task);
        btn_task=findViewById(R.id.btn_add);
        lv_task=findViewById(R.id.lv_task);

        ArrayList<String> tasks=new ArrayList<>();
        tasks.add("Go To university");
        tasks.add("eat breakfast");
        tasks.add("Watching TV");

        MyAdapter myAdapter=new MyAdapter(this,R.layout.custom_task_layout,tasks);
        lv_task.setAdapter(myAdapter);


        btn_task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myAdapter.add(et_addtask.getText().toString());
                myAdapter.notifyDataSetChanged();
            }
        });


    }
}