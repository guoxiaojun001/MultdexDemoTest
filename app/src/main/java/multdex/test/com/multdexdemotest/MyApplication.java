package multdex.test.com.multdexdemotest;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by HP on 2017/8/15.
 */

//如果没有在manifest配置 android:name="android.support.multidex.MultiDexApplication"
public class MyApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        MultiDex.install(this);
    }
}
