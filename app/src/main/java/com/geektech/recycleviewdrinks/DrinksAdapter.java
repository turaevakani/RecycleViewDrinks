package com.geektech.recycleviewdrinks;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DrinksAdapter extends RecyclerView.Adapter<DrinksViewHolder> {
    private ArrayList<String> drinksList;

    public DrinksAdapter(ArrayList<String> drinks) {
        this.drinksList = drinks;
    }

    @NonNull
    @Override
    public DrinksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DrinksViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_drinks,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DrinksViewHolder viewHolder, int position) {
        viewHolder.bind(drinksList.get(position));
    }

    @Override
    public int getItemCount() {
        return drinksList.size();
    }
}
