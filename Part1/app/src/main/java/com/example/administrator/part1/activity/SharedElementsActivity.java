package com.example.administrator.part1.activity;



import android.app.ActivityOptions;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.part1.R;
import com.example.administrator.part1.base.BaseActivity;

public class SharedElementsActivity extends BaseActivity {
     ImageView ivstart;
    @Override
    protected boolean setToolbarShow() {
        return true;
    }

    @Override
    protected int setLayout() {
        return R.layout.activity_shared_elements;
    }

    @Override
    protected void initView() {
        ivstart  = (ImageView) findViewById(R.id.iv_start);
        ivstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mContext,SharedElementsActivityB.class), ActivityOptions.makeSceneTransitionAnimation(SharedElementsActivity.this,ivstart,"test").toBundle());
            }
        });
    }

    @Override
    protected void setView() {
        mToolbar.setTitle(getResources().getString(R.string.part_8));
    }
}
