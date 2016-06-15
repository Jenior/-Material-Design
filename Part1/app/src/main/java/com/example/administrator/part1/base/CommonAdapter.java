package com.example.administrator.part1.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/6/10.
 */
public abstract class CommonAdapter<T> extends BaseAdapter {
    private   Context        mContext;
    private   int            layoutId;
    protected List<T>        mList;

    public CommonAdapter(Context mContext, int layoutId, List<T> mList) {
        this.mContext = mContext;
        this.layoutId = layoutId;
        this.mList = mList;
    }

    @Override
    public int getCount() {
        return this.mList == null ? 0 : mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CommonViewHolder viewHolder = CommonViewHolder.getViewHolder(mContext, convertView, parent, layoutId);
        fillData(viewHolder, position);
        return viewHolder.getmConvertView();
    }

    public abstract void fillData(CommonViewHolder holder, int position);
}
