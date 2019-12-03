package ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.transport.aircrafts.Boeings;

import ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.transport.aircrafts.Flying;
import ru.levelup.kseniia.alekseeva.qa.homework_2.Airline.transport.aircrafts.Maintainable;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 * This is an Boeing737 class that implements three methods from Flying takeoff(); fly(); land ();
 * if we have time from 18 pm to 6 am night flight mode will be activated
 *it also implements Maintainable and executed checks depending on what month we have today
 */
public class Boeing737 extends Boeing implements Flying, Maintainable {

    public Boeing737() {

    }

    public void takeoff() {
        System.out.println("Load data in board computer, Execute takeoff");
    }

    public void fly() {
        System.out.println("Activate controls A, B");
        Calendar c = Calendar.getInstance();
        int time = c.get(Calendar.HOUR_OF_DAY);
        if (time < 6 || time >= 18) {
            nightFlightMode();
        }
    }

    public void land() {
        System.out.println("Landing is executed automatically");
    }

    public boolean isPreparedForDeparture() {
        System.out.println("Execute Check for 'Boeing737'");
        return true;
    }
    /**
     * The boeing passes examinations on following dates
     * January, 1
     * March, 1
     * June, 1
     * September, 1
     */
    public void passQuaterlyMaintenance() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        if (month == 1 && day == 1) {
            BoeingExamination.WINTER.passChecks();
        } else if (month == 3 && day == 1) {
            BoeingExamination.SPRING.passChecks();
        } else if (month == 6 && day == 1) {
            BoeingExamination.SUMMER.passChecks();
        } else if (month == 9 && day == 1) {
            BoeingExamination.AUTUMN.passChecks();
        } else {
            System.out.println("No checks required");
            System.out.println("Due dates for checks are  January, 1, March, 1, June, 1, September, 1");
        }

    }
}
