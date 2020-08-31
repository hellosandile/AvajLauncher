package com.mali.avajlauncher.aircraft;

import java.io.IOException;
import com.mali.avajlauncher.tower.WeatherTower;
public interface Flyables {
    void  updateConditions() throws IOException;

    void registerTower(WeatherTower wTower) throws IOException;
}
