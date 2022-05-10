package com.example.shopview.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.example.shopview.R;
import com.example.shopview.adapter.AdHomeAdapter;
import com.example.shopview.adapter.CircleAdAdapter;
import com.mig35.carousellayoutmanager.CarouselLayoutManager;


public class HomeFragment extends Fragment {

    RecyclerView recyclerView_ad_img
            , recyclerView_ad_circle;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home , container , false);
        initID(view);
        initAdRecycler();



        return view;
    }

    void  initID(View view){
        recyclerView_ad_img = view.findViewById(R.id.recycler_image_ad);

        recyclerView_ad_circle = view.findViewById(R.id.recycler_circle_ad);
    }

    void initAdRecycler(){

        recyclerView_ad_img.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView_ad_img.setAdapter(new AdHomeAdapter(getContext()));

        recyclerView_ad_circle.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView_ad_img.setAdapter( new CircleAdAdapter(getContext(), new CircleAdAdapter.Listener() {
            @Override
            public void onClick(int pos) {



            }
        }));
    }
}