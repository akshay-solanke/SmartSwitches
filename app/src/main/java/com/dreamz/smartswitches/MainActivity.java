package com.dreamz.smartswitches;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.github.channguyen.rsv.RangeSliderView;

public class MainActivity extends AppCompatActivity {
    private CardView BedRoom,LivingRoom,BathRoom,KitchenRoom,StoreRoom,StudyRoom;
    private ActionBar actionBar;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initialization();
        setClickLitsner();

    }

    private void setClickLitsner() {
        BedRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),BedRoom.class));
            }
        });
        LivingRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),LivingRoom.class));
            }
        });
        BathRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BathRoom.class));
            }
        });
        StudyRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), StudyRoom.class));
            }
        });
        StoreRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), StoreRoom.class));
            }
        });
        KitchenRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Kitchen.class));
            }
        });

    }

    private void initialization() {
        BedRoom = findViewById(R.id.card_bedroom);
        LivingRoom = findViewById(R.id.card_livingroom);
        BathRoom = findViewById(R.id.card_bathroom);
        KitchenRoom = findViewById(R.id.card_kitchenroom);
        StoreRoom = findViewById(R.id.card_storeroom);
        StudyRoom = findViewById(R.id.card_studyroom);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_search) {

        }


        return super.onOptionsItemSelected(item);
    }


}