package com.example.administrator.part1.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import com.example.administrator.part1.R;
import com.example.administrator.part1.adapter.RecyclerViewAdapter;
import com.example.administrator.part1.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class LearnRecyclerViewActivity extends BaseActivity implements RecyclerViewAdapter.ItemClickListener, View.OnClickListener {

    private RecyclerView        recyclerView;
    private Spinner             spinner;
    private Button              add;
    private Button              del;
    private RecyclerViewAdapter mAdapter;
    private String              title;
    private List<String> mList = new ArrayList<>();


    @Override
    protected boolean setToolbarShow() {
        return true;
    }

    @Override
    protected int setLayout() {
        return R.layout.activity_learn_recycler_view;
    }

    @Override
    protected void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        spinner = (Spinner) findViewById(R.id.spinner);
        add = (Button) findViewById(R.id.add);
        del = (Button) findViewById(R.id.del);
        initData();
    }

    @Override
    protected void initData() {
         title = getResources().getString(R.string.part_5);
        mList.add(title);
        mList.add(title);
        mList.add(title);
        mList.add(title);
        mList.add(title);
    }

    @Override
    protected void setView() {
        add.setOnClickListener(this);
        del.setOnClickListener(this);
        mToolbar.setTitle(getResources().getString(R.string.part_5));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        // 设置显示动画
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        mAdapter = new RecyclerViewAdapter();
        mAdapter.setmList(mList);
        mAdapter.setOnItemClickListener(this);
        recyclerView.setAdapter(mAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:// 设置为线性布局
                        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
                        break;
                    case 1:// 设置为表格布局
                        recyclerView.setLayoutManager(new GridLayoutManager(mContext, 3));
                        break;
                    case 2:
                        recyclerView.setLayoutManager(new LinearLayoutManager(mContext,LinearLayoutManager.HORIZONTAL,false));
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


    public void addRecycler() {
        mList.add(title);
        int position = mList.size();
        if (position > 0) {
          mAdapter.notifyItemInserted(position);
        }
    }

    public void delRecycler() {
        int position = mList.size();
        if (position > 0) {
            mList.remove(position - 1);
            mAdapter.notifyItemRemoved(0);
        }
    }

    @Override
    public void onItemClick(final View view, int position) {
        // 设置点击动画
        view.animate()
                .translationZ(15F).setDuration(300)
                .setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        view.animate()
                                .translationZ(1f)
                                .setDuration(500).start();
                    }
                }).start();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add:
                addRecycler();
                break;
            case R.id.del:
                delRecycler();
                break;
        }
    }
}
