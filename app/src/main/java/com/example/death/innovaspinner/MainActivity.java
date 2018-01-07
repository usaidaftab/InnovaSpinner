package com.example.death.innovaspinner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends Activity {

    Spinner spin;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin=(Spinner)findViewById(R.id.spinner);
        final ArrayList<String> list=new ArrayList<String>();
        list.add("");
        list.add("Pakistan");
        list.add("India");
        list.add("Afghanistan");
        list.add("Canada");

        adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,list);
        spin.setAdapter(adapter);

    }
}
