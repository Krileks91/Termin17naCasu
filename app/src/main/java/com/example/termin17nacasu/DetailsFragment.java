package com.example.termin17nacasu;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.jar.Attributes;

public class DetailsFragment extends Fragment {

    private TextView tvName;
    private int id;

    public DetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvName = view.findViewById(R.id.tvName);
        setupViews();
    }
    //Dodajemo setter id
    public void setId(int id) {
        this.id = id;
    }

    private void setupViews(){
        tvName.setText(NamesProvider.getNameById(id));

    }

    //
    public void updateId(int id){
        this.id = id;
        tvName.setText(NamesProvider.getNameById(id));
    }
}