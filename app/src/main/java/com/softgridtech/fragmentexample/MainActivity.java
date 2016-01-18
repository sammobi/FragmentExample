package com.softgridtech.fragmentexample;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {

    FragmentManager fragmentManager;
    Button mBtnOne, mBtnTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnOne = (Button) findViewById(R.id.btn1);
        mBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowFragmentOne(null);
            }
        });

       /* ShowFragmentOne();*/


    }

    public void ShowFragmentOne(View view) {

        fragmentManager = (this).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FargmentOne fargmentOne = new FargmentOne();
        fragmentManager.popBackStack();
        fragmentTransaction.add(R.id.container, fargmentOne);


        // it is used to maintain history of the state of the fragments on top of each other.
        fragmentTransaction.addToBackStack(null);


    }
}
