package com.example.administrator.part1.activity;


import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.view.Window;

import com.example.administrator.part1.R;
import com.example.administrator.part1.base.BaseActivity;

public class LearnTransitionActivityB extends BaseActivity {
    String type;

    @Override
    protected boolean setToolbarShow() {
        return true;
    }

    @Override
    protected int setLayout() {
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        setAnimation();
        return R.layout.activity_learn_transition_activity_b;
    }

    public void setAnimation() {
        type = getIntent().getStringExtra("type");

        switch (type) {
            case "1":
                getWindow().setEnterTransition(new Explode());
                getWindow().setExitTransition(new Explode());
                break;
            case "2":
                getWindow().setEnterTransition(new Slide());
                getWindow().setExitTransition(new Slide());
                break;
            case "3":
                getWindow().setEnterTransition(new Fade());
                getWindow().setExitTransition(new Fade());
                break;
        }
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void setView() {
        switch (type) {
            case "1":
                mToolbar.setTitle("分 解 动 画");
                break;
            case "2":
                mToolbar.setTitle("滑 动 动 画");
                break;
            case "3":
                mToolbar.setTitle("淡 出 动 画");
                break;
        }
    }
}
