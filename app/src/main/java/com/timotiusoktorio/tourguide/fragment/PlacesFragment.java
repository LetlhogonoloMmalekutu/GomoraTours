package com.timotiusoktorio.tourguide.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.timotiusoktorio.tourguide.R;
import com.timotiusoktorio.tourguide.adapter.PlacesAdapter;
import com.timotiusoktorio.tourguide.model.Place;
import com.timotiusoktorio.tourguide.helper.PlacesHelper;

import java.util.List;

/**
 * Created by Timotius on 2016-07-18.
 */

public class PlacesFragment extends Fragment {

    private static final String ARG_TOPIC = "ARG_TOPIC";

    public static PlacesFragment newInstance(String topic) {
        Bundle args = new Bundle();
        args.putString(ARG_TOPIC, topic);
        PlacesFragment placesFragment = new PlacesFragment();
        placesFragment.setArguments(args);
        return placesFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_places, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Get the list of places for the selected topic using the PlacesHelper getPlaces() method.
        List<Place> places = PlacesHelper.getPlaces(getActivity(), getArguments().getString(ARG_TOPIC));

        // Find a reference of the RecyclerView and set it up with the PlacesAdapter.
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setAdapter(new PlacesAdapter(places));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

}