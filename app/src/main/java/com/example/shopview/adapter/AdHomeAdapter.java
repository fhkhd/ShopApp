package com.example.shopview.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.shopview.R;

public class AdHomeAdapter extends RecyclerView.Adapter<AdHomeAdapter.ViewHolder> {

    Context context;

    public AdHomeAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_ad_img,parent,false);
        AdHomeAdapter.ViewHolder viewHolder = new AdHomeAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.imageView.setImageURI(Uri.parse("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZyxUwl8tY-5lH_JM2-3QyS5IksQYB1oVFrw&usqp=CAU"));


    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView ;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_ad);
        }
    }
}
