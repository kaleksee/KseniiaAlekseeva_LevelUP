package ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.transport.aircrafts.Airbuses;

import ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.transport.aircrafts.Flying;
import ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.transport.aircrafts.Maintainable;

/**
 * This is an AirbusA320 class that implements three methods from Flying takeoff(); fly(); land ();
 * it also implements two methods from Maintainable isPreparedForDeparture() and passQuaterlyMaintenance()
 * AirbusA320 amd AirbusA319 have similar realization for fly(); land (); but different implementation for takeoff();
 */
public class AirbusA320 extends Airbus implements Maintainable, Flying {

    public AirbusA320() {

    }

    public void takeoff() {
        System.out.println("Set dial A to 20 degrees, Turn lever B to the right, Push button C");
    }

    public void fly() {
        autopilot();

    }

    public void land() {
        touchdown();
    }

    public boolean isPreparedForDeparture() {
        System.out.println("Execute Check for 'Airbus A320'");
        return true;
    }
    /**
     The AirbusA320 passes examinations depending on the flight hours number
     */
    public void passQuaterlyMaintenance() {
        if (this.getFlightHours() > 750 && this.getFlightHours() <= 8600) {
            System.out.println("Execute A Check");
        }
        if (this.getFlightHours() > 8600) {
            System.out.println("Execute C Check");
        }

    }
}
