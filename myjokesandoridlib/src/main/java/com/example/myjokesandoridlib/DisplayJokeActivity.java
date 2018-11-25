package com.example.myjokesandoridlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        Intent i = this.getIntent();
        String gce_result = i.getStringExtra("result");
        TextView gce_result_show = findViewById(R.id.tv_joke);
        gce_result_show.setText(gce_result);
    }
}
