package com.example.learnenglish.PeriodFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.learnenglish.R;
import com.example.learnenglish.SubDayFragments.AirportFragment;
import com.example.learnenglish.SubDayFragments.FoodFragment;
import com.example.learnenglish.SubDayFragments.HelloFragment;
import com.example.learnenglish.SubDayFragments.HospitalFragment;
import com.example.learnenglish.SubDayFragments.HotelFragment;
import com.example.learnenglish.SubDayFragments.ShopFragment;
import com.example.learnenglish.SubDayFragments.TaxiFragment;
import com.example.learnenglish.SubWeekFragments.FurnitureFragment;
import com.example.learnenglish.SubWeekFragments.MuseumFragment;
import com.example.learnenglish.SubWeekFragments.ProfessionFragment;
import com.example.learnenglish.SubWeekFragments.Restaurantragment;
import com.example.learnenglish.SubWeekFragments.SportFragment;
import com.example.learnenglish.SubWeekFragments.ToolsFragment;
import com.example.learnenglish.SubWeekFragments.WeatherFragment;


public class WeekFragment extends Fragment {

    private ImageButton weatherBtn;
    private ImageButton restaurantBtn;
    private ImageButton museumBtn;
    private ImageButton sportBtn;
    private ImageButton professionsBtn;
    private ImageButton toolsBtn;
    private ImageButton furnitureBtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_week, container, false);
        weatherBtn = (ImageButton)view.findViewById(R.id.weatherBtn);
        restaurantBtn = (ImageButton)view.findViewById(R.id.restaurantBtn);
        museumBtn = (ImageButton)view.findViewById(R.id.museumBtn);
        sportBtn = (ImageButton)view.findViewById(R.id.sportBtn);
        professionsBtn  = (ImageButton)view.findViewById(R.id.professionBtn);
        toolsBtn= (ImageButton)view.findViewById(R.id.toolBtn);
        furnitureBtn = (ImageButton)view.findViewById(R.id.furnitureBtn);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        weatherBtn.setOnClickListener(v -> {
            WeatherFragment weatherFragment = new WeatherFragment();
            fragmentTransaction.hide(WeekFragment.this);
            fragmentTransaction.add(R.id.WeekFrame, weatherFragment);
            fragmentTransaction.commit();
        });

        restaurantBtn.setOnClickListener(v -> {
            Restaurantragment restaurantFragment = new Restaurantragment();
            fragmentTransaction.hide(WeekFragment.this);
            fragmentTransaction.add(R.id.WeekFrame, restaurantFragment);
            fragmentTransaction.commit();
        });
        museumBtn.setOnClickListener(v -> {
            MuseumFragment museumFragment = new MuseumFragment();
            fragmentTransaction.hide(WeekFragment.this);
            fragmentTransaction.add(R.id.WeekFrame, museumFragment);
            fragmentTransaction.commit();
        });

        sportBtn.setOnClickListener(v -> {
            SportFragment sportFragment = new SportFragment();
            fragmentTransaction.hide(WeekFragment.this);
            fragmentTransaction.add(R.id.WeekFrame, sportFragment);
            fragmentTransaction.commit();
        });
        professionsBtn.setOnClickListener(v -> {
            ProfessionFragment professionFragment = new ProfessionFragment();
            fragmentTransaction.hide(WeekFragment.this);
            fragmentTransaction.add(R.id.WeekFrame, professionFragment);
            fragmentTransaction.commit();
        });
        toolsBtn.setOnClickListener(v -> {
            ToolsFragment toolsFragment = new ToolsFragment();
            fragmentTransaction.hide(WeekFragment.this);
            fragmentTransaction.add(R.id.WeekFrame, toolsFragment);
            fragmentTransaction.commit();
        });
        furnitureBtn.setOnClickListener(v -> {
            FurnitureFragment furnitureFragment = new FurnitureFragment();
            fragmentTransaction.hide(WeekFragment.this);
            fragmentTransaction.add(R.id.WeekFrame, furnitureFragment);
            fragmentTransaction.commit();
        });
        return view;
    }
}