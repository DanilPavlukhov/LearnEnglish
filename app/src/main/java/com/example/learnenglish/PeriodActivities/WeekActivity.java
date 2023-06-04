package com.example.learnenglish.PeriodActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.learnenglish.PeriodFragments.WeekFragment;
import com.example.learnenglish.R;

public class WeekActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        WeekFragment weekFragment = new WeekFragment();
        ft.add(R.id.WeekFrame, weekFragment);
        ft.commit();

    }
}