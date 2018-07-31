package com.sofiatourguide.sofiatourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class DayTripsActivity extends AppCompatActivity {

    ListView list;
    String[] itemname = {
            "1. St. Nedelya Church",
            "2. The East Gate of Serdica",
            "3. Ancient Serdica - North wall",
            "4. Ancient Serdica - remains of the Roman city centre",
            "5. Ancient Serdica - Roman baths and a temple",
            "6. The Church St. George - Rotunda",
            "7. The Royal Palace",
            "8. The building of Ivan Vazov National Theatre",
            "9. St. Sofia Church",
            "10. The St. Alexander Nevski Church"
    };
    String[] description = {
            "Open",
            "Open",
            "Open",
            "Open",
            "Open",
            "Open",
            "Open",
            "Open",
            "Open",
            "Open"
    };
    Integer[] imgid = {
            R.drawable.nedelya,
            R.drawable.serdica_east,
            R.drawable.serdica_north,
            R.drawable.serdica_centar,
            R.drawable.serdica_baths,
            R.drawable.george_main,
            R.drawable.palace_main,
            R.drawable.useinfo,
            R.drawable.sofia,
            R.drawable.nevsky
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_trips);
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
                        Intent i = new Intent(getApplicationContext(), NedelyaChurchActivity.class);
                        i.putExtra("id", position);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 = new Intent(getApplicationContext(), AncientSerdicaEastGateActivity.class);
                        i1.putExtra("id", position);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 = new Intent(getApplicationContext(), AncientSerdicaNorthWallActivity.class);
                        i2.putExtra("id", position);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(getApplicationContext(), SerdicaCityCentreActivity.class);
                        i3.putExtra("id", position);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 = new Intent(getApplicationContext(), AncientSerdicaRomanBathsActivity.class);
                        i4.putExtra("id", position);
                        startActivity(i4);
                        break;
                    case 5:
                        Intent i5 = new Intent(getApplicationContext(), GeorgeActivity.class);
                        i5.putExtra("id", position);
                        startActivity(i5);
                        break;
                    case 6:
                        Intent i6 = new Intent(getApplicationContext(), EthnographicInstituteActivity.class);
                        i6.putExtra("id", position);
                        startActivity(i6);
                        break;
                    case 7:
                        Intent i7 = new Intent(getApplicationContext(), IvanVazovActivity.class);
                        i7.putExtra("id", position);
                        startActivity(i7);
                        break;
                    case 8:
                        Intent i8 = new Intent(getApplicationContext(), SophiaChurchActivity.class);
                        i8.putExtra("id", position);
                        startActivity(i8);
                        break;
                    case 9:
                        Intent i9 = new Intent(getApplicationContext(), AlexanderNevskyActivity.class);
                        i9.putExtra("id", position);
                        startActivity(i9);
                        break;
                }

            }
        });
    }

}
