package com.sofiatourguide.sofiatourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class SquareActivity extends AppCompatActivity {
    ListView list;
    Integer[] imgid = {
            R.drawable.information,
            R.drawable.clock,
            R.drawable.credit,
            R.drawable.cellphone,
            R.drawable.map_marker,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+35929800093"));
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }

            }
        });

        final String[] items = getResources().getStringArray(R.array.square);
        NimCustomAdapter adapter = new NimCustomAdapter(this, items, imgid);
        list = (ListView) findViewById(R.id.listMuseum);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 4:
                        Intent i = new Intent(getApplicationContext(), MainmapActivity.class);
                        i.putExtra("id", position);
                        startActivity(i);
                        break;
                }

            }
        });

    }

}
