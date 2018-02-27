package com.darwinbox.demo;

import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public abstract void fabClicked(View view);

    @Override
    public void setContentView(@LayoutRes int layoutResID) {

        RelativeLayout relativeLayout = (RelativeLayout) getLayoutInflater().inflate(R.layout.activity_base, null);
        FrameLayout frameLayout = relativeLayout.findViewById(R.id.frame);
        getLayoutInflater().inflate(layoutResID, frameLayout, true);
        super.setContentView(relativeLayout);
    }
}
