package com.warsfeil.nchkt.interactcom;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    static final String KEY_TEXT = "TextfromMain";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        (findViewById(R.id.btnNext)).setOnClickListener(v->intentNext());

    }

    protected void intentNext() {
        // Bundle
        Intent launchNext = new Intent(this, NextActivity.class);

        Bundle bundle = new Bundle();
        bundle.putString(KEY_TEXT, ((TextView)findViewById(R.id.edtText)).getText().toString());
        launchNext.putExtras(bundle);
        startActivity(launchNext);

    }

}
