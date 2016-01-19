package com.softgridtech.fragmentexample;

import android.app.Activity;
import android.support.v4.app.Fragment;
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


    }

    public void ShowFragmentOne(View view) {

        fragmentManager = (this).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FargmentOne fargmentOne = new FargmentOne();
        ;
        fragmentTransaction.add(R.id.container, fargmentOne);


        // it is used to maintain history of the state of the fragments on top of each other.
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


    }

    public void ShowFragmentTwo(View view) {

        fragmentManager = (this).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
        FragmentTwo fragmentTwo = new FragmentTwo();
        ;
        fragmentTransaction1.add(R.id.container, fragmentTwo);


        // it is used to maintain history of the state of the fragments on top of each other.
        fragmentTransaction1.addToBackStack(null);
        fragmentTransaction1.commit();


    }
}
