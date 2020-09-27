package com.example.nicoleparsons_comp304_lab1;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class FirstFragment extends ListFragment implements AdapterView.OnItemClickListener {


    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.listItemsArray, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getActivity(), getResources().getString(R.string.onStartTop), Toast.LENGTH_SHORT).show();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getActivity(), getResources().getString(R.string.onCreateViewTop), Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position==0){
            startActivity(new Intent(getActivity(), AIActivity.class));
        }else{

                startActivity(new Intent(getActivity(), VRActivity.class));


        }
    }
}