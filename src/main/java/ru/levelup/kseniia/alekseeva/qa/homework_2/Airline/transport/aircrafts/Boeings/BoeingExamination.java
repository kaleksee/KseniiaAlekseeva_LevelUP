package ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.transport.aircrafts.Boeings;


/*
 * This is an BoeingExamination class which specifies checks for Boeings depending on season of the year
 */

public enum BoeingExamination {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;

    void passChecks() {
        switch (this) {
            case WINTER:
                System.out.println("Checks for winter");
                break;
            case SPRING:
                System.out.println("Checks for spring");
                break;
            case SUMMER:
                System.out.println("Checks for summer");
                break;
            case AUTUMN:
                System.out.println("Checks for autumn");
                break;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }


}
