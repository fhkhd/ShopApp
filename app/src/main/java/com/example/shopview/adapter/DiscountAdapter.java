package com.example.shopview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import com.example.shopview.R;

public class DiscountAdapter extends RecyclerView.Adapter<DiscountAdapter.ViewHolder> {


    private Context context;
    private Listener listener;

    public DiscountAdapter(Context context , Listener listener) {
        this.context = context;
        this.listener = listener;
    }

    public interface Listener{
        void onClick(int pos);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_discount,parent,false);
        DiscountAdapter.ViewHolder viewHolder = new DiscountAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView discount_percent
                , dicounted_text_home_item;
        ImageView dicounted_image_home_item;

        public ViewHolder(View itemView) {
            super(itemView);

            discount_percent = itemView.findViewById(R.id.discount_percent);
            dicounted_text_home_item = itemView.findViewById(R.id.dicounted_text_home_item);
            dicounted_image_home_item = itemView.findViewById(R.id.dicounted_image_home_item);

        }
    }
}
