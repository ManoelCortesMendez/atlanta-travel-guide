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

        // Create array list of things to do
        ArrayList<Location> visits = new ArrayList<>();

        visits.add(new Location(getString(R.string.georgia_aquarium_name), R.drawable.georgia_aquarium));
        visits.add(new Location(getString(R.string.world_of_coca_cola_name), R.drawable.world_of_coca_cola));
        visits.add(new Location(getString(R.string.atlanta_botanical_garden_name), R.drawable.atlanta_botanical_garden));

        // Display list of things to do efficiently
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), visits);
        ListView locationsList = rootView.findViewById(R.id.locations_list);
        locationsList.setAdapter(locationAdapter);

        return rootView;
    }

}