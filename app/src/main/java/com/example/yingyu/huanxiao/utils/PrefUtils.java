package com.example.yingyu.huanxiao.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by yingyu on 2016/9/1.
 */
public class PrefUtils {
    private static final String PREF_NAME = "config";

    public static void setBoolean(Context ctx, String key, boolean value) {
        SharedPreferences sp = ctx.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        sp.edit().putBoolean(key, value).commit();
    }

    public static boolean getBoolean(Context ctx, String key, boolean defaultValue) {
        SharedPreferences sp = ctx.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return sp.getBoolean(key, defaultValue);
    }
}
