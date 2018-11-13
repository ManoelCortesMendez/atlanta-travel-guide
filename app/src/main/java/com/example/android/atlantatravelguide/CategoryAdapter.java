package com.example.android.atlantatravelguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    // Define constructor
    public CategoryAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    // Define methods
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new EatFragment();
            case 1:
                return new SleepFragment();
            case 2:
                return new VisitFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
