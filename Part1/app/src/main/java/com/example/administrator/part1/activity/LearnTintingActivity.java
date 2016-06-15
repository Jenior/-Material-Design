package com.example.administrator.part1.activity;

import com.example.administrator.part1.R;
import com.example.administrator.part1.base.BaseActivity;

/**
 * Created by Administrator on 2016/6/14.
 */
public class LearnTintingActivity extends BaseActivity{
    @Override
    protected boolean setToolbarShow() {
        return true;
    }

    @Override
    protected int setLayout() {
        return R.layout.activit_learn_tinting;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void setView() {
        mToolbar.setTitle(getResources().getString(R.string.part_3));
    }
}
