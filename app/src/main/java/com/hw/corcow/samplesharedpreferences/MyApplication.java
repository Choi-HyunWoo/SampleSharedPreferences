package com.hw.corcow.samplesharedpreferences;

import android.app.Application;
import android.content.Context;

/**
 * Created by Tacademy on 2015-10-21.
 */
public class MyApplication extends Application {
    // Manager에서 Context가 필요한경우 MyApplication 클래스를 만들어 getContext()를 제공
    // Application 클래스를 상속받은 MyApplication 클래스를 만들어 사용할 경우 Manifest에서 등록해주자.

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getContext() {
        return mContext;
    }
}
