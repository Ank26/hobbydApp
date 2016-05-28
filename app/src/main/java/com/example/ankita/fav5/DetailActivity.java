package com.example.ankita.fav5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String hobbyName = getIntent().getStringExtra("view_name");
        String[] hobbyquotesArray;
        if(MainActivity.hobbyDetailsMap.containsKey(hobbyName)) {
            hobbyquotesArray = MainActivity.hobbyDetailsMap.get(hobbyName);
        }
        else{
            hobbyquotesArray =new String[]{"Topic not found"};
        }
        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.activity_listview, hobbyquotesArray);


        ListView listView = (ListView) findViewById(R.id.quotes_list);
        listView.setAdapter(adapter);
        displayTitle(hobbyName);
    }


    private void displayTitle(String message) {
        TextView titleTextView = (TextView) findViewById(R.id.title_textview);
        titleTextView.setText(message);
    }

}
