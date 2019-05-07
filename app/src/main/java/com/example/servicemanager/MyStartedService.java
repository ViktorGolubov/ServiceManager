package com.example.servicemanager;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyStartedService extends Service {
    public MyStartedService() {
    }



    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("MyStartedService", "Service started!");
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Service.START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }
}
