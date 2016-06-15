package com.example.administrator.part1.activity;

import android.view.View;
import android.widget.TextView;

import com.example.administrator.part1.R;
import com.example.administrator.part1.base.BaseActivity;

/**
 * Created by Administrator on 2016/6/14.
 */
public class LearnElevationActivity extends BaseActivity {
    private TextView tvAnimation;
    private boolean flag = true;

    @Override
    protected boolean setToolbarShow() {
        return true;
    }

    @Override
    protected int setLayout() {
        return R.layout.activit_learn_elevation;
    }

    @Override
    protected void initView() {
        tvAnimation = (TextView) findViewById(R.id.tv_animation);
    }

    @Override
    protected void setView() {
        mToolbar.setTitle(getResources().getString(R.string.part_2));
        tvAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag) {
                    v.animate().translationZ(100);
                    flag = false;
                } else {
                    v.animate().translationZ(0);
                    flag = true;
                }
            }
        });
    }
}
