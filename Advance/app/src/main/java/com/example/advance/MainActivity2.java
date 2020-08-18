package com.example.advance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView tv1;
//    Spannable s1;
//    AutoCompleteTextView actv;
//    String[] a={"JAVA","C++","C","PYTHON","ANDROID","SPRING","STRUTS","DJANGO"};
//    String s2="Hello Vamsi Welcome to Spannable";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1=findViewById(R.id.tv1);
//        s1=new SpannableString(s2);
//        s1.setSpan(new RelativeSizeSpan(2.5f),0,3,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        StyleSpan bold=new StyleSpan(Typeface.BOLD);
//        StyleSpan italic=new StyleSpan(Typeface.ITALIC);
//        StyleSpan bi=new StyleSpan(Typeface.BOLD_ITALIC);
//        UnderlineSpan under=new UnderlineSpan();
//        StrikethroughSpan sts=new StrikethroughSpan();
//        s1.setSpan(bold,3,7,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        s1.setSpan(italic,7,12,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        s1.setSpan(bi,12,17,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        s1.setSpan(under,17,22,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        s1.setSpan(sts,22,30,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        tv1.setText(s1);
//        actv=findViewById(R.id.actv);
//        ArrayAdapter<String> aa=new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,a);
//        actv.setThreshold(1);
//        actv.setAdapter(aa);
    }

    public void click(View view) {
        Intent n=new Intent(getApplicationContext(),MainActivity3.class);
        startActivity(n);
    }
}