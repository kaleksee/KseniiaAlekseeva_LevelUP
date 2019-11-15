package ru.levelup.kseniia.alekseeva.qa.homework_1.task_1;

import java.util.Scanner;

public class Factorial {
    public int calculateFactorial () {
        System.out.println("Input int A");
        Scanner input = new Scanner(System.in);
        int variableA = input.nextInt();
        for (int i = 1; i <= variableA; i++) {
            variableA = variableA * i;
        }
            return variableA;
    }
}
