package com.xiaoyingbo.lib_util.BSY.util;

import android.content.Context;

import com.tencent.mmkv.MMKV;

public class BSYMMKVUtils {
    /**MMKV实例*/
    private static volatile MMKV mKv;

    /**
     * app启动时初始化MMKV:默认根路径
     * @param context 通过context初始化MMKV
     * @return MMKV根目录*/
    public static String init(Context context){
        String rootDir=MMKV.initialize(context);
        mKv = MMKV.defaultMMKV();
        return rootDir;
    }

    /**推入boolean值*/
    public static void putBoolean(String key,boolean value){
        mKv.decodeBool(key,value);
    }

    /**获取boolean值*/
    public static boolean getBoolean(String key,boolean defValue){
        return mKv.getBoolean(key,defValue);
    }


    /**推入String值*/
    public static void putString(String key,String value){
        mKv.decodeString(key,value);
    }

    /**获取String值*/
    public static String getString(String key,String defValue){
        return mKv.getString(key,defValue);
    }
}
