package com.example.administrator.part1.base;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/6/10.
 */
public class CommonViewHolder {
    private SparseArray<View> mViews;
    private View              mConvertView;

    private CommonViewHolder(Context context, ViewGroup parent, int layoutId) {
        mViews = new SparseArray<>();
        mConvertView = LayoutInflater.from(context).inflate(layoutId, null);
        mConvertView.setTag(this);
    }

    public static CommonViewHolder getViewHolder(Context context, View convertView, ViewGroup parent, int layoutId) {
        if (convertView == null) {
            return new CommonViewHolder(context, parent, layoutId);
        }
        return (CommonViewHolder) convertView.getTag();
    }

    public <T extends View> T getView(int viewId) {
        View item = mViews.get(viewId);
        if (item == null) {
            item = mConvertView.findViewById(viewId);
            mViews.put(viewId, item);
        }
        return (T) item;
    }

    public View getmConvertView() {
        return mConvertView;
    }
}

