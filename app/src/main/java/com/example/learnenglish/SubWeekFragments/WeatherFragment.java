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


public class WeatherFragment extends Fragment {
    RecyclerView recyclerView;
    MyAdapter adapter;
    List<Word> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_weather, container, false);
        recyclerView =(RecyclerView)view.findViewById(R.id.weatherFrame);
        getList();

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new MyAdapter(getActivity(),list);
        recyclerView.setAdapter(adapter);
        return view;
    }
    private void getList() {
        list = new ArrayList<>();
        list.add(new Word("English: heat ","Русский: жара",R.raw.weather1
        ));
        list.add(new Word("English: shower","Русский: ливень",R.raw.weather2));
        list.add(new Word("English: icicle "
                ,"Русский: сосулька",R.raw.weather3
        ));
        list.add(new Word("English: frost "
                ,"Русский: мороз",R.raw.weather4));
        list.add(new Word("English: snowflake  "
                ,"Русский:  снежинка",R.raw.weather5));





    }
}