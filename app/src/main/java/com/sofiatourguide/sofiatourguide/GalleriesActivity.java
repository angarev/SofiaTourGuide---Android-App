package com.sofiatourguide.sofiatourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class GalleriesActivity extends AppCompatActivity {

    ListView list;
    String[] itemname = {
            "Crypt of St. Aleksander Nevski Cathedral",
            "National Gallery – Square 500",
            "National Art Gallery",
            "Museum of Socialist Art",
            "Museum of Contemporary Art"
    };
    String[] description = {
            "Open: 10 am - 6 pm",
            "Open: 10 am - 5 pm",
            "Open: 10 am - 6 pm",
            "Open: 10 am - 6 pm",
            "Open: 10 am - 6 pm"
    };
    Integer[] imgid = {
            R.drawable.cript,
            R.drawable.square,
            R.drawable.palace,
            R.drawable.socialist,
            R.drawable.contemporary
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galleries);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CustomListAdapter adapter = new CustomListAdapter(this, itemname, imgid, description);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String Selected = itemname[+position];
                Toast.makeText(getApplicationContext(), Selected, Toast.LENGTH_SHORT).show();

                switch (position) {
                    case 0:
                        Intent i = new Intent(getApplicationContext(), CryptActivity.class);
                        i.putExtra("id", position);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 = new Intent(getApplicationContext(), SquareActivity.class);
                        i1.putExtra("id", position);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 = new Intent(getApplicationContext(), EthnographicInstituteActivity.class);
                        i2.putExtra("id", position);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(getApplicationContext(), SocialistArtActivity.class);
                        i3.putExtra("id", position);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 = new Intent(getApplicationContext(), ContemporaryArtActivity.class);
                        i4.putExtra("id", position);
                        startActivity(i4);
                        break;
                }

            }
        });

    }

}
