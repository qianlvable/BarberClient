package com.example.shixu.barberclient;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shixu.barberclient.R;


/**
 * A simple {@link Fragment} subclass.
 *
 */
public class WelcomePagerOne extends Fragment {


    public WelcomePagerOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welcome_pager_one, container, false);
    }


}
