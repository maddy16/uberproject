package com.viremp.apps.ubermanager;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.List;

/**
 * Created by Maddy on 15/06/2017.
 */

public class EventAdapter extends
        RecyclerView.Adapter<EventAdapter.MyViewHolder>{

    private List<Event> eventList;

    public EventAdapter(List<Event> eventList) {
        this.eventList = eventList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycle_list_item,parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Event event = eventList.get(position);
        holder.eventName.setText(event.getName());
        holder.eventDate.setText(event.getDate());
        holder.eventTime.setText(event.getTime());
        holder.toggleButton.setChecked(event.isScheduled());
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView eventName;
        public TextView eventDate;
        public TextView eventTime;
        public ToggleButton toggleButton;
        public MyViewHolder(View itemView) {
            super(itemView);
            eventName= (TextView) itemView.findViewById(R.id.eventName);
            eventDate= (TextView) itemView.findViewById(R.id.eventDate);
            eventTime= (TextView) itemView.findViewById(R.id.eventTime);
            toggleButton= (ToggleButton) itemView.findViewById(R.id.toggleButton);

        }
    }
}
