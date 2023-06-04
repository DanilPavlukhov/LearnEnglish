package com.example.learnenglish.BasicActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.learnenglish.PeriodActivities.DayActivity;
import com.example.learnenglish.PeriodActivities.WeekActivity;
import com.example.learnenglish.PeriodActivities.MonthActivity;
import com.example.learnenglish.PeriodActivities.YearActivity;
import com.example.learnenglish.R;

public class MainActivity extends AppCompatActivity {
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setId();
        listener();
    }
    private void setId(){
        btn_1 =  findViewById(R.id.btn_1);
        btn_2 =  findViewById(R.id.btn_2);
        btn_3 =  findViewById(R.id.btn_3);
        btn_4 =  findViewById(R.id.btn_4);
        btn_5 =  findViewById(R.id.help);

    }
    private void listener(){
        btn_1.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, DayActivity.class));
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WeekActivity.class));
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MonthActivity.class));
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, YearActivity.class));
            }
        });
        btn_5.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse(
                    "https://t.me/+U8obC3wA3w0xZDUy"
            ));
            startActivity(intent);
        });
    }


}