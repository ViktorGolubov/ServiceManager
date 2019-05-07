package com.example.servicemanager;

import android.app.Service;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import java.util.Random;

public class MyBoundService extends Service {

    private String TAG = "Test Service";

    private IBinder iBinder = new Binder();

    public MyBoundService() {
    }

    public MyBoundService(IBinder iBinder) {
        this.iBinder = iBinder;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("MyBoundService", "Bound service created");
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d("MyBoundService", "onBind called");
        return iBinder;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return false;
    }

    public int getInfoFromService() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(100);
    }
}
