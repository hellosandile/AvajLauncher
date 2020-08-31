package com.mali.avajlauncher.tower;

import com.mali.avajlauncher.WeatherProvider;

public class WeatherTower extends Tower {
    public String getWeather(Coordinates coordinates){
        return WeatherProvider.getProvider().getCurrentWeather(coordinates);
    }
    public void changeWeather(){
        this.conditionsChanged();
    }
}
