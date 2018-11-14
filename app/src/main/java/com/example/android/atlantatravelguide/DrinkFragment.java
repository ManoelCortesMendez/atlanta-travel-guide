package com.example.android.atlantatravelguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class DrinkFragment extends Fragment {

    // Define constructor
    public DrinkFragment() {
        // Required empty public constructor
    }

    // Define methods
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate and set root view
        View rootView = inflater.inflate(R.layout.locations_list, container, false);

        // Create array list of bars
        ArrayList<Location> bars = new ArrayList<>();

        bars.add(new Location(getString(R.string.sports_and_social_at_battery_name), R.drawable.sports_and_social_bar));
        bars.add(new Location(getString(R.string.hampton_hudson_name), R.drawable.hampton_hudson));
        bars.add(new Location(getString(R.string.himitsu_name), R.drawable.himitsu));

        // Display list of bars efficiently
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), bars);
        ListView locationsList = rootView.findViewById(R.id.locations_list);
        locationsList.setAdapter(locationAdapter);

        return rootView;
    }

}