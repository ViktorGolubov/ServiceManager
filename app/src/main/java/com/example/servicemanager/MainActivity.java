package com.example.servicemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnStartedService = findViewById(R.id.activity_main__btn__started_service);
        btnStartedService.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_main__btn__started_service:
                Intent serviceIntent = new Intent(this, MyStartedService.class);
                serviceIntent.putExtra("dummyKey", 23);
                startService(serviceIntent);
                break;
                default:
                    Log.w("MainActivity", "View unknown");
        }
    }
}
