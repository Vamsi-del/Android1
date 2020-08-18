package com.example.advance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Size;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Spannable s;
    String s1="Hello";
    String s2="World";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
        s=new SpannableString(s1+s2);
        s.setSpan(new ForegroundColorSpan(Color.RED),0,s1.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        s.setSpan(new ForegroundColorSpan(Color.GRAY),s1.length(),s1.length()+s2.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv.setText(s);
        Intent i= new Intent(this,MainActivity2.class);
        startActivity(i);
    }
}