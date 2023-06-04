package com.example.learnenglish.PeriodFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.learnenglish.SubDayFragments.HospitalFragment;
import com.example.learnenglish.R;
import com.example.learnenglish.SubDayFragments.AirportFragment;
import com.example.learnenglish.SubDayFragments.FoodFragment;
import com.example.learnenglish.SubDayFragments.HelloFragment;
import com.example.learnenglish.SubDayFragments.HotelFragment;
import com.example.learnenglish.SubDayFragments.ShopFragment;
import com.example.learnenglish.SubDayFragments.TaxiFragment;

public class DayFragment extends Fragment  {

    private ImageButton airportBtn;
    private ImageButton taxiBtn;
    private ImageButton hotelBtn;
    private ImageButton shopBtn;
    private ImageButton helloBtn;
    private ImageButton foodBtn;
    private ImageButton hospitalBtn;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_day, container, false);
        // Inflate the layout for this fragment

        airportBtn = (ImageButton)view.findViewById(R.id.airportBtn);
        taxiBtn = (ImageButton)view.findViewById(R.id.taxiBtn);
        shopBtn = (ImageButton)view.findViewById(R.id.shopBtn);
        helloBtn = (ImageButton)view.findViewById(R.id.helloBtn);
        hotelBtn  = (ImageButton)view.findViewById(R.id.hotelBtn);
        foodBtn= (ImageButton)view.findViewById(R.id.foodBtn);
        hospitalBtn = (ImageButton)view.findViewById(R.id.hospitalBtn);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        airportBtn.setOnClickListener(v -> {
            AirportFragment airportFragment = new AirportFragment();
            fragmentTransaction.hide(DayFragment.this);
            fragmentTransaction.add(R.id.DayFrame, airportFragment);
            fragmentTransaction.commit();
        });

        taxiBtn.setOnClickListener(v -> {
            TaxiFragment taxiFragment = new TaxiFragment();
            fragmentTransaction.hide(DayFragment.this);
            fragmentTransaction.add(R.id.DayFrame, taxiFragment);
            fragmentTransaction.commit();
        });
        shopBtn.setOnClickListener(v -> {
            ShopFragment shopFragment = new ShopFragment();
            fragmentTransaction.hide(DayFragment.this);
            fragmentTransaction.add(R.id.DayFrame, shopFragment);
            fragmentTransaction.commit();
        });

        hotelBtn.setOnClickListener(v -> {
            HotelFragment hotelFragment = new HotelFragment();
            fragmentTransaction.hide(DayFragment.this);
            fragmentTransaction.add(R.id.DayFrame, hotelFragment);
            fragmentTransaction.commit();
        });
        foodBtn.setOnClickListener(v -> {
            FoodFragment foodFragment = new FoodFragment();
            fragmentTransaction.hide(DayFragment.this);
            fragmentTransaction.add(R.id.DayFrame, foodFragment);
            fragmentTransaction.commit();
        });
        helloBtn.setOnClickListener(v -> {
            HelloFragment helloFragment = new HelloFragment();
            fragmentTransaction.hide(DayFragment.this);
            fragmentTransaction.add(R.id.DayFrame, helloFragment);
            fragmentTransaction.commit();
        });
        hospitalBtn.setOnClickListener(v -> {
            HospitalFragment hospitalFragment = new HospitalFragment();
            fragmentTransaction.hide(DayFragment.this);
            fragmentTransaction.add(R.id.DayFrame, hospitalFragment);
            fragmentTransaction.commit();
        });
        return view;


    }

}