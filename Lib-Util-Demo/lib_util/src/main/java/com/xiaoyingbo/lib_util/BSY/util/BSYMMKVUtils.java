package com.xiaoyingbo.lib_util.BSY.util;

import android.content.Context;

import com.tencent.mmkv.MMKV;

public class BSYMMKVUtils {
    public static BSYMMKVUtils INSTANCE;
    /**MMKV实例*/
    private MMKV mKv;

    private BSYMMKVUtils(){
    }

    public static BSYMMKVUtils getInstance(){
        if(INSTANCE==null){
            synchronized (BSYMMKVUtils.class){
                if(INSTANCE==null){
                    INSTANCE=new BSYMMKVUtils();
                }
            }
        }
        return INSTANCE;
    }

    /**
     * app启动时初始化MMKV:默认根路径
     * @param context 通过context初始化MMKV
     * @return MMKV根目录*/
    public String init(Context context){
        String rootDir=MMKV.initialize(context);
        mKv = MMKV.defaultMMKV();
        return rootDir;
    }

    /**推入boolean值*/
    public void putBoolean(String key,boolean value){
        mKv.decodeBool(key,value);
    }

    /**获取boolean值*/
    public boolean getBoolean(String key,boolean defValue){
        return mKv.getBoolean(key,defValue);
    }


    /**推入String值*/
    public void putString(String key,String value){
        mKv.decodeString(key,value);
    }

    /**获取String值*/
    public String getString(String key,String defValue){
        return mKv.getString(key,defValue);
    }


}
