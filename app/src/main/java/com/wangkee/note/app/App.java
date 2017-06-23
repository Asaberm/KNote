package com.wangkee.note.app;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;

/**
 * Created by XhinLiang on 2017/5/13.
 * xhinliang@gmail.com
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AVOSCloud.initialize(this, "GlLX7QbDRieTSw3tDC7DkjcC-gzGzoHsz", "JEClt6OQpT7SeT47qcjagQBc");
    }
}
