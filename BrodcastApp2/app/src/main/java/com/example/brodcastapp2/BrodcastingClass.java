package com.example.brodcastapp2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BrodcastingClass extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Signal from App 1", Toast.LENGTH_SHORT).show();
    }
}
