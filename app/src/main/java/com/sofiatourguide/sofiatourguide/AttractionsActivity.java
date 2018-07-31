package com.sofiatourguide.sofiatourguide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AttractionsActivity extends AppCompatActivity {

    private View heroImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        heroImageView = findViewById(R.id.heroImageView);


        final String[] items = getResources().getStringArray(R.array.attraction);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, R.layout.attraction_list_row, R.id.attraction_text, items);

        final ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(adapter);

        /* Inflate list header layout */
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View listHeader = inflater.inflate(R.layout.atraction_custom_header, null);
        /* Add list view header */
        lv.addHeaderView(listHeader);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                switch (position) {
                    case 1:
                        Intent i = new Intent(getApplicationContext(), MuseumActivity.class);
                        i.putExtra("id", position);
                        startActivity(i);
                        break;
                    case 2:
                        Intent i1 = new Intent(getApplicationContext(), GalleriesActivity.class);
                        i1.putExtra("id", position);
                        startActivity(i1);
                        break;
                    case 3:
                        Intent i2 = new Intent(getApplicationContext(), TemplesActivity.class);
                        i2.putExtra("id", position);
                        startActivity(i2);
                        break;
                    case 4:
                        Intent i3 = new Intent(getApplicationContext(), ArchaeologicalActivity.class);
                        i3.putExtra("id", position);
                        startActivity(i3);
                        break;
                    case 5:
                        Intent i4 = new Intent(getApplicationContext(), ArchitecturalMonumentsActivity.class);
                        i4.putExtra("id", position);
                        startActivity(i4);
                        break;
                    case 6:
                        Intent i5 = new Intent(getApplicationContext(), MonumentsActivity.class);
                        i5.putExtra("id", position);
                        startActivity(i5);
                        break;
                    case 7:
                        Intent i6 = new Intent(getApplicationContext(), SquaresActivity.class);
                        i6.putExtra("id", position);
                        startActivity(i6);
                        break;
                }
            }
        });


        lv.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

                /* Check if the first item is already reached to top.*/
                if (lv.getFirstVisiblePosition() == 0) {
                    View firstChild = lv.getChildAt(0);
                    int topY = 0;
                    if (firstChild != null) {
                        topY = firstChild.getTop();
                    }

                    /* Set the image to scroll half of the amount that of ListView */
                    heroImageView.setY(topY * 0.5f);
                }
            }
        });

    }

}
