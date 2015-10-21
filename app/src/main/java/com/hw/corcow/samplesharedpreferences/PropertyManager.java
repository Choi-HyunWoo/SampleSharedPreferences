package com.hw.corcow.samplesharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Tacademy on 2015-10-21.
 */
public class PropertyManager {

    private static PropertyManager instance;
    public static PropertyManager getInstance() {
        if (instance == null) {
            instance = new PropertyManager();
        }
        return instance;
    }

    SharedPreferences mPrefs;
    SharedPreferences.Editor mEditor;

    private PropertyManager() {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(MyApplication.getContext());
        mEditor = mPrefs.edit();
    }

    private static final String KEY_ID = "id";
    private static final String KEY_PASSWORD = "password";

    public void setID (String id) {
        mEditor.putString(KEY_ID, id);
        mEditor.commit();
    }

    public String getID () {
        return mPrefs.getString(KEY_ID, "");
    }

    public void setPassword (String password) {
        mEditor.putString(KEY_PASSWORD, password);
        mEditor.commit();
    }

    public String getPassword() {
        return mPrefs.getString(KEY_PASSWORD, "");
    }

}
