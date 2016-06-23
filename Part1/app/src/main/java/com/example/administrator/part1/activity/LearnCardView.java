package com.example.administrator.part1.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.part1.R;
import com.example.administrator.part1.base.BaseActivity;

public class LearnCardView extends BaseActivity {

    @Override
    protected boolean setToolbarShow() {
        return true;
    }

    @Override
    protected int setLayout() {
        return R.layout.activity_learn_card_view;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void setView() {
        mToolbar.setTitle(getResources().getString(R.string.part_5));
    }
}
