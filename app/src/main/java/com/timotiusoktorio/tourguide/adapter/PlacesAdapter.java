package com.timotiusoktorio.tourguide.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.timotiusoktorio.tourguide.R;
import com.timotiusoktorio.tourguide.model.Place;

import java.util.List;

/**
 * Created by Timotius on 2016-07-18.
 */

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.ViewHolder> {

    private List<Place> mPlaces;

    public PlacesAdapter(List<Place> places) {
        mPlaces = places;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_place, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Place place = mPlaces.get(position);
        holder.mPlaceNameTextView.setText(place.getName());
        holder.mPlaceDescriptionTextView.setText(place.getDescription());
        holder.mPlaceImageView.setImageResource(place.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return mPlaces.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView mPlaceImageView;
        TextView mPlaceNameTextView;
        TextView mPlaceDescriptionTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            mPlaceImageView = (ImageView) itemView.findViewById(R.id.place_image_view);
            mPlaceNameTextView = (TextView) itemView.findViewById(R.id.place_name_text_view);
            mPlaceDescriptionTextView = (TextView) itemView.findViewById(R.id.place_description_text_view);
        }

    }

}