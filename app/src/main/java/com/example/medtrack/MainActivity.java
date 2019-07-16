package com.example.medtrack;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Event> events;
    private ListView eventList;
    private FloatingActionButton createEventButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eventList = findViewById(R.id.event_list);
        createEventButton = findViewById(R.id.add_event_button);

        events = new ArrayList<>();
        events.add(new Event("empty event", "No medical events created yet", new Date()));
        EventAdapter eventListAdapter = new EventAdapter(this, R.layout.event_list_item, events);
        eventList.setAdapter(eventListAdapter);

        createEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Send to activity for creating event", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
