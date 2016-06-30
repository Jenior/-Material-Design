package com.example.administrator.part1;


import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.administrator.part1.activity.LearnCardView;
import com.example.administrator.part1.activity.LearnClippingActivity;
import com.example.administrator.part1.activity.LearnElevationActivity;
import com.example.administrator.part1.activity.LearnPaletteActivity;
import com.example.administrator.part1.activity.LearnRecyclerViewActivity;
import com.example.administrator.part1.activity.LearnTintingActivity;
import com.example.administrator.part1.activity.LearnTransitionActivity;
import com.example.administrator.part1.activity.SharedElementsActivity;
import com.example.administrator.part1.adapter.MainAdapter;
import com.example.administrator.part1.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {
    private RecyclerView recyclerView;
    private List<String> mList;
    private MainAdapter  mAdapter;

    @Override
    protected boolean setToolbarShow() {
        return true;
    }

    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        initData();
    }

    @Override
    protected void setView() {
        mToolbar.setTitle(getResources().getString(R.string.app_name));
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false));
        mAdapter = new MainAdapter(mList);
        recyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new MainAdapter.ItemClickListener() {
            @Override
            public void onItemClick(int position) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(mContext, LearnPaletteActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(mContext, LearnElevationActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(mContext, LearnTintingActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(mContext, LearnClippingActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(mContext, LearnRecyclerViewActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(mContext, LearnCardView.class));
                        break;
                    case 6:
                        startActivity(new Intent(mContext, LearnTransitionActivity.class));
                        break;
                    case 7:
                        startActivity(new Intent(mContext, SharedElementsActivity.class));
                        break;
                }
            }
        });
    }

    @Override
    protected void initData() {
        mList = new ArrayList<>();
        mList.add(getResources().getString(R.string.part_1));
        mList.add(getResources().getString(R.string.part_2));
        mList.add(getResources().getString(R.string.part_3));
        mList.add(getResources().getString(R.string.part_4));
        mList.add(getResources().getString(R.string.part_5));
        mList.add(getResources().getString(R.string.part_6));
        mList.add(getResources().getString(R.string.part_7));
        mList.add(getResources().getString(R.string.part_8));
    }
}
