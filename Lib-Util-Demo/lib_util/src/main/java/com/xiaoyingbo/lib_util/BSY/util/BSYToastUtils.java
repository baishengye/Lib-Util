package com.xiaoyingbo.lib_util.BSY.util;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import androidx.annotation.StringRes;

import com.hjq.toast.ToastUtils;
import com.hjq.toast.config.IToastStrategy;
import com.hjq.toast.config.IToastStyle;

public class BSYToastUtils {
    public static void init(Application application) {
        ToastUtils.init(application);
    }

    public static void init(Application application, IToastStrategy strategy) {
        ToastUtils.init(application,strategy);
    }

    public static void init(Application application, IToastStyle<?> style) {
        ToastUtils.init(application,style);
    }

    public static void init(Application application, IToastStrategy strategy, IToastStyle<?> style) {
        ToastUtils.init(application, strategy, style);
    }


    public static void showLongToast(String msg) {
        ToastUtils.showLong(msg);
    }

    public static void showLongToast(@StringRes int msgId) {
        ToastUtils.showLong(msgId);
    }

    public static void showShortToast(String msg) {
        ToastUtils.show(msg);
    }

    public static void showShortToast(@StringRes int msgId) {
        ToastUtils.show(msgId);
    }

    public static void showDelayToast(String msg,long delayMillis) {
        ToastUtils.delayedShow(msg,delayMillis);
    }

    public static void showDelayToast(@StringRes int msgId,long delayMillis) {
        ToastUtils.delayedShow(msgId,delayMillis);
    }

    public static void showDebugToast(String msg) {
        ToastUtils.debugShow(msg);
    }

    public static void showDebugToast(@StringRes int msgId) {
        ToastUtils.debugShow(msgId);
    }
}
