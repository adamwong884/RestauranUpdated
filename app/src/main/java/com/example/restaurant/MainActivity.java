package com.example.restaurant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //if the detailcontainer is there, then that means two panes are showing
        if(findViewById(R.id.detail_container) != null){
            mTwoPane = true;
        }

        //Declaring XML
        RecyclerView mRecyclerView = findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);

        //measure dimensions of the items in the rvList
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //Calling the adapter that will populate rvList
        RecyclerView.Adapter resAdapter = new RestaurantAdapter(this, Restaurant.getRest(), mTwoPane);
        mRecyclerView.setAdapter(resAdapter);

    }
}
