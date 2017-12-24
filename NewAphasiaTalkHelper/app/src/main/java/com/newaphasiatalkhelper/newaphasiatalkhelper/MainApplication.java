package com.newaphasiatalkhelper.newaphasiatalkhelper;

import android.app.Application;
import android.content.Context;

import com.newaphasiatalkhelper.newaphasiatalkhelper.helper.Speaker;

/**
 * Created by blinkblinkk on 9/17/2017 AD.
 */

public class MainApplication extends Application {

    public static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
}
