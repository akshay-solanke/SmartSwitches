package com.dreamz.smartswitches;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import com.github.channguyen.rsv.RangeSliderView;

import cz.msebera.android.httpclient.client.HttpClient;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import cz.msebera.android.httpclient.impl.client.DefaultHttpClient;

public class BedRoom extends AppCompatActivity {
    private ActionBar actionBar;
    Toolbar toolbar;
    CardView light1;
//    HttpClient httpClient = new DefaultHttpClient();
//    HttpPost httpPost = new HttpPost("192.168.1.200:82/L1");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bed_room);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Bed Room");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initialization();
        setClickLitsner();

    }

    private void setClickLitsner() {
    light1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            HttpClient httpClient = new DefaultHttpClient();
            HttpPost httpGet = new HttpPost("192.168.1.200:82/L1");
        }
    });


    }


    private void initialization() {
        light1 = findViewById(R.id.bed_card_light1);
    }

    @Override
    public boolean onSupportNavigateUp()
    {
        onBackPressed();
        return true;
    }
}