package com.example.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFrag extends ListFragment {

    ItemSelected activity;

    //creating interface for communication, parses through index number
    public interface ItemSelected {
        void onItemSelected(int index);
    }

    public ListFrag() {
        // Required empty public constructor
    }
//method called when fragment has been associated with activity
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        //context referring to main activity
        activity = (ItemSelected) context;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //refers to resources folder, gets pieces data
        String [] data = getResources().getStringArray(R.array.pieces);

        //sets for list adapter and creates new array adapter with data to display
        setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data));

       //phone is in landscape mode
       if (this.getActivity().findViewById(R.id.layout_land) != null) {
           activity.onItemSelected(0);
       }

    }

    //method to know position in list that was clicked
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        //calling method and referring to main activity, parsing on position of click
        activity.onItemSelected(position);
    }

}
