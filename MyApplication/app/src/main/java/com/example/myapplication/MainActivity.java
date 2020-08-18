package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void next(View view){
        EditText name=findViewById(R.id.name);
        String v=name.getText().toString();
        Intent i=new Intent(this,MainActivity2.class);
        i.putExtra("key",v);
        startActivity(i);
    }


}