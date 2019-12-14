package ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.organisational;

import ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.transport.aircrafts.Plane;
import java.util.TreeSet;
/**
 * This is an Airline class that has method findPlanesInRangeByFlightHours() where we can find a plane that lies within specified range of flying hours
 *
 */
public class Airline {
    private int aircraftsNumber;
    private int pilotsNumber;

    public int getAirlineCarryingCapacity() {
        return airlineCarryingCapacity;
    }

    public void setAirlineCarryingCapacity(TreeSet<Plane> planes) {
        int temp = 0;
        for (Plane plane : planes) {
            temp = temp + plane.getCarryingCapacity();
        }
        this.airlineCarryingCapacity = temp;
    }

    private int airlineCarryingCapacity;

    public int getSeatsNumberInAllAircrafts() {
        return seatsNumberInAllAircrafts;
    }

    public void setSeatsNumberInAllAircrafts(TreeSet<Plane> planes) {
        int temp = 0;
        for (Plane plane : planes) {
            temp = temp + plane.getSeatsNumber();
        }
        this.seatsNumberInAllAircrafts = temp;
    }

    private int seatsNumberInAllAircrafts;



    public Airline (int aircraftsNumber, int pilotsNumber) {
        this.aircraftsNumber = aircraftsNumber;
        this.pilotsNumber = pilotsNumber;
    }




}
