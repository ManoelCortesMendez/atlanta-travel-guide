package com.example.android.atlantatravelguide;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up ViewPager
        ViewPager viewPager = findViewById(R.id.view_pager);
        CategoryAdapter categoryAdapter = new CategoryAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(categoryAdapter);

        // Set up TabLayout
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setTabTextColors(Color.parseColor("#78909c"), Color.parseColor("#263238"));
        tabLayout.setupWithViewPager(viewPager);
    }
}
