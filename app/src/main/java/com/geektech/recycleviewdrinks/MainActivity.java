package com.geektech.recycleviewdrinks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView drinksRecyclerView;
    private ArrayList<String> drinksList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drinksRecyclerView = findViewById(R.id.recycler_view);
        loadData();
        DrinksAdapter adapter = new DrinksAdapter(drinksList);
        drinksRecyclerView.setAdapter(adapter);
    }

    private void loadData() {
        drinksList.add("Шоро");
        drinksList.add("Love is");
        drinksList.add("Fanta");
        drinksList.add("Sprite");
        drinksList.add("Pepsi");
        drinksList.add("Coca-Cola Zero Sugar");
        drinksList.add("Maxi чай");
        drinksList.add("Fantola");
        drinksList.add("Lipton");
        drinksList.add("Мохито");
        drinksList.add("NITRO");
        drinksList.add("GORILLA");
        drinksList.add("RED BULL");

    }
}