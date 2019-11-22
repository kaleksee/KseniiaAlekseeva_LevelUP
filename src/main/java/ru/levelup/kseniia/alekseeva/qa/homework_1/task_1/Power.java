package ru.levelup.kseniia.alekseeva.qa.homework_1.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Power {
    public double raiseToPowerMath () {
        try {
            System.out.println("Input double A");
            Scanner input = new Scanner(System.in);
            double variableA = input.nextDouble();
            System.out.println("Input int B");
            int variableB = input.nextInt();
            for (int i = 1; i < variableB; i++) {
                variableA = variableA * variableA;
            }
            return variableA;
        } catch (InputMismatchException any) {
            throw new RuntimeException("Please check the input! A should be double, B should be integer!");

        }

    }
}
