package com.example.ankita.fav5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String hobbyName = getIntent().getStringExtra("view_name");
        String hobbyDetails = MainActivity.hobbyDetailsMap.get(hobbyName);

        displayDetails(hobbyDetails);
    }


    private void displayDetails(String message) {
        TextView detailTextView = (TextView) findViewById(R.id.detail_text_view);
        detailTextView.setText(message);
    }

}
