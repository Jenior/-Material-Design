package com.example.administrator.part1.activity;


import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.administrator.part1.R;
import com.example.administrator.part1.base.BaseActivity;

public class LearnTransitionActivity extends BaseActivity implements View.OnClickListener {
    private CardView cv1;
    private CardView cv2;
    private CardView cv3;

    @Override
    protected boolean setToolbarShow() {
        return true;
    }

    @Override
    protected int setLayout() {
        return R.layout.activity_learn_transition;
    }

    @Override
    protected void initView() {
        cv1 = (CardView) findViewById(R.id.cv_1);
        cv2 = (CardView) findViewById(R.id.cv_2);
        cv3 = (CardView) findViewById(R.id.cv_3);
        cv1.setOnClickListener(this);
        cv2.setOnClickListener(this);
        cv3.setOnClickListener(this);
    }

    @Override
    protected void setView() {
        mToolbar.setTitle(getResources().getString(R.string.part_7));
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.cv_1:
                intent = new Intent(mContext, LearnTransitionActivityB.class);
                intent.putExtra("type", "1");
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
            case R.id.cv_2:
                intent = new Intent(mContext, LearnTransitionActivityB.class);
                intent.putExtra("type", "2");
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
            case R.id.cv_3:
                intent = new Intent(mContext, LearnTransitionActivityB.class);
                intent.putExtra("type", "3");
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
        }
    }
}
