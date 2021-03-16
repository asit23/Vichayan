package com.example.vichayan.Prefernces;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PreferncesUtlis {
    public static Boolean saveEmail(String email, Context context) {
        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editor.putString(Constants.KEY_EMAIL, email);
        editor.apply();
        return true;
    }

    public static Boolean saveToken(String token, Context context) {
        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editor.putString(Constants.KEY_TOKEN, token);
        editor.apply();
        return true;
    }

    public static Boolean saveName(String name, Context context) {
        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editor.putString(Constants.KEY_NAME, name);
        editor.apply();
        return true;
    }

    public static Boolean savePictureURl(String picurl, Context context) {
        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editor.putString(Constants.KEY_PROFILE_URL, picurl);
        editor.apply();
        return true;
    }

    public static String getToken(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(Constants.KEY_TOKEN, (String) null);
    }

    public static String getEmail(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(Constants.KEY_EMAIL, (String) null);
    }

    public static String getName(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(Constants.KEY_NAME, (String) null);
    }

    public static String getPicUrl(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(Constants.KEY_PROFILE_URL, (String) null);
    }

    public static Boolean deleteUser(Context context) {
        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editor.clear();
        editor.commit();
        return true;
    }
}
