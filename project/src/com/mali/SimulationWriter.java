package com.mali.avajlauncher;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SimulationWriter {
    public static void write(String message) throws IOException {
        PrintWriter Datawritten = new PrintWriter(new FileWriter("simulation.txt", true),true);
        Datawritten.println(message);
        Datawritten.close();
    }
}
