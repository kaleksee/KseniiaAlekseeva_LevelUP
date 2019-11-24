package ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.organisational;

import ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.transport.aircrafts.Airbuses.AirbusA319;
import ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.transport.aircrafts.Airbuses.AirbusA320;
import ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.transport.aircrafts.Boeings.Boeing737;
import ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.transport.aircrafts.Plane;

import java.util.TreeSet;

/*
 * This is the Main class where we create instances of AirbusA319, AirbusA320, Boeing737
 * we create a TreeSet of planes sorted by flying range
 * we find planes that match following range of flight hours: from 100 to 400
 */
public class Main {
    public static void main(String[] args) {
        Airline fatCat = new Airline(3, 5);

        Plane airbusA319 = new AirbusA319();
        airbusA319.setFlightHours(80);
        airbusA319.setSeatsNumber(156);
        airbusA319.setFlyingRange(3250);
        airbusA319.setCarryingCapacity(2000);
        airbusA319.setName("airbusA319");


        Plane airbusA320 = new AirbusA320();
        airbusA320.setFlightHours(120);
        airbusA320.setSeatsNumber(180);
        airbusA320.setFlyingRange(3500);
        airbusA320.setCarryingCapacity(2100);
        airbusA320.setName("airbusA320");

        Plane boeing737 = new Boeing737();
        boeing737.setFlightHours(350);
        boeing737.setSeatsNumber(156);
        boeing737.setFlyingRange(3000);
        boeing737.setCarryingCapacity(2500);
        boeing737.setName("boeing737");


        fatCat.setSeatsNumberInAllAircrafts(airbusA319.getSeatsNumber() + airbusA320.getSeatsNumber() + boeing737.getSeatsNumber());
        System.out.println("Number of seats in all aircrafts of airline 'Fat Cat' = " + fatCat.getSeatsNumberInAllAircrafts());

        fatCat.setAirlineCarryingCapacity(airbusA319.getCarryingCapacity() + airbusA320.getCarryingCapacity() + boeing737.getCarryingCapacity());
        System.out.println("Carrying capacity of airline 'Fat Cat' = " + fatCat.getAirlineCarryingCapacity() + " t");

        TreeSet<Plane> planes = new TreeSet<>();
        planes.add(airbusA319);
        planes.add(airbusA320);
        planes.add(boeing737);

        System.out.println("List of planes, sorted by flying range:");
        for (Plane plane : planes) {
            System.out.println(plane.toString() + ", Flying range " + plane.getFlyingRange());
        }

        fatCat.findPlanesInRangeByFlightHours(planes, 100, 400);

    }


}
