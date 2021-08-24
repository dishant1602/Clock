package com.example.clock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hemantpatel.clock_library.AnalogClockView;

public class MainActivity extends AppCompatActivity {
    AnalogClockView mclockView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mclockView=findViewById(R.id.clock_view);
        mclockView.startClock();
    }
}