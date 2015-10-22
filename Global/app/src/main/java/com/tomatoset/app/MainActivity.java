package com.tomatoset.app;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import tomatoset.com.global.R;


public class MainActivity extends Activity {

    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        initToolbar();
    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
    }
}
