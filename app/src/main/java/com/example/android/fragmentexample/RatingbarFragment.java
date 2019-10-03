package com.example.android.fragmentexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class RatingbarFragment extends Fragment {


    public RatingbarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View ratingBarFragment = inflater.inflate(R.layout.fragment_ratingbar, container, false);

        final RatingBar ratingBar = ratingBarFragment.findViewById(R.id.ratingBar);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getActivity(), "My rating :" + v, Toast.LENGTH_SHORT).show();
            }
        });
        return ratingBarFragment;
    }

}
