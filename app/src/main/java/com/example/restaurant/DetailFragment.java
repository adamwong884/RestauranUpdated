package com.example.restaurant;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



public class DetailFragment extends Fragment {
    public static final String ARG_ITEM_ID = "item_id";
    private Restaurant mRes;

    public DetailFragment() {
        // Required empty public constructor
    }

     @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            mRes = Restaurant.getRestaurant(getArguments().getString(ARG_ITEM_ID));
            this.getActivity().setTitle(mRes.getName());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

        if (mRes != null){
            ((TextView) rootView.findViewById(R.id.tvName)).setText(mRes.getName());
            ((TextView) rootView.findViewById(R.id.tvAddress)).setText(mRes.getAddress());
            ((TextView) rootView.findViewById(R.id.tvCuisine)).setText(mRes.getCuisine());
            ((TextView) rootView.findViewById(R.id.tvDescription)).setText(mRes.getReview());
            ((TextView) rootView.findViewById(R.id.tvPhone)).setText(mRes.getNumber());
            ((TextView) rootView.findViewById(R.id.tvRating)).setText(mRes.getRank());
            ((TextView) rootView.findViewById(R.id.tvStar)).setText(mRes.getStar());
            ((TextView) rootView.findViewById(R.id.tvDish)).setText(mRes.getDish());
            ((ImageView) rootView.findViewById(R.id.ivRes)).setImageResource(mRes.getImageDrawableid());
        };
            return rootView;
    }

}
