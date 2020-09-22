package com.example.fragmentassignment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class BottomFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bottom, container, false);
        return view;
    }

    //onStart Toast called from the bottom fragment
    @Override
    public void onStart()
    {
        super.onStart();
        //Toast.makeText(getActivity(),"onStart() is now executed from bottom fragment", Toast.LENGTH_LONG).show(); //onStart Called
    }
}