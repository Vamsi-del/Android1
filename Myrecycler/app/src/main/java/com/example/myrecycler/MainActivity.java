package com.example.myrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    String[] name={"alpha","beta","gamma","ravi","surya"};
    int[] img={R.drawable.destination,R.drawable.destinatio,R.drawable.destinati,R.drawable.destinat,R.drawable.destina};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.rv);
        MyAdaptar ma=new MyAdaptar(this,name,img);
        rv.setAdapter(ma);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}