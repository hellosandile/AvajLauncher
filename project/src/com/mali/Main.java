package com.mali.avajlauncher;

import com.mali.avajlauncher.aircraft.AircraftFactory;
import com.mali.avajlauncher.tower.WeatherTower;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static int positeInt;
    public static WeatherTower wTower = new WeatherTower();
    public static void main(String[] args) {
        System.out.println("Let's Begin :)\nLaunching Avaj-Launcher");
        if(args.length == 0){
            System.out.println("Invalid. You need to give me an argument.");
        }
        else{
        //Read the input file
        String textFile = args[0];
        Scanner reader = new Scanner(textFile);
        ReadFile(reader.nextLine());
        changeCondtions();
        reader.close();
        }
    }

    public static void ReadFile(String fileName) {
        AircraftFactory aircraftFactory = new AircraftFactory();

        String buf;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(fileName));
            String spaces[];
            boolean x = true;
            int y = 1;
//reading the file
            while ((buf = bReader.readLine()) != null) {
                if (x == true && y == 1) {
                    try {
                        positeInt = Integer.parseInt(buf);
                    } catch (NumberFormatException e) {
                        System.out.println("Only takes a positive interger");
                        return;
                    }
                } else {
                    spaces = buf.split(" ");
                    if (spaces.length == 1)
                        continue;
                    if (spaces.length != 5) {
                        System.out.println("5 parameter inputs expected");
                    }
                    try {
                        if (Integer.parseInt(spaces[2]) < 0 || Integer.parseInt(spaces[3]) < 0 || Integer.parseInt(spaces[4]) < 0){
                            System.out.println(("Cannot accpet negative coordinates"));
                        }
                        else{
                            aircraftFactory.newAircraft(spaces[0], spaces[1], Integer.parseInt(spaces[2]),
                               Integer.parseInt(spaces[3]), Integer.parseInt(spaces[4])).registerTower(wTower);
                        }
                                            ;
                    } catch (Exception e) {
                        System.out.println("Oops, Error.\nThis what's wrong " + buf);
                        return;
                    }
                }
                y++;
            }
        } catch (Exception e) {
            System.out.println("Oops, something went wrong reading this file");
            return;
        }
        System.out.println(".\n.\nSimulation complete!!!\n");
    }
// This is the algo that changes the weather
    public static void changeCondtions() {
        while (positeInt > 0) {
            wTower.changeWeather();
            positeInt--;
        }
    }
}