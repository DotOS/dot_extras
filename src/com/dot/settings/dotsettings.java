package com.dot.settings;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class dotsettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pref_view);
        getFragmentManager().beginTransaction()
                .replace(R.id.pref_card0, new PrefsFragment())
                .commitAllowingStateLoss();
    }
}
