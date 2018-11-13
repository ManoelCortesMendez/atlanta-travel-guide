package com.example.android.atlantatravelguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SleepFragment extends Fragment {

    // Define constructor
    public SleepFragment() {
        // Required empty public constructor
    }

    // Define methods
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate and set root view
        View rootView = inflater.inflate(R.layout.locations_list, container, false);

        // Create array list of restaurants
        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location("Solis Two Porsche Drive", R.drawable.solis_two_porsche_drive));
        locations.add(new Location("Omni Hotel at the Battery", R.drawable.omni_hotel_at_the_battery_atlanta));
        locations.add(new Location("Grand Hyatt", R.drawable.grand_hyatt_atlanta_in_buckhead));

        // Display list of restaurants efficiently
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView locationsList = rootView.findViewById(R.id.locations_list);
        locationsList.setAdapter(locationAdapter);

        return rootView;
    }

}