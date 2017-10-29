package com.newaphasiatalkhelper.newaphasiatalkhelper.activities;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.newaphasiatalkhelper.newaphasiatalkhelper.R;

/**
 * Created by Tum on 10/29/2017 AD.
 */
//Create Toolbar

public class BaseActivity extends AppCompatActivity {
    protected Toolbar toolbar;
    public void initToolbar(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

    }
}
