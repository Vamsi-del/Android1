package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.DatePicker;
import android.widget.DigitalClock;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    DatePicker date;
    TimePicker time;
    AnalogClock ac;
    DigitalClock dc;
    TextView text;
    ProgressDialog pg;
    private int status = 0;
    private Handler handler = new Handler();
    private long fileSize = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        date = findViewById(R.id.date);
        text = findViewById(R.id.text);
        time = findViewById(R.id.time);
        ac = findViewById(R.id.ac);
        dc = findViewById(R.id.dc);
    }

    public void change(View view) {

        StringBuilder s = new StringBuilder();
        s.append(date.getDayOfMonth() + "-");
        s.append(date.getMonth() + "-");
        s.append(date.getYear() + ":");
        s.append(time.getCurrentHour() + ":");
        s.append(time.getCurrentMinute() + ":");
        text.setText(s.toString());
        Toast.makeText(this, "" + s.toString(), Toast.LENGTH_SHORT).show();
        pg = new ProgressDialog(view.getContext());
        pg.setCancelable(true);
        pg.setMessage("File downloading ...");
        pg.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pg.setProgress(0);
        pg.setMax(200);
        pg.show();
        //reset progress bar and filesize status
        status = 0;
        fileSize = 0;
        new Thread(new Runnable() {
            public void run() {
                while (status < 100) {
                    // performing operation
                    status = doOperation();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // Updating the progress bar
                    handler.post(new Runnable() {
                        public void run() {
                            pg.setProgress(status);
                        }
                    });
                }
                // performing operation if file is downloaded,
                if (status >= 100) {
                    // sleeping for 1 second after operation completed
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // close the progress bar dialog
                    pg.dismiss();
                }
            }
        }).start();
        Intent m=new Intent(this,MainActivity5.class);
        startActivity(m);
    }
    public int doOperation() {
        //The range of ProgressDialog starts from 0 to 10000
        while (fileSize <= 10000) {
            fileSize+=1000;
            if (fileSize == 1000) {
                return 10;
            } else if (fileSize == 2000) {
                return 20;
            } else if (fileSize == 3000) {
                return 30;
            } else if (fileSize == 4000) {
                return 40; // you can add more else if
            }
         /* else {
                return 100;
            }*/
        }//end of while
        return 100;

//    }

    }
}