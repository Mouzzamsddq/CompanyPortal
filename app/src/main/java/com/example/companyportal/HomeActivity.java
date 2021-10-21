package com.example.companyportal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.companyportal.Fragments.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    //reference  variable of bottom navigation menu
    private BottomNavigationView bottomNavigationView;

    //create a  fragment reference variable to show the fragment
    private Fragment selectedFragment;

    // reference variable of frame layout
    private FrameLayout fragmentContainer;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {


                case R.id.navigation_home:
                    selectedFragment = new HomeFragment();
                    break;

                case R.id.navigation_activitye:
                     break;

                case R.id.navigation_summary:

                    break;

                case R.id.navigation_calculator:
                    break;

                case R.id.navigation_trackOrders:
                    startActivity(new Intent(HomeActivity.this , AddProductsActivity.class));
                    break;

            }


            if(selectedFragment != null)
            {
                if(selectedFragment instanceof  HomeFragment ) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, selectedFragment,"home")
                            .commit();
                }
                else
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer , selectedFragment)
                            .commit();
                }
            }

            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //this method init all the views
        initViews();
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //set home fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer , new HomeFragment(),"home")
                .commit();






    }


    //this method init the views
    private void initViews()
    {
        bottomNavigationView = findViewById(R.id.bottomNavigationMenu);
        fragmentContainer = findViewById(R.id.fragmentContainer);
    }
}