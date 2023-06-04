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
                ,"Русский: Когда врач будет свободен?",R.raw.hospital1));
        list.add(new Word("English: I’d like to see Dr.Smith on Monday."
                ,"Русский: Я бы хотел назначить встречу с доктором Смитом в понедельник.",R.raw.hospital2));
        list.add(new Word("English: an allergist "
                ,"Русский: аллерголог",R.raw.hospital3));
        list.add(new Word("English: a cardiologist"
                ,"Русский: кардиолог",R.raw.hospital4));
        list.add(new Word("English: a dentist "
                ,"Русский: дантист",R.raw.hospita5));
        list.add(new Word("English: a GP"
                ,"Русский: врач общей практики, терапевт",R.raw.hospital6));
        list.add(new Word("English: an ophthalmologist"
                ,"Русский: офтальмолог",R.raw.hospital7));
        list.add(new Word("English: a pediatrician"
                ,"Русский: педиатр",R.raw.hospital8));
        list.add(new Word("English: a surgeon"
                ,"Русский: хирург",R.raw.hospital9));


    }

}