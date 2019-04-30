package com.example.servicemanager;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyStartedService extends Service {

    public MyStartedService() {

    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int starId) {
        Log.d("MystartService", "Service started");
        return Service.START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
       return null;
    }
}
