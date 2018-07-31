package com.sofiatourguide.sofiatourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class SquaresActivity extends AppCompatActivity {
    ListView list;
    String[] itemname = {
            "Lion Bridge",
            "Eagle Bridge",
            "Petko Slaveykov Square",
            "Banski Square",
            "Garibaldi Square"
    };
    String[] description = {
            "Open",
            "Open",
            "Open",
            "Open",
            "Open"
    };
    Integer[] imgid = {
            R.drawable.lion,
            R.drawable.eagle,
            R.drawable.petko,
            R.drawable.banski,
            R.drawable.garibaldi
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squares);
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
                        Intent i = new Intent(getApplicationContext(), LionBridgeActivity.class);
                        i.putExtra("id", position);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 = new Intent(getApplicationContext(), EagleActivity.class);
                        i1.putExtra("id", position);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 = new Intent(getApplicationContext(), PetkoSlaveykovActivity.class);
                        i2.putExtra("id", position);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(getApplicationContext(), BanskiSquareActivity.class);
                        i3.putExtra("id", position);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 = new Intent(getApplicationContext(), GaribaldiSquareActivity.class);
                        i4.putExtra("id", position);
                        startActivity(i4);
                        break;
                }

            }
        });
    }

}
