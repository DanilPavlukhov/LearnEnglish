package com.example.learnenglish.SubWeekFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.learnenglish.R;
import com.example.learnenglish.RecycleItem.MyAdapter;
import com.example.learnenglish.RecycleItem.Word;

import java.util.ArrayList;
import java.util.List;


public class FurnitureFragment extends Fragment {
    RecyclerView recyclerView;
    MyAdapter adapter;
    List<Word> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_furniture, container, false);
        recyclerView =(RecyclerView)view.findViewById(R.id.furnitureFrame);
        getList();

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new MyAdapter(getActivity(),list);
        recyclerView.setAdapter(adapter);
        return view;

    }
    private void getList() {
        list = new ArrayList<>();
        list.add(new Word("English: furniture ","Русский: мебель."
                ,R.raw.furn1));
        list.add(new Word("English: sofa","Русский: диван.",R.raw.furn2));
        list.add(new Word("English: chair "
                ,"Русский: стул."
                ,R.raw.furn3));
        list.add(new Word("English: table "
                ,"Русский: стол.",R.raw.furn4));
        list.add(new Word("English: bed  "
                ,"Русский: кровать.",R.raw.furn5));
        list.add(new Word("English: stool "
                ,"Русский: табурет.",R.raw.furn6));
        list.add(new Word("English: armchair"
                ,"Русский:  кресло.",R.raw.furn7));




    }
}