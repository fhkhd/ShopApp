package com.example.shopview.fragment;

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.appcompat.widget.SearchView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.shopview.R;


public class SearchFragment extends Fragment {

    Toolbar search_editext;
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        setSearch(view);
//        setHasOptionsMenu(true);
        setListView(view);
        return view;
    }

    private void setSearch(View view){
        search_editext = view.findViewById(R.id.search_editext);
        search_editext.setTitle("");
        search_editext.setTitleTextColor(getResources().getColor(R.color.white_back));
        ((AppCompatActivity)getActivity()).setSupportActionBar(search_editext);
//        setSupportActionBar(search_editext);
    }

    private void setListView(View view){
        listView = view.findViewById(R.id.search_history);
        String[] strings = {"کیک" , "چیبس" , "پنیر"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,strings);
        listView.setAdapter(arrayAdapter);
    }

//    @SuppressLint("ResourceAsColor")
//    @Override
//    public void onCreateOptionsMenu(Menu menu,MenuInflater inflater) {
//        inflater.inflate(R.menu.search_all,menu);
//        super.onCreateOptionsMenu(menu, inflater);
//
//        MenuItem item = menu.findItem(R.id.menu_item_search);
//        SearchView searchView = (SearchView)item.getActionView();
//        searchView.setMaxWidth(Integer.MAX_VALUE);
//        searchView.setBackground(getResources().getDrawable(R.drawable.back_search_view));
//        searchView.setGravity(View.FOCUS_RIGHT);
//        searchView.onRtlPropertiesChanged(View.LAYOUT_DIRECTION_RTL);
//
//        searchView.setElevation(10);
//        TextView searchText = (TextView) searchView.findViewById(R.id.search_src_text);
////        Typeface myCustomFont = Typeface.createFromAsset(getActivity().getAssets(), "font/iran_sans.ttf");
////        searchText.setTypeface(myCustomFont);
//
//
//
//        EditText searchEdit = ((EditText)searchView.findViewById(androidx.appcompat.R.id.search_src_text));
//        searchEdit.setTextColor(getResources().getColor(R.color.white_back));
//        searchEdit.setHintTextColor(getResources().getColor(R.color.gray));
////        searchEdit.setTypeface(myCustomFont);
//        searchEdit.setHint("جستجو..");
//        searchEdit.setTextSize(14);
//
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//            @Override
//            public boolean onQueryTextChange(String newtxt) {
////                productAdapter.getFilter().filter(newtxt);
//                return false;
//            }
//        });
//
//
//    }
}