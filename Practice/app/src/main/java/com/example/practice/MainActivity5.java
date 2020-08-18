package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    ListView lv;
    String[] prog={"C","C++","C#","JAVA","PYTHON","SCALA","PHP",".NET","HTML","CSS","BOOTSTARP","JAVASCRIPT","GO","ABC"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        lv=findViewById(R.id.lv);
        ArrayAdapter<String> AA=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,prog);
        lv.setAdapter(AA);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String lower=prog[i].toLowerCase();
                Toast.makeText(MainActivity5.this, "You Clicked On    "+lower, Toast.LENGTH_SHORT).show();
            }
        });

    }
}