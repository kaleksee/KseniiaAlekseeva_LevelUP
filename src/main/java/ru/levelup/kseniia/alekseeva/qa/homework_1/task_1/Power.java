package ru.levelup.kseniia.alekseeva.qa.homework_1.task_1;

import java.util.Scanner;

public class Power {
    public double raiseToPower () {
        System.out.println("Input double A");
        Scanner input = new Scanner(System.in);
        double variableA = input.nextDouble();
        System.out.println("Input int B");
        int variableB = input.nextInt();
        for (int i = 1; i < variableB; i++) {
            variableA = variableA * variableA;
        }
        return variableA;
    }
}
