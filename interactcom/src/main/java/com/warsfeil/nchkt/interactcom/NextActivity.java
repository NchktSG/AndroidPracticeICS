package com.warsfeil.nchkt.interactcom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent parentIntent = getIntent();
        Bundle inBundle = parentIntent.getExtras();
        //toast display original text for debugging
        Toast.makeText(this,inBundle.getString(MainActivity.KEY_TEXT),Toast.LENGTH_SHORT).show();



        //setting edit text to string from main after processing
        ((EditText)findViewById(R.id.DisplayText)).setText((inBundle.getString(MainActivity.KEY_TEXT)).toUpperCase());
    }
}
