package com.example.android.mylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class JokeDisplayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lib_activity_main);
        String joke = getIntent().getStringExtra(Intent.EXTRA_TEXT);

        TextView jokeTextView = (TextView) findViewById(R.id.joke_text_view);
        if (joke != null) {
            jokeTextView.setText(joke);
        }
    }
}
