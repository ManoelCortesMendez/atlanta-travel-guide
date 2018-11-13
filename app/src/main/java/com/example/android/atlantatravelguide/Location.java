package com.example.android.atlantatravelguide;

public class Location {

    // Define member variables
    private String mName;
    private int mImageResourceId;

    // Define constructor
    public Location(String name, int imageResourceId) {
        mName = name;
        mImageResourceId = imageResourceId;
    }

    // Define methods
    public String getName() {
        return mName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
