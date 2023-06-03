package com.example.learnenglish;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class AirportFragment extends Fragment {

    RecyclerView recyclerView;
    MyAdapter adapter;
    List<Word> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_airport, container, false);
        recyclerView =(RecyclerView)view.findViewById(R.id.airportFrame);
        getList();

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new MyAdapter(getActivity(),list);
        recyclerView.setAdapter(adapter);
        return view;

    }
    private void getList() {
        list = new ArrayList<>();
        list.add(new Word("English: I’d like to make an airline reservation. "
                ,"Русский: Я бы хотел забронировать билет на самолет."));
        list.add(new Word("English: I’d like to book a seat to Moscow"
                ,"Русский: Я бы хотел заказать билет до Москвы."));
        list.add(new Word("English: I’d like to make a reservation on the 7.45 evening flight from London to Boston. "
                ,"Русский: Я бы хотел забронировать билет на вечерний рейс из Лондона в Бостон в 19:45."));
        list.add(new Word("English: "
                ,"Русский"));
        list.add(new Word("English: "
                ,"Русский"));
        list.add(new Word("English: "
                ,"Русский"));


    }

}