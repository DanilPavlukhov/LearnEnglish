package com.example.learnenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;

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
    }


}