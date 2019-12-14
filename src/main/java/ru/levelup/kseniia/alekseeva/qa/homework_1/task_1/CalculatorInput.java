package ru.levelup.kseniia.alekseeva.qa.homework_1.task_1;

import java.util.Scanner;

public class CalculatorInput {
    public int processInputInteger() {
        System.out.println("Input int A");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public double processInputDouble() {
        System.out.println("Input double A");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
}
