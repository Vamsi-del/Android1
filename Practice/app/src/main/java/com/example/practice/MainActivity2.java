package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity2 extends AppCompatActivity {
    ToggleButton tg1,tg2;
    Button submit;
    StringBuilder result;
    CheckBox cb1,cb2,cb3;
    float total;
    RadioGroup rg;
    RadioButton rb1,rb2,rb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tg1=findViewById(R.id.tg1);
        tg2=findViewById(R.id.tg2);
        submit=findViewById(R.id.btn);
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        rg=findViewById(R.id.rg);
        String sum= getIntent().getStringExtra("key");
        Toast t=Toast.makeText(this, ""+sum, Toast.LENGTH_SHORT);
        t.setMargin(50,50);
        t.show();

    }
    public void submit(View view){
        result=new StringBuilder();
        result.append("Toggle1:").append(tg1.getText().toString());
        result.append("Toggle2:").append(tg2.getText().toString());
        String s2=tg1.getText().toString();
        String s4=tg2.getText().toString();
        String s3="on";
        int id=rg.getCheckedRadioButtonId();
        rb=findViewById(id);
        if (id==-1){
            Toast.makeText(this, "Nothing is selected", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "You Selected "+rb.getText().toString(), Toast.LENGTH_SHORT).show();
        }
        while (true) {
            total=0;
            if (s3.equals(s2) & s3.equals(s4)) {
                Toast.makeText(this, "Both Toggles are:" + s3 + "\n", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Toggle1 is" + s2 + "\n Toggle2 is:" + s4, Toast.LENGTH_SHORT).show();
            }
            if (cb1.isChecked()) {
                total += 12000.00f;
            } else {
                total = 0;
            }
            if (cb2.isChecked()) {
                total += 15000.00f;
            } else {
                total += 0;
            }
            if (cb3.isChecked()) {
                total += 20000.00f;
                break;
            } else {
                total += 0;
                break;
            }
        }
        Toast.makeText(this, "Total Amount payable :"+total, Toast.LENGTH_LONG).show();
        Intent it=new Intent(this,MainActivity3.class);
        startActivity(it);
    }
}