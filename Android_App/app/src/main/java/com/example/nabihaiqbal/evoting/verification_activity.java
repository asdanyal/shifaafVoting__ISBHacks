package com.example.nabihaiqbal.evoting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class verification_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_activity);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_verification);
        setSupportActionBar(toolbar);
        ((TextView) findViewById(R.id.verification_toolbar)).setText("ShafafVoting");

        ImageButton imgb =(ImageButton)findViewById(R.id.imageButton1);
        imgb.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent openStartingPoint = new Intent(verification_activity.this,selection.class);
                startActivity(openStartingPoint);
            }
        });

    }

}
