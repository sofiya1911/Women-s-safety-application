package com.example.womenssafetyapp;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.womenssafetyapp.R;
import com.example.womenssafetyapp.Task;

public class TaskViewHolder extends RecyclerView.ViewHolder {
    private TextView loctext;

    public TaskViewHolder(View itemView) {
        super(itemView);
        loctext = itemView.findViewById(R.id.loc);

    }

    public void bind(Task task) {
        loctext.setText(task.getLocation());

    }
}
