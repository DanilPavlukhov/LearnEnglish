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


public class ShopFragment extends Fragment {
    RecyclerView recyclerView;
    MyAdapter adapter;
    List<Word> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_shop, container, false);
        recyclerView =(RecyclerView)view.findViewById(R.id.shopFrame);
        getList();

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new MyAdapter(getActivity(),list);
        recyclerView.setAdapter(adapter);
        return view;
    }
    private void getList() {
        list = new ArrayList<>();
        list.add(new Word("English: an appliance store "
                ,"Русский: магазин бытовой техники"));
        list.add(new Word("English: a bookshop"
                ,"Русский: книжный магазин"));
        list.add(new Word("English: a department store "
                ,"Русский: универмаг (продаются все товары)"));
        list.add(new Word("English: a greengrocer’s"
                ,"Русский: овощной магазин"));
        list.add(new Word("English: a grocer’s "
                ,"Русский: продуктовый магазин "));
        list.add(new Word("English: a market"
                ,"Русский: рынок"));
        list.add(new Word("English: a pet shop"
                ,"Русский: зоомагазин"));
        list.add(new Word("English: a supermarket","Русский: супермаркет"));
        list.add(new Word("English: Where is the nearest supermarket?","Русский: Где находится ближайший супермаркет?"));
        list.add(new Word("English: cash","Русский: наличные"));
        list.add(new Word("English: change","Русский: сдача"));
        list.add(new Word("English: sale","Русский: распродажа"));
        list.add(new Word("English: cheap","Русский: дешевый"));
        list.add(new Word("English: expensive","Русский: дорогой"));

    }
}