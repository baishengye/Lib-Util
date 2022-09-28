package com.xiaoyingbo.lib_util;

import android.text.TextUtils;
import android.util.Log;

/**Log的工具类*/
public class LogUtils {
    public Boolean mIsDebug;

    private static volatile LogUtils instance;

    private LogUtils(boolean isDebug){
        this.mIsDebug=isDebug;
    }

    public static LogUtils getInstance(boolean isDebug){
        if(instance==null){
            synchronized (LogUtils.class){
                if(instance==null){
                    instance=new LogUtils(isDebug);
                }
            }
        }
        return instance;
    }

    /**debug的日志*/
    public void d(String tag,String msg,Throwable t){
        if(!mIsDebug) return;
        if(null==t){
            Log.d(tag,msg);
        }else{
            Log.d(tag,msg,t);
        }
    }

    /**Verbose的日志*/
    public void v(String tag,String msg,Throwable t){
        if(!mIsDebug) return;
        if(null==t){
            Log.v(tag,msg);
        }else {
            Log.v(tag, msg, t);
        }
    }

    /**info的日志*/
    public void i(String tag,String msg,Throwable t){
        if(!mIsDebug) return;
        if(null==t){
            Log.i(tag,msg);
        }else {
            Log.i(tag, msg, t);
        }
    }

    /**warn的日志*/
    public void w(String tag,String msg,Throwable t){
        if(!mIsDebug) return;
        if(null==t){
            Log.w(tag,msg);
        }else {
            Log.w(tag, msg, t);
        }
    }

    /**error的日志*/
    public void e(String tag,String msg,Throwable t){
        if(!mIsDebug) return;
        if(null==t){
            Log.e(tag,msg);
        }else {
            Log.e(tag, msg, t);
        }
    }

    /**asset的日志:错误严重到可能会把程序崩溃*/
    public void wtf(String tag,String msg,Throwable t){
        if(!mIsDebug) return;
        if(null==t){
            Log.wtf(tag,msg);
        }else if(TextUtils.isEmpty(msg)){
            Log.wtf(tag, t);
        }else {
            Log.wtf(tag, msg,t);
        }
    }
}
