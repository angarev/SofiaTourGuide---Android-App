package com.sofiatourguide.sofiatourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ArchaeologicalActivity extends AppCompatActivity {

    ListView list;
    String[] itemname = {
            "Amphitheater of Serdica",
            "Ancient Serdica - East Gate",
            "Ancient Serdica - remains of the north wall",
            "Ancient Serdica - remains of the Roman city centre",
            "Ancient Serdica - Roman baths and a temple",
            "The Church St. George - Rotunda "
    };
    String[] description = {
            "Open",
            "Open",
            "Open",
            "Open",
            "Open",
            "Open"
    };
    Integer[] imgid = {
            R.drawable.serdika,
            R.drawable.serdica_east,
            R.drawable.serdica_north,
            R.drawable.serdica_centar_main,
            R.drawable.serdica_baths,
            R.drawable.george_main
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archaeological);
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
                        Intent i = new Intent(getApplicationContext(), AmphitheaterActivity.class);
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
                }

            }
        });
    }

}
