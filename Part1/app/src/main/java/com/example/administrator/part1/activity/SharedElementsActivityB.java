package com.example.administrator.part1.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.part1.R;
import com.example.administrator.part1.base.BaseActivity;

public class SharedElementsActivityB extends BaseActivity {



    @Override
    protected boolean setToolbarShow() {
        return true;
    }

    @Override
    protected int setLayout() {
        return R.layout.activity_shared_elements_b;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void setView() {
        mToolbar.setTitle("共享元素展示页");
    }
}
