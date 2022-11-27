package com.xiaoyingbo.lib_util.BSY.util;

import android.widget.Toast;

import androidx.annotation.StringRes;

public class BSYToastUtils {
    public static void showLongToast(String msg) {
        Toast.makeText(BSYUtils.getApp().getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }

    public static void showLongToast(@StringRes int msgId) {
        Toast.makeText(BSYUtils.getApp().getApplicationContext(), msgId, Toast.LENGTH_LONG).show();
    }

    public static void showShortToast(String msg) {
        Toast.makeText(BSYUtils.getApp().getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }

    public static void showShortToast(@StringRes int msgId) {
        Toast.makeText(BSYUtils.getApp().getApplicationContext(), msgId, Toast.LENGTH_SHORT).show();
    }
}
