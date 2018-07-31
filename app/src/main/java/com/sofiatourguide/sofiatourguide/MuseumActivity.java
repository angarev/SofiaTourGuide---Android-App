package com.sofiatourguide.sofiatourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MuseumActivity extends AppCompatActivity {

    ListView list;
    String[] itemname = {
            "National History Museum",
            "St. Sophia Basilica",
            "National Gallery",
            "National Archaeological Museum",
            "Earth and Man National Museum",
            "National Museum of Military History",
            "Museum of Socialist Art",
            "Museum of Contemporary Art"
    };
    String[] description = {
            "Open: 9 am - 6 pm",
            "Open: 10 am - 5 pm",
            "Open: 10 am - 6 pm",
            "Open: 10 am - 6 pm",
            "Open: 10 am - 6 pm",
            "Open: 10 am - 6 pm",
            "Open: 10 am - 6 pm",
            "Open: 10 am - 6 pm"
    };
    Integer[] imgid = {
            R.drawable.nim,
            R.drawable.atraction_main,
            R.drawable.palace,
            R.drawable.archaeological,
            R.drawable.earth,
            R.drawable.military,
            R.drawable.socialist,
            R.drawable.contemporary
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CustomListAdapter adapter = new CustomListAdapter(this, itemname, imgid, description);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,  int position, long id) {

                String Selected = itemname[+position];
                Toast.makeText(getApplicationContext(), Selected, Toast.LENGTH_SHORT).show();

                switch (position) {
                    case 0:
                        Intent i = new Intent(getApplicationContext(), NimActivity.class);
                        i.putExtra("id", position);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 = new Intent(getApplicationContext(), BasilicaActivity.class);
                        i1.putExtra("id", position);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 = new Intent(getApplicationContext(), EthnographicInstituteActivity.class);
                        i2.putExtra("id", position);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(getApplicationContext(), NationalArchaeologicalMuseumActivity.class);
                        i3.putExtra("id", position);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 = new Intent(getApplicationContext(), EarthAndManMuseumActivity.class);
                        i4.putExtra("id", position);
                        startActivity(i4);
                        break;
                    case 5:
                        Intent i5 = new Intent(getApplicationContext(), MilitaryHistoryActivity.class);
                        i5.putExtra("id", position);
                        startActivity(i5);
                        break;
                    case 6:
                        Intent i6 = new Intent(getApplicationContext(), SocialistArtActivity.class);
                        i6.putExtra("id", position);
                        startActivity(i6);
                        break;
                    case 7:
                        Intent i7 = new Intent(getApplicationContext(), ContemporaryArtActivity.class);
                        i7.putExtra("id", position);
                        startActivity(i7);
                        break;
                }

            }
        });
    }

}
