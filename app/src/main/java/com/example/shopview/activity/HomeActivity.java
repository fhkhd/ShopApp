package com.example.shopview.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.shopview.R;
import com.example.shopview.fragment.CartFragment;
import com.example.shopview.fragment.CategoryFragment;
import com.example.shopview.fragment.HomeFragment;
import com.example.shopview.fragment.ProfileFragment;
import com.example.shopview.fragment.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setBottomNavigationView();
    }

    private void setBottomNavigationView(){
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Fragment fragment = null;

                switch  (item.getItemId()){
                    case R.id.home_menu:
                        fragment = new HomeFragment();
                        break;
                    case R.id.search_menu:
                        fragment = new SearchFragment();
                        break;
                    case R.id.cart_menu:
                        fragment = new CartFragment();
                        break;
                    case R.id.category_menu:
                        fragment = new CategoryFragment();
                        break;
                    case R.id.profile_menu:
                        fragment = new ProfileFragment();

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment , fragment).commit();
                return true;            }
        });

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment , new HomeFragment()).commit();
        bottomNavigationView.setSelectedItemId(R.id.home_menu);
    }

}