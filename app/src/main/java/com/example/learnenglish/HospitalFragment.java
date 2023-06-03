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


public class HospitalFragment extends Fragment {
    RecyclerView recyclerView;
    MyAdapter adapter;
    List<Word> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hospital, container, false);
        recyclerView =(RecyclerView)view.findViewById(R.id.hospitalFrame);
        getList();

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new MyAdapter(getActivity(),list);
        recyclerView.setAdapter(adapter);
        return view;
    }
    private void getList() {

        list = new ArrayList<>();
        list.add(new Word("English: When will the doctor be free? "
                ,"Русский: Когда врач будет свободен?"));
        list.add(new Word("English: I’d like to see Dr.Smith on Monday."
                ,"Русский: Я бы хотел назначить встречу с доктором Смитом в понедельник."));
        list.add(new Word("English: an allergist "
                ,"Русский: аллерголог"));
        list.add(new Word("English: a cardiologist"
                ,"Русский: кардиолог"));
        list.add(new Word("English: a dentist "
                ,"Русский: дантист"));
        list.add(new Word("English: a GP"
                ,"Русский: врач общей практики, терапевт"));
        list.add(new Word("English: an ophthalmologist"
                ,"Русский: офтальмолог"));
        list.add(new Word("English: a pediatrician"
                ,"Русский: педиатр"));
        list.add(new Word("English: a surgeon"
                ,"Русский: хирург"));


    }

}