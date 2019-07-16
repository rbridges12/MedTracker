package com.example.medtrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Event> events;
    private ListView eventList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        events = new ArrayList<>();
        events.add(new Event("empty event", "No medical events created yet", new Date()));
        EventAdapter eventListAdapter = new EventAdapter(this, R.layout.event_list_item, events);

        eventList = (ListView)findViewById(R.id.event_list);
        eventList.setAdapter(eventListAdapter);
    }
}
