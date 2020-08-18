package com.example.advance;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity3 extends AppCompatActivity {
    ImageSwitcher img;
    Button previous,next;
    int[] i={R.drawable.destination_1,R.drawable.destination_2,R.drawable.destination_3};
    int size=i.length;
    int count=-1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        img=findViewById(R.id.img);
        previous=findViewById(R.id.previous);
        next=findViewById(R.id.next);
        img.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView image=new ImageView(getApplicationContext());
                image.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.FILL_PARENT,ActionBar.LayoutParams.FILL_PARENT));
                image.setScaleType(ImageView.ScaleType.FIT_CENTER);
                image.setImageResource(R.drawable.destination_1);
                return img;
            }
        });

        Animation amiout= AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
        Animation aniIn = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);

        img.setOutAnimation(amiout);
        img.setInAnimation(aniIn);

    }

    public void next(View view) {
        count++;
        if (count==size){
            count=0;
        }
        img.setImageResource(i[count]);
    }

    public void previous(View view) {
        count=size-1;
        count--;
        if (count==0){
            count=0;
        }
        img.setImageResource(i[count]);
    }
}