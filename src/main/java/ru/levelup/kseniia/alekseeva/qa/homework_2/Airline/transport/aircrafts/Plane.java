package ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.transport.aircrafts;
/*
 * This is an abstract class Plane, main class, that will be later extended by classes Airbus and Boeing
 * Class Plane implements Comparable interface, allowing to compare two planes by flying range
 */

abstract public class Plane implements Comparable<Plane> {
    private int flightHours;
    private int flyingRange;
    private int seatsNumber;
    private String name;
    private int carryingCapacity;

    public Plane() {

    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public void setFlyingRange(int flyingRange) {
        this.flyingRange = flyingRange;
    }

    public int getSeatsNumber() {
        return this.seatsNumber;
    }

    public int getFlyingRange() {
        return this.flyingRange;
    }

    public int getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(int flightHours) {
        this.flightHours = flightHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int compareTo(Plane o) {

        if (flyingRange == o.flyingRange) {
            return 0;
        } else {
            if (flyingRange > o.flyingRange) {
                return 1;
            } else {
                return -1;
            }
        }


    }

    public String toString() {
        return "Plane " + this.name;
    }
}
