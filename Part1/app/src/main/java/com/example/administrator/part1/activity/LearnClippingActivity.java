package com.example.administrator.part1.activity;

import android.graphics.Outline;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.TextView;

import com.example.administrator.part1.R;
import com.example.administrator.part1.base.BaseActivity;

public class LearnClippingActivity extends BaseActivity {
    TextView textView1;
    TextView textView2;
    @Override
    protected boolean setToolbarShow() {
        return true;
    }

    @Override
    protected int setLayout() {
        return R.layout.activity_learn_clipping;
    }

    @Override
    protected void initView() {
        textView1 = (TextView) findViewById(R.id.tv_rect);
        textView2 = (TextView) findViewById(R.id.tv_circle);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //获取OutLine
        ViewOutlineProvider viewOutlineProvider1 = new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRect(0,0,view.getWidth(),view.getHeight());
            }
        };
        ViewOutlineProvider viewOutlineProvider2 = new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setOval(0,0,view.getWidth(),view.getHeight());
            }
        };
        textView1.setOutlineProvider(viewOutlineProvider1);
        textView2.setOutlineProvider(viewOutlineProvider2);
    }

    @Override
    protected void setView() {
        mToolbar.setTitle(getResources().getString(R.string.part_4));
    }
}
