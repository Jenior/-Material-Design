package com.example.administrator.part1.base;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.example.administrator.part1.R;

/**
 * Created by Administrator on 2016/6/11.
 */
public abstract class BaseActivity extends AppCompatActivity {
    protected Context       mContext;
    protected Toolbar       mToolbar;
    private   ToolBarHelper mToolBarHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (setToolbarShow()) {
            this.setContentView(setLayout());
        } else {
            super.setContentView(setLayout());
        }
        this.mContext = this;
        initView();
        setView();
    }

    protected abstract boolean setToolbarShow();

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        if (setToolbarViewbyId() == 0) {
            mToolBarHelper = new ToolBarHelper(this, layoutResID);
        } else {
            mToolBarHelper = new ToolBarHelper(this, layoutResID, setToolbarViewbyId());
        }
        mToolbar = mToolBarHelper.getToolBar();
        setContentView(mToolBarHelper.getContentView());
        setSupportActionBar(mToolbar);
        onCreateCustomToolBar(mToolbar);
    }
    /**
     * toolbar menu item 点击事件
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        L.d("onOptionsItemSelected----------------------------");
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case R.id.toolbar_cancel:
                finish();
                return true;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
    /**
     * @return 初始化toolbar
     */
    public void onCreateCustomToolBar(Toolbar toolbar) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            toolbar.setContentInsetsRelative(0, 0);
        }
    }

    /**
     * 传入自定义toolbar
     */
    protected int setToolbarViewbyId() {
        return 0;
    }

    /**
     * 设置布局文件
     *
     * @return layoutId
     */
    protected abstract int setLayout();

    /**
     * 初始化view
     */
    protected abstract void initView();

    /**
     * 设置view
     */
    protected abstract void setView();

    /**
     * 初始化数据
     */
    protected void initData() {
    }
}
