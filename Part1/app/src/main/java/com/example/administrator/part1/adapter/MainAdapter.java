package com.example.administrator.part1.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.part1.R;

import java.util.List;

/**
 * Created by Administrator on 2016/6/11.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private List<String>      mList;
    private ItemClickListener onItemClickListener;

    public void setOnItemClickListener(ItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public MainAdapter(List<String> mList) {
        this.mList = mList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tvName.setText(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList != null ? mList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;

        public ViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickListener.onItemClick(getPosition());
                }
            });
        }
    }

    public interface ItemClickListener {
        void onItemClick(int position);
    }
}
