package com.example.testapp;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;

public class Utils {
    public static void statusBarColor1(Activity activity){
        if (Build.VERSION.SDK_INT >Build.VERSION_CODES.KITKAT) {
            Window window = activity.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(activity.getResources().getColor(R.color.colorAccent));
        }
    }
}
