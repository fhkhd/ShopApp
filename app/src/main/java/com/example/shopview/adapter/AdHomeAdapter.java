package com.example.shopview.adapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.shopview.R;

public class AdHomeAdapter extends RecyclerView.Adapter<AdHomeAdapter.ViewHolder> {

    private Context context;
    private CircleAdAdapter.Listener listener;

    public AdHomeAdapter(Context context , CircleAdAdapter.Listener listener) {
        this.context = context;
        this.listener = listener;
    }

    public interface Listener{
        void onClick(int pos);
    }
    public AdHomeAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.ad_recycler,parent,false);
        AdHomeAdapter.ViewHolder viewHolder = new AdHomeAdapter.ViewHolder(view);
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

        ImageView imageView ;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_ad);
        }
    }
}
