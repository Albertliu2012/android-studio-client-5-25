package com.androidbook.client;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class LocalReceiver extends BroadcastReceiver {
    private static final String TAG = "LocalReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
//        throw new UnsupportedOperationException("Not yet implemented");
        Log.e(TAG, "onReceive: ");
        Toast.makeText(context, "received local broadcast", Toast.LENGTH_SHORT).show();
    }
}
