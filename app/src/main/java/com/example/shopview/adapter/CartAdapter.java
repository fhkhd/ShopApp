package com.example.shopview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopview.R;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {



    private Context context;
    private Listener listener;

    public CartAdapter(Context context , Listener listener) {
        this.context = context;
        this.listener = listener;
    }

    public interface Listener{
        void onClick(int pos);
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.cart_item,parent,false);
        CartAdapter.ViewHolder viewHolder = new CartAdapter.ViewHolder(view);
        return viewHolder;    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView cart_image_item , cansel_cart_item;

        TextView cart_title_item
                , cart_number_ordering
                , last_price_item_cart
                , main_price_item_cart;

        CardView cart_add , cart_remove ;

        public ViewHolder(View itemView) {
            super(itemView);

            cart_image_item = itemView.findViewById(R.id.cart_image_item);
            cansel_cart_item = itemView.findViewById(R.id.cansel_cart_item);
            cart_title_item = itemView.findViewById(R.id.cart_title_item);
            cart_number_ordering = itemView.findViewById(R.id.cart_number_ordering);
            last_price_item_cart = itemView.findViewById(R.id.last_price_item_cart);
            main_price_item_cart = itemView.findViewById(R.id.main_price_item_cart);
            cart_add = itemView.findViewById(R.id.cart_add);
            cart_remove = itemView.findViewById(R.id.cart_remove);

        }
    }
}
