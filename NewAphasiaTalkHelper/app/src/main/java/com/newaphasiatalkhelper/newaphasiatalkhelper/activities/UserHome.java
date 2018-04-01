package com.newaphasiatalkhelper.newaphasiatalkhelper.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import com.newaphasiatalkhelper.newaphasiatalkhelper.R;
import com.newaphasiatalkhelper.newaphasiatalkhelper.models.FirebaseModel;

public class UserHome extends BaseActivity {
    FirebaseModel fb;
    Spinner symptom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        fb = new FirebaseModel(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
        initToolbar();
        hideUserProfileIcon();
        fb.userhomeActivity();
        symptom = (Spinner) findViewById(R.id.symptom);
    }
}
