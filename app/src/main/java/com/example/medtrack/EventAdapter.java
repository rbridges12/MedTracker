package com.example.medtrack;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.List;

public class EventAdapter extends ArrayAdapter<Event> {

    private int resourceLayout;
    private Context context;

    public EventAdapter(Context context, int resource, List<Event> events) {
        super(context, resource, events);
        this.resourceLayout = resource;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup container) {

        View v = convertView;

        if (v == null) {
            v = LayoutInflater.from(context).inflate(resourceLayout, container, false);
        }

        Event event = getItem(position);
        TextView eventName = v.findViewById(R.id.event_name);
        TextView eventDate = v.findViewById((R.id.event_date));
        TextView eventDescription = v.findViewById(R.id.event_description);

        eventName.setText(event.getName());
        eventDate.setText(DateFormat.getDateTimeInstance().format(event.getDate()));
        eventDescription.setText(event.getDescription());

        return v;
    }
}
