package com.example.android.atlantatravelguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    // Define constructor
    public CategoryAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    // Define methods
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new EatFragment();
            case 1:
                return new DrinkFragment();
            case 2:
                return new SleepFragment();
            case 3:
                return new VisitFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.eat);
            case 1:
                return mContext.getString(R.string.drink);
            case 2:
                return mContext.getString(R.string.sleep);
            case 3:
                return mContext.getString(R.string.visit);
        }
        return null;
    }
}
