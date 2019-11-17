package ru.levelup.kseniia.alekseeva.qa.homework_1.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiplication {
    public double multiply() {
        try {
            System.out.println("Input double A");
            Scanner input = new Scanner(System.in);
            double variableA = input.nextDouble();
            System.out.println("Input double B");
            double variableB = input.nextDouble();
            return (variableA * variableB);
        } catch (InputMismatchException any) {
            throw new RuntimeException("Please check the input! Double expected!");

        }


    }
}
