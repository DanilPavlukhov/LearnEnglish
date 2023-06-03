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


public class HelloFragment extends Fragment {
    RecyclerView recyclerView;
    MyAdapter adapter;
    List<Word> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hello, container, false);
        recyclerView =(RecyclerView)view.findViewById(R.id.helloFrame);
        getList();

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new MyAdapter(getActivity(),list);
        recyclerView.setAdapter(adapter);
        return view;
    }
    private void getList() {
        list = new ArrayList<>();
        list.add(new Word("English: Hello! "
                ,"Русский: Здравствуйте!"));
        list.add(new Word("English: Good morning/afternoon/evening!"
                ,"Русский: Доброе утро/день/вечер!"));
        list.add(new Word("English: I am glad to see you. "
                ,"Русский: Я рад видеть вас."));
        list.add(new Word("English: How are you?"
                ,"Русский: Как ваши дела?"));
        list.add(new Word("English: What is your name? "
                ,"Русский: Как вас зовут?"));
        list.add(new Word("English: My name is Danil"
                ,"Русский: Меня зовут Данил"));
        list.add(new Word("English: Very well, thanks.","Русский: Очень хорошо, спасибо."));
        list.add(new Word("English: Good bye!","До свидания!"));


    }
}