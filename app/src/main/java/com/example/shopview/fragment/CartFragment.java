package com.example.shopview.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shopview.R;
import com.example.shopview.adapter.AdHomeAdapter;
import com.example.shopview.adapter.CartAdapter;
import com.example.shopview.adapter.CircleAdAdapter;


public class CartFragment extends Fragment {


    RecyclerView recycler_carts;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cart, container, false);
        initID(view);
        initCartRecycler();
        return view;
    }

    private void initID(View view){
        recycler_carts = view.findViewById(R.id.recycler_carts);
    }

    private void initCartRecycler(){
        recycler_carts.setLayoutManager(new LinearLayoutManager(getContext() , RecyclerView.VERTICAL , false));
        recycler_carts.setAdapter(new CartAdapter(getContext(), new CartAdapter.Listener() {
            @Override
            public void onClick(int pos) {

            }
        }));

    }

}