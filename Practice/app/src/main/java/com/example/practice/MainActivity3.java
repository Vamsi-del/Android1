package com.example.practice;


import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

public class MainActivity3 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Button btn;
    AlertDialog.Builder builder;
    Spinner spin1;
    RatingBar rb;
//    WebView web;
    SeekBar seek;
    String[] lang={"C","C++","C#","JAVA","PYTHON","ANDROID DEVELOPMENT"};
    String[] country={"","India","USA","China"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toast.makeText(this, "welcome to new page", Toast.LENGTH_SHORT).show();
        btn=findViewById(R.id.btn);
        builder=new AlertDialog.Builder(this);
        spin1=findViewById(R.id.spin);
        rb=findViewById(R.id.rb);
//        web=findViewById(R.id.web);
        seek=findViewById(R.id.seek);
        ArrayAdapter<String> aa=new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,lang);
        AutoCompleteTextView actv=findViewById(R.id.actv);
        actv.setThreshold(0);
        actv.setAdapter(aa);
        spin1.setOnItemSelectedListener(this);
        ArrayAdapter<String> a1=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, country);
        a1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(a1);
    }
    public void close(View view){
        builder.setMessage(R.string.msg).setTitle(R.string.title);
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
                Toast.makeText(MainActivity3.this, "You choose to close the app", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
                Toast.makeText(MainActivity3.this, "you Choose no option", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alert= builder.create();
        alert.show();
        float rating=rb.getRating();
        Toast.makeText(this, ""+rating, Toast.LENGTH_SHORT).show();
//        web.loadUrl("Https://www.google.com");
        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Toast.makeText(MainActivity3.this, ""+i, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"seekbar touch started!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"seekbar touch stoped!", Toast.LENGTH_SHORT).show();
            }
        });
        Intent i=new Intent(this,MainActivity4.class);
        startActivity(i);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, ""+country[i], Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}