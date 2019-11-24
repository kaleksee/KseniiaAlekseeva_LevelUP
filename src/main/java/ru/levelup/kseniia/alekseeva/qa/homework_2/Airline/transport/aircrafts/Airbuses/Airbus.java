package ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.transport.aircrafts.Airbuses;

import ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.transport.aircrafts.Plane;

/*
 * This is Airbus class that has two methods 'autopilot' and 'touchdown' that will be used in methods fly () and land () for child classes
 */
public class Airbus extends Plane {

    void autopilot() {
        System.out.println("Executing autopilot. Pilots sleep. Plane flies");
    }

    void touchdown() {
        System.out.println("Decrease altitude. Slow down. Touch down");

    }
}
