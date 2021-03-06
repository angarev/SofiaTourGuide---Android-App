package com.sofiatourguide.sofiatourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class AncientSerdicaEastGateActivity extends AppCompatActivity {


    ListView list;
    Integer[] imgid = {
            R.drawable.information,
            R.drawable.map_marker,
            R.drawable.link
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ancient_serdica_east_gate);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final String[] items = getResources().getStringArray(R.array.east);
        NimCustomAdapter adapter = new NimCustomAdapter(this, items, imgid);
        list = (ListView) findViewById(R.id.listMuseum);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 1:
                        Intent i = new Intent(getApplicationContext(), MainmapActivity.class);
                        i.putExtra("id", position);
                        startActivity(i);
                        break;
                }

            }
        });
    }

}
