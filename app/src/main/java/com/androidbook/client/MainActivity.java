package com.androidbook.client;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {
    private LoginLogoutBroaCast loginLogoutBroaCast;
    private IntentFilter intentFilter;
    private LocalBroadcastManager localBroadcastManager;
    private LocalReceiver localReceiver;
    private static final String TAG = "MainActivity";

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: ");
        //localBroadcastManager.unregisterReceiver(localReceiver);
//        unregisterReceiver(loginLogoutBroaCast);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button forceOffline = (Button)findViewById(R.id.force_offline);
        forceOffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.broadcastpractice.FORCE_OFFLINE");
                sendBroadcast(intent);
            }
        });
//        localBroadcastManager = LocalBroadcastManager.getInstance(this);
//        Log.e(TAG, "onCreate: " );
////        intentFilter = new IntentFilter();
////        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
//        loginLogoutBroaCast = new LoginLogoutBroaCast();
////        registerReceiver(loginLogoutBroaCast,intentFilter);
//        Button button = (Button)findViewById(R.id.button);
//        Button localbutton = (Button)findViewById(R.id.localbutton);
//        localbutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent("com.exmaple.broadcast.LOCAL_BROADCAST");
//                localBroadcastManager.sendBroadcast(intent);
//            }
//        });
//        intentFilter = new IntentFilter();
//        intentFilter.addAction("com.exmaple.broadcast.LOCAL_BROADCAST");
//        localReceiver = new LocalReceiver();
//        localBroadcastManager.registerReceiver(localReceiver,intentFilter);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.e(TAG, "onClick: ");
//                Intent intent = new Intent();
//                intent.setAction("com.example.broadcast.MY_BROADCAST");
////                sendBroadcast(intent); //标准广播
//                sendOrderedBroadcast(intent,null); //有序广播
//            }
//        });
    }
}
