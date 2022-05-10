package com.example.shopview.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import com.example.shopview.R;

public class GroupingHomeAdapter extends RecyclerView.Adapter<GroupingHomeAdapter.ViewHolder> {

    private Context context;
    private Listener listener;


    public GroupingHomeAdapter(Context context, Listener listener) {
        this.context = context;
        this.listener = listener;
    }

    public interface Listener{
        void onClick(int pos);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_recycler_layout,parent,false);
        GroupingHomeAdapter.ViewHolder viewHolder = new GroupingHomeAdapter.ViewHolder(view);
        return viewHolder;    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView imageGroup;
        public ViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.grouping_text_home_item);
            imageGroup = itemView.findViewById(R.id.grouping_image_home_item);

        }
    }
}
