package com.example.admin.w3test;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddObjFragment fragment = AddObjFragment.newInstance("data1","data2","data3");

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.flFragHolder,fragment,"ADDOBJFRAGMENT")
                .commit();


    }
}
