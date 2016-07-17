package com.example.nabihaiqbal.evoting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class code extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_code);
        setSupportActionBar(toolbar);
        ((TextView) findViewById(R.id.code_toolbar)).setText("ShafafVoting");

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(5000);

                } catch (InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent openStartingPoint = new Intent(code.this, Finger_verification.class);
                    startActivity(openStartingPoint);
                }
            }
        };
        timer.start();



    }

}
