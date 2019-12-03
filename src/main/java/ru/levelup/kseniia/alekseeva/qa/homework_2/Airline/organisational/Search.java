package ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.organisational;

import ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.transport.aircrafts.Plane;

import java.util.TreeSet;

/**
 * This is a Sctructure class used for finding planes with certain properties
 */
public class Search {
    public void findPlanesInRangeByFlightHours(TreeSet<Plane> planes, int from, int to) {
        System.out.println("Planes, which have flight hours from " + from + " to " + to);
        int number = 0;
        for (Plane plane : planes) {
            if (plane.getFlightHours() > from && plane.getFlightHours() < to) {
                System.out.println(plane.toString() + ", flight hours " + plane.getFlightHours());
                number++;
            }
        }
        if (number == 0) {
            System.out.println("Planes, which have flight hours from " + from + " to " + to + " not found!");
        }
    }
}
