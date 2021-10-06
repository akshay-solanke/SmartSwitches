package com.dreamz.smartswitches;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;


import com.github.channguyen.rsv.RangeSliderView;

public class BathRoom extends AppCompatActivity {
    private ActionBar actionBar;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bath_room);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Bath Room");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initialization();
        setClickLitsner();

    }

    private void setClickLitsner() {



    }


    private void initialization() {

    }

    @Override
    public boolean onSupportNavigateUp()
    {
        onBackPressed();
        return true;
    }
}