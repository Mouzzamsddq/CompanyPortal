package com.example.companyportal;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    //create reference variable of the views
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //call this method to init views
        initViews();

        //when user click on login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //temporary start another activity
                startActivity(new Intent(LoginActivity.this , HomeActivity.class));
                finish();
            }
        });

    }


    //this method used to init views
    private void initViews()
    {
        loginButton = findViewById(R.id.continueLoginButton);
    }
}