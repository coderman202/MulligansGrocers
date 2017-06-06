package com.example.android.mulligansgrocers;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set the background image for the action bar
        final ActionBar actionBar = getSupportActionBar();

        Drawable bg;
        if (getResources().getConfiguration().orientation == 1) {
            bg = ResourcesCompat.getDrawable(getResources(), R.drawable.businesslarge, null);
        } else {
            bg = ResourcesCompat.getDrawable(getResources(), R.drawable.action_bar_background_landscape, null);

        }

        actionBar.setBackgroundDrawable(bg);
    }
}
