package com.example.administrator.demo;

/**
 * Created by Administrator on 2018/4/16.
 */
import android.os.Bundle;
import android.preference.PreferenceFragment;
import com.example.administrator.demo.R;

/**
 * Created by Administrator on 2018/4/28 0028.
 */
class FragmentPreferences extends PreferenceFragment {
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.xml);
    }

}


