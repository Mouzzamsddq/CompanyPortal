package com.example.companyportal.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.companyportal.AddProductsActivity;
import com.example.companyportal.R;

public class HomeFragment extends Fragment {

    //reference variable of add products relative layout
    private RelativeLayout addProductsRelativeLayout;

    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);


        //init the views
        addProductsRelativeLayout = view.findViewById(R.id.addProductsLayout);


        //when click on add products layout , add product activity will open
        addProductsRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //open add products activity
                Intent intent = new Intent(getActivity() , AddProductsActivity.class);
                startActivity(intent);

            }
        });




        return view;
    }
}