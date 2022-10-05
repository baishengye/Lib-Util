package com.xiaoyingbo.lib_util.BSY;

import android.widget.Toast;

public class BSYToastUtils {
    public static void showLongToast(String msg){
        Toast.makeText(BSYUtils.getApp().getApplicationContext(),msg,Toast.LENGTH_LONG).show();
    }

    public static void showLongToast(int msgId){
        Toast.makeText(BSYUtils.getApp().getApplicationContext(),msgId,Toast.LENGTH_LONG).show();
    }

    public static void showShortToast(String msg){
        Toast.makeText(BSYUtils.getApp().getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }

    public static void showShortToast(int msgId){
        Toast.makeText(BSYUtils.getApp().getApplicationContext(),msgId,Toast.LENGTH_SHORT).show();
    }
}
