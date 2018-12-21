package com.zhangl.x5_web;

import android.app.Application;
import android.util.Log;

import com.tencent.smtt.sdk.QbSdk;

/**
 * Created by zhangl on 2018/12/21.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        QbSdk.PreInitCallback cb = new QbSdk.PreInitCallback() {
            @Override
            public void onCoreInitFinished() {
                Log.d("app", " onViewInitFinished is " );

            }

            @Override
            public void onViewInitFinished(boolean b) {
                Log.d("app", " onViewInitFinished is " );
            }
        };

        //x5内核初始化接口
        QbSdk.initX5Environment(getApplicationContext(),  cb);
    }
}
