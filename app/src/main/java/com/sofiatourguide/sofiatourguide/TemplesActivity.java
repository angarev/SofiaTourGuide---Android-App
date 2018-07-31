package com.sofiatourguide.sofiatourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class TemplesActivity extends AppCompatActivity {
    ListView list;
    String[] itemname = {
            "St. Aleksander Nevski Cathedral",
            "Banya-Bashi Mosque",
            "Boyana Church",
            "Cathedral of St. Joseph ",
            "St. Nedelya Church",
            "Russian Church",
            "Sofia Synagogue",
            "St. Sophia Church",
            "Rotunda of St. George ",
            "Church of St. Paraskeva ",
            "Romanian Orthodox Church"
    };
    String[] description = {
            "Open: 7 am - 5:30 pm",
            "Open: ----",
            "Open: 9 am - 5:30 pm",
            "Open: 7 am - 5:30 pm",
            "Open: 7 am - 5:30 pm",
            "Open: 7 am - 5:30 pm",
            "Open: ----",
            "Open: 9 am - 7 pm",
            "Open: 7 am - 5:30 pm",
            "Open: 7 am - 5:30 pm",
            "Open: 7 am - 5:30 pm"
    };
    Integer[] imgid = {
            R.drawable.nevsky,
            R.drawable.bashi,
            R.drawable.boyana,
            R.drawable.catedral,
            R.drawable.nedelya,
            R.drawable.russian,
            R.drawable.synagogue,
            R.drawable.sofia,
            R.drawable.george,
            R.drawable.paraskeva,
            R.drawable.romanian
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temples);
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
                        Intent i = new Intent(getApplicationContext(), AlexanderNevskyActivity.class);
                        i.putExtra("id", position);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 = new Intent(getApplicationContext(), BashiMosqueActivity.class);
                        i1.putExtra("id", position);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 = new Intent(getApplicationContext(), BoyanaChurchActivity.class);
                        i2.putExtra("id", position);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(getApplicationContext(), CathedralActivity.class);
                        i3.putExtra("id", position);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 = new Intent(getApplicationContext(), NedelyaChurchActivity.class);
                        i4.putExtra("id", position);
                        startActivity(i4);
                        break;
                    case 5:
                        Intent i5 = new Intent(getApplicationContext(), RussianChurchActivity.class);
                        i5.putExtra("id", position);
                        startActivity(i5);
                        break;
                    case 6:
                        Intent i6 = new Intent(getApplicationContext(), SofiaSynagogueActivity.class);
                        i6.putExtra("id", position);
                        startActivity(i6);
                        break;
                    case 7:
                        Intent i7 = new Intent(getApplicationContext(), SophiaChurchActivity.class);
                        i7.putExtra("id", position);
                        startActivity(i7);
                        break;
                    case 8:
                        Intent i8 = new Intent(getApplicationContext(), GeorgeActivity.class);
                        i8.putExtra("id", position);
                        startActivity(i8);
                        break;
                    case 9:
                        Intent i9 = new Intent(getApplicationContext(), ParaskevaActivity.class);
                        i9.putExtra("id", position);
                        startActivity(i9);
                        break;
                    case 10:
                        Intent i10 = new Intent(getApplicationContext(), RomanianActivity.class);
                        i10.putExtra("id", position);
                        startActivity(i10);
                        break;
                }

            }
        });
    }

}
