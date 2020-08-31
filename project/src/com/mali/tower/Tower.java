package com.mali.avajlauncher.tower;

import com.mali.avajlauncher.aircraft.Flyables;

import java.util.ArrayList;
import java.util.List;

public class Tower {
    private List<Flyables> observers = new ArrayList<Flyables>();

    public void register(Flyables flyables) {
        if (observers.contains(flyables)){
            return;
        }
        observers.add(flyables);

    }

    public void unregister(Flyables flyables) {
        observers.remove(flyables);
    }

    protected void conditionsChanged() {
        for (int i = 0; i < observers.size(); i++) {
            try {
                observers.get(i).updateConditions();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
