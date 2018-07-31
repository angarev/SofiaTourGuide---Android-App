package com.sofiatourguide.sofiatourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


public class MainActivity extends AppCompatActivity {

    public static String[] menuNameList = {
            "Useful Info",
            "Attractions",
            "Map",
            "Top 10",
            "Day Trips",
            "Metro map",
            "Offline map",
            "Contact"
    };
    public static int[] menuImages = {
            R.drawable.practical_info,
            R.drawable.attraction,
            R.drawable.ic_map_white_48dp,
            R.drawable.top,
            R.drawable.ic_walk_white_48dp,
            R.drawable.ic_train_white_48dp,
            R.drawable.offline,
            R.drawable.ic_telegram_white_48dp
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        GridView gv = (GridView) findViewById(R.id.grid);
        gv.setAdapter(new CustomGrid(this, menuNameList, menuImages));

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        Intent i = new Intent(getApplicationContext(), PracticalInformationActivity.class);
                        i.putExtra("id", position);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 = new Intent(getApplicationContext(), AttractionsActivity.class);
                        i1.putExtra("id", position);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 = new Intent(getApplicationContext(), MainmapActivity.class);
                        i2.putExtra("id", position);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(getApplicationContext(), TopTenActivity.class);
                        i3.putExtra("id", position);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 = new Intent(getApplicationContext(), DayTripsActivity.class);
                        i4.putExtra("id", position);
                        startActivity(i4);
                        break;
                    case 5:
                        Intent i5 = new Intent(getApplicationContext(), MetroMapActivity.class);
                        i5.putExtra("id", position);
                        startActivity(i5);
                        break;
                }
            }
        });

    }

}
