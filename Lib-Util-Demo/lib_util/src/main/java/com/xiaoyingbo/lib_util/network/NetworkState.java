package com.xiaoyingbo.lib_util.network;

import androidx.annotation.IntDef;

/**网络状态*/
@IntDef({NetworkState.NONE,NetworkState.MOBILE,NetworkState.WIFI,
        NetworkState.MOBILE_2G, NetworkState.MOBILE_3G,NetworkState.MOBILE_4G,NetworkState.MOBILE_5G})
public @interface NetworkState {
    /**无网络连接*/
    int NONE=-0x1;
    /**非移动,电信,联通运营商提供的移动信号,识别不出来是什么移动信号时*/
    int MOBILE=0x0;
    /**Wifi信号*/
    int WIFI=0x1;
    /**移动,电信,联通运营商提供的移动信号*/
    int MOBILE_2G=0x2;
    /**移动,电信,联通运营商提供的移动信号*/
    int MOBILE_3G=0x3;
    /**移动,电信,联通运营商提供的移动信号*/
    int MOBILE_4G=0x4;
    /**移动,电信,联通运营商提供的移动信号*/
    int MOBILE_5G=0x5;
}
