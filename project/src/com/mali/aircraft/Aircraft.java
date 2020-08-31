package com.mali.avajlauncher.aircraft;

import com.mali.avajlauncher.tower.Coordinates;

public class Aircraft {
    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private static long idCounter = 0;

    protected Aircraft (String name, Coordinates coordinates) {
        this.name = name;
        this.coordinates = coordinates;
        this.id = nextId();
    };

    private long nextId () {
        return idCounter++;

    }
}
