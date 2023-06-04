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

public class HotelFragment extends Fragment {
    RecyclerView recyclerView;
    MyAdapter adapter;
    List<Word> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hotel, container, false);
        recyclerView =(RecyclerView)view.findViewById(R.id.hotelFrame);
        getList();

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new MyAdapter(getActivity(),list);
        recyclerView.setAdapter(adapter);
        return view;
    }
    private void getList() {
        list = new ArrayList<>();
        list.add(new Word("English: Can I book a room? "
                ,"Русский: Могу я забронировать номер?",R.raw.hotel1));
        list.add(new Word("English: I would like to book a single/double/triple/twin-bedded room."
                ,"Русский: Я бы хотел зарезервировать одноместный/двухместный/трехместный/с двумя кроватями номер."
                ,R.raw.hotel2));
        list.add(new Word("English: I'd like to book a room facing the sea/lake. "
                ,"Русский: Я бы хотел забронировать номер с видом на море/озеро."
                ,R.raw.hotel3));
        list.add(new Word("English: I’ll take this room for a week."
                ,"Русский: Я сниму этот номер на неделю.",R.raw.hotel4));
        list.add(new Word("English: How much is for the room including breakfast? "
                ,"Русский: Сколько стоит комната, включая завтрак?",R.raw.hotel5));
        list.add(new Word("English: Can you offer me any discount?"
                ,"Русский: Вы можете предложить мне скидку?",R.raw.hotel6));
        list.add(new Word("English: What is the total cost?"
                ,"Русский: Какова итоговая сумма к оплате?",R.raw.hotel7));

    }
}