package com.example.learnenglish.PeriodActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.learnenglish.PeriodFragments.DayFragment;
import com.example.learnenglish.R;

public class DayActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        DayFragment dayFragment = new DayFragment();
        ft.add(R.id.DayFrame, dayFragment);
        ft.commit();


    }

}