package ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.organisational;

import ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.transport.aircrafts.Plane;
import java.util.TreeSet;
/*
 * This is an Airline class that has method findPlanesInRangeByFlightHours() where we can find a plane that lies within specified range of flying hours
 *
 */
public class Airline {
    private int aircraftsNumber;
    private int pilotsNumber;

    public int getAirlineCarryingCapacity() {
        return airlineCarryingCapacity;
    }

    public void setAirlineCarryingCapacity(int airlineCarryingCapacity) {
        this.airlineCarryingCapacity = airlineCarryingCapacity;
    }

    private int airlineCarryingCapacity;

    public int getSeatsNumberInAllAircrafts() {
        return seatsNumberInAllAircrafts;
    }

    public void setSeatsNumberInAllAircrafts(int seatsNumberInAllAircrafts) {
        this.seatsNumberInAllAircrafts = seatsNumberInAllAircrafts;
    }

    private int seatsNumberInAllAircrafts;



    public Airline (int aircraftsNumber, int pilotsNumber) {
        this.aircraftsNumber = aircraftsNumber;
        this.pilotsNumber = pilotsNumber;
    }

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
