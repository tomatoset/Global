package com.tomatoset.app.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import tomatoset.com.global.R;


public class FilterActivity extends AppCompatActivity {

    private static final int LAYOUT =R.layout.filter_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppDefault);
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);
    }
}
