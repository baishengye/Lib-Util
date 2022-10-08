package com.xiaoyingbo.lib_util.BSY;

import android.text.TextUtils;

public class BSYTextUtils {
    /**判断是为空*/
    public static boolean isEmpty(String text){
        return TextUtils.isEmpty(text);
    }


    /**
     * 手机号正则表达式
     * 移动：134 135 136 137 138 139 147 150 151 152 157 158 159 178 182 183 184 187 188 198
     * 联通：130 131 132 145 155 156 166 171 175 176 185 186
     * 电信：133 149 153 173 177 180 181 189 199
     * 虚拟运营商: 170
     */
    public static final String REGEX_PHONE = "^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$";

    /**字符串是合法电话号码*/
    public static boolean isPhone(String text){
        if(isEmpty(text)) return false;
        return text.matches(REGEX_PHONE);
    }

    /**字符串是合法密码*/
    public static boolean isPassword(String text){
        if(text==null) return false;
        return text.length()>=8&&text.length()<=16;
    }

    /**两个字符串是不是一样的*/
    public static boolean equals(String textA,String textB){
        return TextUtils.equals(textA,textB);
    }


    /**
     * 邮箱正则表达式
     */
    public static final String REGEX_EMAIL = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";

    /**
     * 是否是合法邮箱
     */
    public static boolean isEmail(String value) {
        return value.matches(REGEX_EMAIL);
    }

    /**是否是合法的验证码*/
    public static boolean isCapture(String value) {
        if(value==null) return false;
        return value.length()==4;
    }
}
