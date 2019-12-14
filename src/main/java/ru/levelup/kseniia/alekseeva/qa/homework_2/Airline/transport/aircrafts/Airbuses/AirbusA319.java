package ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.transport.aircrafts.Airbuses;

import ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.transport.aircrafts.Flying;
import ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.transport.aircrafts.Maintainable;

/**
 * This is an AirbusA319 class that implements three methods from Flying takeoff(); fly(); land ();
 * AirbusA320 amd AirbusA319 have similar realization for fly(); land (); but different implementation for takeoff();
 * it also implements two methods from Maintainable isPreparedForDeparture() and passQuaterlyMaintenance()
 */
public class AirbusA319 extends Airbus implements Maintainable, Flying {

    public AirbusA319() {

    }

    public void takeoff() {
        System.out.println("Press button A, Turn handle B, Raise lever C");
    }

    public void fly() {
        autopilot();

    }

    public void land() {
        touchdown();
    }

    public boolean isPreparedForDeparture() {
        System.out.println("Execute Check for 'Airbus A319'");
        return true;
    }

    public void passQuaterlyMaintenance() {
        if (this.getFlightHours() < 800) {
            System.out.println("Execute A Check");
        }
        if (this.getFlightHours() >= 800 && this.getFlightHours() <= 8500) {
            System.out.println("Execute B Check");
        }
        if (this.getFlightHours() > 8500) {
            System.out.println("Execute C Check");
        }

    }


}
