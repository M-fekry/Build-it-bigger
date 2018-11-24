package com.example.jokesandroidlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        Intent i = this.getIntent();

        String gce_result = this.getIntent().getStringExtra("gce_result");
        TextView gce_result_show = findViewById(R.id.tv_joke);
        gce_result_show.setText(gce_result);
    }
}
