package com.example.nabihaiqbal.evoting;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_selection);
        setSupportActionBar(toolbar);
        ((TextView) findViewById(R.id.selection_toolbar)).setText("ShafafVoting");

        ImageButton img =(ImageButton)findViewById(R.id.imageButton);
        img.setOnClickListener(new View.OnClickListener() {

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
                    Intent openStartingPoint = new Intent(selection.this, final_vote.class);
                    startActivity(openStartingPoint);
               // Toast.makeText(selection.this, "Yes Clicked",
                        //Toast.LENGTH_LONG).show();
                        break;
                case DialogInterface.BUTTON_NEGATIVE: // No button clicked // do nothing
                    Intent openStarting = new Intent(selection.this, selection.class);
                    startActivity(openStarting);
               // Toast.makeText(selection.this, "No Clicked", Toast.LENGTH_LONG).show();
               break; } } };
        AlertDialog.Builder builder = new AlertDialog.Builder(this); builder.setMessage("Are you sure?") .setPositiveButton("Yes", dialogClickListener) .setNegativeButton("No", dialogClickListener).show(); }


            }
