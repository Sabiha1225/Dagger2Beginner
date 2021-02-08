package com.example.daggertest;

import android.app.Application;

public class MyApplication extends Application {
    ApplicationComponent appComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerApplicationComponent.create();
    }
}
