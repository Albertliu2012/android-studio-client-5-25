package com.androidbook.client;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.Toast;

import java.sql.Connection;

public class LoginLogoutBroaCast extends BroadcastReceiver {
    private String BROADCAST_LOGIN = "login";
    private String BROADCAST_LOGOUT="logout";
    private static final String TAG = "LoginLogoutBroaCast";
    Throwable tr;
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        tr = new Throwable();


        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isAvailable()){
            Log.e(TAG, "onReceive: ",tr);
            Toast.makeText(context, "network is Available", Toast.LENGTH_SHORT).show();
        }else{
            Log.e(TAG, "onReceive: ",tr);
            Toast.makeText(context, "network is Unavailable", Toast.LENGTH_SHORT).show();
        }

//        if ( intent.getAction().equals(BROADCAST_LOGIN)){
//            Toast.makeText(context, context.getText(R.string.login), Toast.LENGTH_SHORT).show();
//            SharedPreferences sharedPreferences = ((ClientApplication)context.getApplicationContext()).getLoginUserInfo();
//            Editor editor = sharedPreferences.edit();
//            editor.putInt(RequestParam.STAUTS,RequestParam.ONLINE);
//            editor.commit();
//            return ;
//        }

//        if (intent.getAction().equals(BROADCAST_LOGOUT)){
//            Toast.makeText(context, context.getText(R.string.menu_logout), Toast.LENGTH_SHORT).show();
//        }
//        throw new UnsupportedOperationException("Not yet implemented");
    }
}
