package com.example.learnenglish.SubDayFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.learnenglish.RecycleItem.MyAdapter;
import com.example.learnenglish.R;
import com.example.learnenglish.RecycleItem.Word;

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
                ,"Русский: транспортное средство",R.raw.taxi1));
        list.add(new Word("English: a car"
                ,"Русский: машина",R.raw.taxi2));
        list.add(new Word("English: a motorbike "
                ,"Русский: мотоцикл",R.raw.taxi3));
        list.add(new Word("English: a taxi"
                ,"Русский: такси",R.raw.taxi4));
        list.add(new Word("English: a subway "
                ,"Русский: метро",R.raw.taxi5));
        list.add(new Word("English: a bus"
                ,"Русский: Как долго продолжается полет?",R.raw.taxi6));
        list.add(new Word("English: a train"
                ,"Русский: поезд",R.raw.taxi7));
        list.add(new Word("English: a railway",
                "Русский: железнодорожный вокзал",R.raw.taxi8));
        list.add(new Word("English: a bus stop",
                "Русский: остановка автобуса",R.raw.taxi9));
        list.add(new Word("English: a subway station",
                "Русский: станция метро",R.raw.taxi10));
        list.add(new Word("English: a petrol station",
                "Русский: заправка",R.raw.taxi11));
        list.add(new Word("English: a street",
                "Русский: улица",R.raw.taxi12));
        list.add(new Word("English: a bridge",
                "Русский: мост",R.raw.taxi13));
        list.add(new Word("English: traffic lights",
                "Русский: светофор",R.raw.taxi14));



    }
}