package com.example.nabihaiqbal.evoting;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class final_vote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_vote);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_vote);
        setSupportActionBar(toolbar);
        ((TextView) findViewById(R.id.vote_toolbar)).setText("ShafafVoting");

        Button imgb =(Button)findViewById(R.id.button2);
        imgb.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
alertMessage();

            }
        });

    }
    public void alertMessage() {
        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) { switch (which) {

                case DialogInterface.BUTTON_POSITIVE:
                    // Yes button clicked

                    Toast.makeText(final_vote.this, "Your vote is save now",
                            Toast.LENGTH_LONG).show();
                    break;
                case DialogInterface.BUTTON_NEGATIVE: // No button clicked // do nothing
                    Intent openStarting = new Intent(final_vote.this, final_vote.class);
                    startActivity(openStarting);
                    // Toast.makeText(selection.this, "No Clicked", Toast.LENGTH_LONG).show();
                    break; } } };
        AlertDialog.Builder builder = new AlertDialog.Builder(this); builder.setMessage("Are you sure?") .setPositiveButton("Yes", dialogClickListener) .setNegativeButton("No", dialogClickListener).show(); }


}


