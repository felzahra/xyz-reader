package com.example.xyzreader;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by rigel on 7/22/17.
 */

public class XyzApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if(BuildConfig.DEBUG)
            Timber.plant(new Timber.DebugTree());
    }
}
