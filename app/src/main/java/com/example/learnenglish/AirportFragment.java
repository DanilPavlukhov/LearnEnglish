package com.example.learnenglish;

import android.content.Context;
import android.media.MediaPlayer;
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
        list.add(new Word("English: I’d like to make an airline reservation. ","Русский: Я бы хотел забронировать билет на самолет."
                ,R.raw.audio1));
        list.add(new Word("English: I’d like to book a seat to Moscow","Русский: Я бы хотел заказать билет до Москвы.",R.raw.airport1));
        list.add(new Word("English: I’d like to make a reservation on the 7.45 evening flight from London to Boston. "
                ,"Русский: Я бы хотел забронировать билет на вечерний рейс из Лондона в Бостон в 19:45.",
                R.raw.airport2));
        list.add(new Word("English: How much is an air ticket to Moscow?"
                ,"Русский: Сколько стоит билет на самолет в Москву?",R.raw.airport3));
        list.add(new Word("English: Is there any discount? "
                ,"Русский: Есть ли какие-нибудь скидки?",R.raw.airport4));
        list.add(new Word("English: How long does the flight take?"
                ,"Русский: Как долго продолжается полет?",R.raw.airport5));
        list.add(new Word("English: I’d like to check-in my luggage."
                ,"Русский: Я хочу зарегистрировать свой багаж."));
        list.add(new Word("English: May I see your passport, please?"
                ,"Русский: Ваш паспорт, пожалуйста."));



    }

}