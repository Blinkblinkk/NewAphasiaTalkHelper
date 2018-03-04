package com.newaphasiatalkhelper.newaphasiatalkhelper.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.newaphasiatalkhelper.newaphasiatalkhelper.R;

public class UserHome extends BaseActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
        initToolbar();
        hideUserProfileIcon();
    }
}
