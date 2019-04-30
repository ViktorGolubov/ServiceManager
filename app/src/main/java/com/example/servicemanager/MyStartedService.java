package com.example.servicemanager;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyStartedService extends Service {
    public MyStartedService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
