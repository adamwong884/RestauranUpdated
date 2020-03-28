package com.example.restaurant;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//Adapter class that populates the recyclerview, cardview with data pulled from the Restaurant class.
public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestViewHolder> {
    private MainActivity mParentActivity;
    private ArrayList<Restaurant> mRes;
    private boolean mTwoPane;
    private View.OnClickListener mOnClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Restaurant restaurant = (Restaurant) v.getTag();
            //Passing values to fragment
            if (mTwoPane) {
                Bundle arguments = new Bundle();
                arguments.putString(DetailFragment.ARG_ITEM_ID, restaurant.getRank());
                DetailFragment fragment = new DetailFragment();
                fragment.setArguments(arguments);
                mParentActivity.getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.detail_container, fragment)
                        .commit();
            } else {
                Context context = v.getContext();
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra(DetailFragment.ARG_ITEM_ID, restaurant.getRank());
                context.startActivity(intent);
            }
        }
        

    };

    public RestaurantAdapter(MainActivity parent, ArrayList<Restaurant> restaurants, boolean twoPane){
        mParentActivity = parent;
        mRes = restaurants;
        mTwoPane = twoPane;

    }

    //Declare variables in cardview
    public static class RestViewHolder extends RecyclerView.ViewHolder{
    public TextView name, rank;

    public RestViewHolder(View v){
        super(v);
        name = v.findViewById(R.id.tvName);
        rank = v.findViewById(R.id.tvRating);

    }
    }
    @NonNull
    @Override
    public RestaurantAdapter.RestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Creating view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rest_list, parent, false);
        return new RestViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RestViewHolder holder, int position) {
        //Calling the Restaurant class for data that will populate the holder

        Restaurant restAtPosition = mRes.get(position);
        //Assigning values to the holders
        holder.name.setText(restAtPosition.getName());
        holder.rank.setText(restAtPosition.getRank());
        holder.itemView.setTag(restAtPosition);
        holder.itemView.setOnClickListener(mOnClickListener);
        };

    @Override
    public int getItemCount() {
        return mRes.size();
    }
}

