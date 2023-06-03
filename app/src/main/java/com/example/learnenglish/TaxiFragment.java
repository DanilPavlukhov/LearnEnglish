package com.example.learnenglish;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class TaxiFragment extends Fragment {
    RecyclerView recyclerView;
    MyAdapter adapter;
    List<Word> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_taxi, container, false);
        recyclerView =(RecyclerView)view.findViewById(R.id.taxiFrame);
        getList();

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new MyAdapter(getActivity(),list);
        recyclerView.setAdapter(adapter);
        return view;
    }
    private void getList() {
        list = new ArrayList<>();
        list.add(new Word("English: a vehicle "
                ,"Русский: транспортное средство"));
        list.add(new Word("English: a car"
                ,"Русский: машина"));
        list.add(new Word("English: a motorbike "
                ,"Русский: мотоцикл"));
        list.add(new Word("English: a taxi"
                ,"Русский: такси"));
        list.add(new Word("English: a subway "
                ,"Русский: метро"));
        list.add(new Word("English: a bus"
                ,"Русский: Как долго продолжается полет?"));
        list.add(new Word("English: a train"
                ,"Русский: поезд"));
        list.add(new Word("English: a railway","Русский: железнодорожный вокзал"));
        list.add(new Word("English: a bus stop","Русский: остановка автобуса"));
        list.add(new Word("English: a subway station","Русский: станция метро"));
        list.add(new Word("English: a petrol station","Русский: заправка"));
        list.add(new Word("English: a street","Русский: улица"));
        list.add(new Word("English: a bridge","Русский: мост"));
        list.add(new Word("English: traffic lights","Русский: светофор"));



    }
}