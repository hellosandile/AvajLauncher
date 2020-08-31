package com.mali.avajlauncher;

import com.mali.avajlauncher.tower.Coordinates;

public class WeatherProvider {
    private static WeatherProvider weatherProvider = new WeatherProvider();
    private static String weather[] = {"RAIN", "FOG", "SUN", "SNOW"};

    private WeatherProvider(){
    }
    public static WeatherProvider getProvider(){
        return WeatherProvider.weatherProvider;

    }

    public String getCurrentWeather(Coordinates coordinates){
        int num = coordinates.getHeight() + coordinates.getLatitude() + coordinates.getLongitude();
        return weather[num % 3];

    }
}
