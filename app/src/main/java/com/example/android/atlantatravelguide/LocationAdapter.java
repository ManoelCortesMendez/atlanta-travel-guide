package com.example.android.atlantatravelguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter {

    // Define constructor
    public LocationAdapter(Context context, ArrayList<Location> restaurants) {
        super(context, 0, restaurants);
    }

    // Define methods
    @Override
    public View getView(int position, View recycledView, ViewGroup parent) {

        // Get view...
        View locationItemView = recycledView; // ... by recycling a view from the scrap pile
        if (locationItemView == null) {
            // ... by inflating an entirely new view (when the scrap pile is empty)
            locationItemView = LayoutInflater.from(getContext()).inflate(R.layout.location_item, parent, false);
        }

        // Get current location
        Location currentLocation = (Location) getItem(position);

        // Set location image
        ImageView locationImageView = locationItemView.findViewById(R.id.location_image);
        locationImageView.setImageResource(currentLocation.getImageResourceId());

        // Set location name
        TextView locationNameView = locationItemView.findViewById(R.id.location_name);
        locationNameView.setText(currentLocation.getName());

        return locationItemView;
    }
}
