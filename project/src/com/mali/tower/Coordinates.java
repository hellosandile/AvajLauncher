package com.mali.avajlauncher.tower;

public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;

    public Coordinates(int longitude, int latitude, int height){
        this.longitude = longitude;
        this.latitude = latitude;
        if (height > 100){
            this.height = 100;
        }
        else{
            this.height = height;
        }

    }

    public int getLongitude(){
        return this.longitude;
    }

    public int getLatitude() {
        return this.latitude;
    }

    public int getHeight() {
        return this.height;
    }

}
