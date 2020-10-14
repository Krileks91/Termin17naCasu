package com.example.termin17nacasu;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MasterFragment extends Fragment {

    //Mi kuckamo:
    private ListView lvNames;
    private List<String> names;
    private OnNameClickListener listener;

    //Obavezno je da ima prazan konstruktor
    public MasterFragment() {

    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lvNames = view.findViewById(R.id.lvNames);
        setupList();
    }

    //OnCreateView nam naduvava sve
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_master, container, false);
    }
    //kada je sivo treba da uradimo set metodu da bi bila pozvana
    private void setupList(){
        names= NamesProvider.getAllNames();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
            getActivity(),
        android.R.layout.simple_list_item_1,names);
        lvNames.setAdapter(adapter);
        lvNames.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (listener != null) {
                    listener.OnNameClicked(i);
                }//else ako zelimo Toast
            }
        });
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnNameClickListener){
            listener = (OnNameClickListener) context;
        }else{
            Toast.makeText(getContext(), "Morate implementirati interfejs", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    interface OnNameClickListener {
        void OnNameClicked(int id);
    }
}