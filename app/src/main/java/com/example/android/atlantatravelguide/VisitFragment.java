package com.example.android.atlantatravelguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class VisitFragment extends Fragment {

    // Define constructor
    public VisitFragment() {
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

        locations.add(new Location("Georgia Aquarium", R.drawable.georgia_aquarium));
        locations.add(new Location("World of Coca-Cola", R.drawable.world_of_coca_cola));
        locations.add(new Location("Atlanta Botanical Garden", R.drawable.atlanta_botanical_garden));

        // Display list of restaurants efficiently
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView locationsList = rootView.findViewById(R.id.locations_list);
        locationsList.setAdapter(locationAdapter);

        return rootView;
    }

}