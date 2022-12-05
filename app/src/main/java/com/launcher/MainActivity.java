package com.launcher;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(getPackageManager().getLaunchIntentForPackage("com.example"));
        finish();
    }
}