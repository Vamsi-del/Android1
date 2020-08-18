package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button toast,count;
    TextView inc;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast = findViewById(R.id.toast);
        count = findViewById(R.id.count);
        inc = findViewById(R.id.inc);
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i+=100;
                inc.setText(""+i);
            }
        });
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Welcome to Android", Toast.LENGTH_LONG).show();
            }
        });
    }
}