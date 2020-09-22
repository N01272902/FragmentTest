package com.example.fragmentassignment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class TopFragment extends ListFragment {

   String[] activity = new String[]
           {
                   "AI Activity",
                   "VR Activity"
           };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //onCreateView Toast called in fragment
       Toast.makeText(getActivity(), "onCreateView() is executed from the top fragment", Toast.LENGTH_LONG).show(); //onCreateView called

        View view = inflater.inflate(R.layout.fragment_top, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1,activity);
        setListAdapter(adapter);
        return view;

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        getListView().setSelector(android.R.color.holo_red_light);

        Intent intent;
        switch (position){
            case 0:
                intent = new Intent(getActivity(),AIActivity.class);
                startActivity(intent);
                break;

            case 1:
                intent = new Intent(getActivity(),VRActivity.class);
                startActivity(intent);
                break;

            default:
                break;
        }

    }


}