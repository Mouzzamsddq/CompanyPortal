package com.example.companyportal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class AddProductsActivity extends AppCompatActivity {

    //take toolbar object
    private Toolbar toolbar;

    //get spinner reference
    private Spinner serviceSpinner;
    private Spinner subServiceSpinner;
    private Spinner productSpinner;
    private Spinner brandSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //get the reference of the toolbar
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //set back navigation button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //this method init all the spinner
        initSpinner();

        //this method set service list item and adapter
        setUpServiceSpinner();

        //this method set subService list item and adapter
        setUpSubServiceSpinner();

        //this method set product type spinner
        setUpProductSpinner();

        //this method set brand spinner
        setUpBrandSpinner();




    }

    //method that init all the spinner
    private void initSpinner()
    {
        serviceSpinner = findViewById(R.id.serviceSpinner);
        subServiceSpinner = findViewById(R.id.subServiceSpinner);
        productSpinner = findViewById(R.id.productSpinner);
        brandSpinner = findViewById(R.id.brandSpinner);
    }

    private void setUpServiceSpinner()
    {
        //create a list that store item in service spinner
        ArrayList<String>  serviceList = new ArrayList<>();
        serviceList.add("Select Service");
        serviceList.add("Select Service");
        serviceList.add("Select Service");
        serviceList.add("Select Service");

        //create and set adapter
        ArrayAdapter serviceSpinnerAdapter = new ArrayAdapter(this, R.layout.spinner_item , serviceList);
        serviceSpinner.setAdapter(serviceSpinnerAdapter);




    }

    private void setUpSubServiceSpinner()
    {
        //create a list that store subservice item
        ArrayList<String> subServiceList = new ArrayList<>();

        //adding item
        subServiceList.add("Select Subservice");
        subServiceList.add("Select Subservice");
        subServiceList.add("Select Subservice");
        subServiceList.add("Select Subservice");

        //create and set adapter to the spinner
        ArrayAdapter subserviceSpinnerAdapter = new ArrayAdapter(this , R.layout.spinner_item , subServiceList);
        subServiceSpinner.setAdapter(subserviceSpinnerAdapter);

    }


    private void setUpProductSpinner()
    {
        //create a list that stores product Type
        ArrayList<String>  productTypeList = new ArrayList<>();

        //add item to list
        productTypeList.add("Select Product Type");
        productTypeList.add("Select Product Type");
        productTypeList.add("Select Product Type");
        productTypeList.add("Select Product Type");

        //create and set adapter
        ArrayAdapter productTypeAdapter = new ArrayAdapter(this , R.layout.spinner_item , productTypeList);
        //set adapter
        productSpinner.setAdapter(productTypeAdapter);


    }


    private void setUpBrandSpinner()
    {
        //create and add item to list which shows on brand spinner
        ArrayList<String>  brandList = new ArrayList<>();
        //add items
        brandList.add("Select Brand");
        brandList.add("Select Brand");
        brandList.add("Select Brand");
        brandList.add("Select Brand");

        //create and set item in adapter
        ArrayAdapter brandAdapter  = new ArrayAdapter(this , R.layout.spinner_item , brandList);
        //set adapter to spinner
        brandSpinner.setAdapter(brandAdapter);


    }






}