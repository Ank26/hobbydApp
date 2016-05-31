package com.example.ankita.fav5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainListActivity extends AppCompatActivity {
    boolean isListView = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);
        CheckBox listViewCheckBox = (CheckBox) findViewById(R.id.listview_checkbox);
        isListView = listViewCheckBox.isChecked();
        View.OnClickListener handler = new View.OnClickListener(){

            public void onClick(View v) {
                isListView= false;
                if(!isListView){
                    Intent intentMain = new Intent(MainListActivity.this ,
                            MainActivity.class);
                    MainListActivity.this.startActivity(intentMain);
                    isListView = true;
                    Log.i("Content "," Main layout ");
                }


            }
        };
        listViewCheckBox.setOnClickListener(handler);


    }
    public void openDetail(View view){

        TextView callerTextView = (TextView) findViewById(view.getId());

        String hobbyName = callerTextView.getText().toString();
        Intent detailIntent = new Intent(getApplicationContext(), DetailActivity.class);
        detailIntent.putExtra("view_name",hobbyName);
        startActivity(detailIntent);

    }
}
