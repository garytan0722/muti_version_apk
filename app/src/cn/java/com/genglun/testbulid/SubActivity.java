package com.genglun.testbulid;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by garytan on 15/8/4.
 */
public class SubActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }
}
