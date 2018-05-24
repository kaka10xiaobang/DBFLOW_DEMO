package com.kaka.dbflowdemo;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化DBFLOW
        FlowManager.init(this);
    }
}
