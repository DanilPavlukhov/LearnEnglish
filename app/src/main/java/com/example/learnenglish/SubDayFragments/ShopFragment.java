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
                ,"Русский: магазин бытовой техники",R.raw.shop1));
        list.add(new Word("English: a bookshop"
                ,"Русский: книжный магазин",R.raw.shop2));
        list.add(new Word("English: a department store "
                ,"Русский: универмаг (продаются все товары)",R.raw.shop3));
        list.add(new Word("English: a greengrocer’s"
                ,"Русский: овощной магазин",R.raw.shop4));
        list.add(new Word("English: a grocer’s "
                ,"Русский: продуктовый магазин ",R.raw.shop5));
        list.add(new Word("English: a market"
                ,"Русский: рынок",R.raw.shop6));
        list.add(new Word("English: a pet shop"
                ,"Русский: зоомагазин",R.raw.shop7));
        list.add(new Word("English: a supermarket","Русский: супермаркет"
                ,R.raw.shop8));
        list.add(new Word("English: Where is the nearest supermarket?","Русский: Где находится ближайший супермаркет?"
                ,R.raw.shop9));
        list.add(new Word("English: cash","Русский: наличные"
                ,R.raw.shop10));
        list.add(new Word("English: change","Русский: сдача"
                ,R.raw.shop11));
        list.add(new Word("English: sale","Русский: распродажа"
                ,R.raw.shop12));
        list.add(new Word("English: cheap","Русский: дешевый"
                ,R.raw.shop13));
        list.add(new Word("English: expensive","Русский: дорогой"
                ,R.raw.shop14));

    }
}