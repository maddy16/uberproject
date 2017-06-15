package com.viremp.apps.ubermanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = (RecyclerView) findViewById(R.id.recyclerView);
        String [] eventNames = {"Goto Office","Visit Market", "Goto Exhibition","Return Home"};
        String [] eventDates = {"Today","Today", "Today","Today"};
        String [] eventTimes = {"08:00 AM","11:00 AM", "02:00 PM","05:00 PM"};

        List<Event> eventList = new ArrayList<>();
        for(int i = 0;i<eventNames.length;i++){
            Event e = new Event();
            e.setName(eventNames[i]);
            e.setDate(eventDates[i]);
            e.setTime(eventTimes[i]);
            e.setScheduled(true);
            eventList.add(e);
        }
        EventAdapter ev = new EventAdapter(eventList);
        rv.setAdapter(ev);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);
    }
}
