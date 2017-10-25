package com.example.androidthemdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by liuhe on 2017/10/25.
 */

public class SecondActivity extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second);
        Log.d("Test", "onCreate");


    }

    @Override
    protected void onResume() {
        super.onResume();
        finish();
    }
}
