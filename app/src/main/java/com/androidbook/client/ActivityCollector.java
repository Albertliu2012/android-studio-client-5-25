package com.androidbook.client;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/*
                                _oo8oo_
                               o8888888o
                               88" . "88
                               (| -_- |)
                               0\  =  /0
                             ___/'==='\___
                           .' \\|     |// '.
                          / \\|||  :  |||// \
                         / _||||| -:- |||||_ \
                        |   | \\\  -  /// |   |
                        | \_|  ''\---/''  |_/ |
                        \  .-\__  '-'  __/-.  /
                      ___'. .'  /--.--\  '. .'___
                   ."" '<  '.___\_<|>_/___.'  >' "".
                  | | :  `- \`.:`\ _ /`:.`/ -`  : | |
                  \  \ `-.   \_ __\ /__ _/   .-` /  /
              =====`-.____`.___ \_____/ ___.`____.-`=====
                                `=---=`
/**
* @time 2019/5/23 22:49 
* @version 1.00
* @author XingChen
*/
public class ActivityCollector {

    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public static void finishAll(){
        for (Activity activity : activities){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
        activities.clear();
    }
}
