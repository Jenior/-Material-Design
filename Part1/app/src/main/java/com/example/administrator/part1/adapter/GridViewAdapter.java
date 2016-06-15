package com.example.administrator.part1.adapter;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.administrator.part1.R;
import com.example.administrator.part1.base.CommonAdapter;
import com.example.administrator.part1.base.CommonViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2016/6/10.
 */
public class GridViewAdapter extends CommonAdapter<Integer> {
    private Context mContext;

    public GridViewAdapter(Context mContext, int layoutId, List<Integer> mList) {
        super(mContext, layoutId, mList);
        this.mContext = mContext;

    }

    @Override
    public void fillData(CommonViewHolder holder, int position) {
        ImageView imageView = holder.getView(R.id.iv_test);
        imageView.animate().translationZ(100);
        imageView.setImageResource(mList.get(position));
    }
}
