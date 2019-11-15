package ru.levelup.kseniia.alekseeva.qa.homework_1.task_1;

import java.util.Scanner;

public class Addition {
    public double add() {

        System.out.println("Input double A");
        Scanner input = new Scanner(System.in);
        double variableA = input.nextDouble();
        System.out.println("Input double B");
        double variableB = input.nextDouble();
        return (variableA + variableB);
    }
}
