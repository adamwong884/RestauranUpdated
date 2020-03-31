package com.example.restaurant;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class DetailActivity extends AppCompatActivity {

    /**DetailActivity - class for the activity_detail XML that holds the container view.
     Used when TwoPane is not true, ie. portrait mode and it will show with the recyclerview.
     Here I'll need to code the what will populate when TwoPane not true
     = detailFragment
     **/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

       if (savedInstanceState == null){
           //Bundle, passing arguments
           Bundle arguments = new Bundle();
           arguments.putString(DetailFragment.ARG_ITEM_ID, getIntent().getStringExtra(DetailFragment.ARG_ITEM_ID));
           //Fragment manager
           DetailFragment fragment = new DetailFragment();
           fragment.setArguments(arguments);
           getSupportFragmentManager()
                   .beginTransaction()
                   .add(R.id.detail_container, fragment)
                   .commit();
       }

    }
}
