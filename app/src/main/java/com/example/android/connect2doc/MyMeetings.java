package com.example.android.connect2doc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MyMeetings extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mymeetings);

        TextView infoo =  findViewById(R.id.infoo);
        Intent i = getIntent();
        String str = i.getStringExtra("info");
        infoo.setText(str);

    }
}

