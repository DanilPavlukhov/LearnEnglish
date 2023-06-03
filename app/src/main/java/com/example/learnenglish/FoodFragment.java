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

public class FoodFragment extends Fragment {
    RecyclerView recyclerView;
    MyAdapter adapter;
    List<Word> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_food, container, false);
        recyclerView =(RecyclerView)view.findViewById(R.id.foodFrame);
        getList();

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new MyAdapter(getActivity(),list);
        recyclerView.setAdapter(adapter);
        return view;
    }
    private void getList() {
        list = new ArrayList<>();
        list.add(new Word("English: Hello! I would like to book a table, please. "
                ,"Русский: Здравствуйте! Я бы хотел зарезервировать столик, пожалуйста."));
        list.add(new Word("English: A table for one/two/three, please."
                ,"Русский: Столик на одного/двоих/троих, пожалуйста."));
        list.add(new Word("English: meet "
                ,"Русский: мясо"));
        list.add(new Word("English: fish"
                ,"Русский: рыба"));
        list.add(new Word("English: vegetables"
                ,"Русский: овощи"));
        list.add(new Word("English: biscuit","Русский: печенье"));
        list.add(new Word("English: butter","Русский: сливочное масло"));
        list.add(new Word("English: cheese","Русский: сыр"));
        list.add(new Word("English: apple","Русский: яблоко"));
        list.add(new Word("English: banana","Русский: банан"));


    }
}