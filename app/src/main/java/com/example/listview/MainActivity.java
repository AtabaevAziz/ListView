package com.example.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.layout.simple_list_item_1;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        ArrayList<String> posts = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            posts.add("Post " + i);
            Log.i("posts: ", posts.get(i));
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, simple_list_item_1, posts);

        listView.setAdapter(arrayAdapter);

    }
}
