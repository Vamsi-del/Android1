package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int[] img={R.drawable.des,R.drawable.dest,R.drawable.desti,R.drawable.destin,R.drawable.destina,
            R.drawable.destinat,R.drawable.destinati,R.drawable.destinatio,R.drawable.destination};
    ImageView iv;
    Button next,previous;
    int count=-1;
    int anti=img.length-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.iv);
        next=findViewById(R.id.next);
        previous=findViewById(R.id.previous);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count <= img.length-1) {
                    int i = img[count];
                    iv.setImageResource(i);
                }
                else {
                    count=0;
                    Toast.makeText(MainActivity.this, "You are the last of image", Toast.LENGTH_SHORT).show();
                }
            }
        });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                anti--;
                if (anti >= 0) {
                    int i = img[anti];
                    iv.setImageResource(i);
                }
                else {
                    anti=img.length-1;
                    Toast.makeText(MainActivity.this, "You are the last of image", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}