package com.example.rachidi_achraf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.rachidi_achraf.Driver;
import com.example.rachidi_achraf.R;

import java.util.List;

public class DriverAdapter extends RecyclerView.Adapter<DriverAdapter.ViewHolder> {
    private final List<Driver> mDriver;

    public DriverAdapter(List<Driver> mDriver) {
        this.mDriver = mDriver;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.driver_item, parent, false);

        return new ViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Driver driver = mDriver.get(position);
        TextView fullnameTextView = holder.fullnameTextView;
        fullnameTextView.setText(driver.getDriver().getName());
        TextView teamTextView = holder.teamTextView;
        teamTextView.setText(driver.getTeam().getName());
        TextView pointTextView = holder.pointsTextView;
        pointTextView.setText(driver.getPoints()+"pts");

    }

    @Override
    public int getItemCount() {
        return mDriver.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView fullnameTextView, teamTextView, pointsTextView;
        public ViewHolder(View itemView){
            super(itemView);

            fullnameTextView = (TextView) itemView.findViewById(R.id.full_name);
            teamTextView = (TextView) itemView.findViewById(R.id.team);
            pointsTextView = (TextView) itemView.findViewById(R.id.points);
        }
    }
}
