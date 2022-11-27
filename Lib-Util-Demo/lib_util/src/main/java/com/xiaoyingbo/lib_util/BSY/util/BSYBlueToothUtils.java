package com.xiaoyingbo.lib_util.BSY.util;

/**操作蓝牙使用的工具类*/
public class BSYBlueToothUtils {

    private volatile static BSYBlueToothUtils instance;

    private BSYBlueToothUtils() {
    }

    public static BSYBlueToothUtils getInstance() {
        if (instance == null) {
            synchronized (BSYBlueToothUtils.class) {
                if (instance == null) {
                    instance = new BSYBlueToothUtils();
                }
            }
        }
        return instance;
    }
}
