package com.hbody.clock.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hbody.clock.databinding.ActivityEncourageBinding;

public class EncourageActivity extends AppCompatActivity {

    private ActivityEncourageBinding activityEncourageBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityEncourageBinding = ActivityEncourageBinding.inflate(getLayoutInflater());
        setContentView(activityEncourageBinding.getRoot());
    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}
