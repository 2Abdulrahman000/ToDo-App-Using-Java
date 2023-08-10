package com.example.mytasks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    Context context;
    int resource;
    ArrayList<String> task=new ArrayList<>();

    public MyAdapter (Context c,int r, ArrayList<String> t)
    {
        this.context=c;
        this.resource=r;
        this.task=t;
    }

    public void add(String item)
    {
        task.add(item);
    }
    public void edit(int i,String edit_item)
    {
        task.set(i,edit_item);
    }

    @Override
    public int getCount() {
        return task.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;

        if(v==null)
        {
            v= LayoutInflater.from(context).inflate(resource,null,false);
        }

        TextView tv_task=v.findViewById(R.id.tv_task);
        CheckBox cb_task=v.findViewById(R.id.cb_checked);

        tv_task.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tv_task.setVisibility(View.GONE);
                cb_task.setVisibility(View.GONE);
                return true;
            }
        });
        String item=task.get(position);
        tv_task.setText(item);
        return v;
    }
}
