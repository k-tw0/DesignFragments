package com.example.designplataforms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    AdapterFragment adapterFragment;
    TabLayout TabLayout;
    ViewPager2 ViewPager2;

    private String[] titles = new String[] {"Home", "Other"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        ViewPager2 = findViewById(R.id.view_pager);
        TabLayout = findViewById(R.id.tab_layout);
        adapterFragment = new AdapterFragment(this);

        ViewPager2.setAdapter(adapterFragment);

        new TabLayoutMediator(TabLayout, ViewPager2,((tab, position) -> tab.setText(titles[position]))).attach();

    }
}