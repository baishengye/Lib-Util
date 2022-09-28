package com.xiaoyingbo.lib_util;

import android.Manifest;
import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**操作蓝牙使用的工具类*/
public class BlueToothUtils {

    private volatile static BlueToothUtils instance;

    private BlueToothUtils() {
    }

    public static BlueToothUtils getInstance() {
        if (instance == null) {
            synchronized (BlueToothUtils.class) {
                if (instance == null) {
                    instance = new BlueToothUtils();
                }
            }
        }
        return instance;
    }
}
