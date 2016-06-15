package com.example.administrator.part1.activity;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import android.support.v7.graphics.Palette;

import android.view.View;
import android.view.Window;

import android.widget.AdapterView;
import android.widget.GridView;


import com.example.administrator.part1.R;
import com.example.administrator.part1.adapter.GridViewAdapter;
import com.example.administrator.part1.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/6/11.
 */
public class LearnPaletteActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    private GridView        gvTest;
    private GridViewAdapter mAdapter;
    private List<Integer>   colorList;

    @Override
    protected int setLayout() {
        return R.layout.activit_learn_palette;
    }

    @Override
    protected boolean setToolbarShow() {
        return true;
    }

    @Override
    protected void initView() {
        gvTest = (GridView) findViewById(R.id.gv_test);
    }

    @Override
    protected void initData() {
        colorList = new ArrayList<>();
        colorList.add(R.mipmap.fabu_baishi);
        colorList.add(R.mipmap.fabu_bangbang);
        colorList.add(R.mipmap.fabu_bao);
        colorList.add(R.mipmap.fabu_friend);
        colorList.add(R.mipmap.fabu_loge);
        colorList.add(R.mipmap.fabu_nidongde);
        colorList.add(R.mipmap.fabu_shuoshuo);
    }

    @Override
    protected void setView() {
        initData();
        mAdapter = new GridViewAdapter(this, R.layout.item_view, colorList);
        gvTest.setAdapter(mAdapter);
        gvTest.setOnItemClickListener(this);
        mToolbar.setTitle(getResources().getString(R.string.part_1));

    }

    @Override
    public void onItemClick(AdapterView<?> parent, final View view, final int position, long id) {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), colorList.get(position));
        Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(Palette palette) {
                List<Palette.Swatch> vibrant = palette.getSwatches();
                Window               window  = getWindow();
                int                  color   = vibrant.get(0).getRgb();
                mToolbar.setBackgroundColor(color);
                window.setStatusBarColor(color);
                view.setSelected(true);
            }
        });
    }
}
